package com.controller.houtai;

import com.entity.Advisereview;
import com.entity.Project;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.service.AdvisereviewService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import javax.servlet.http.HttpServletRequest;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

@Controller
@RequestMapping("/advise")
public class AdvisereviewController {
    @Autowired
    private AdvisereviewService advisereviewService;
    @RequestMapping("/adviseguanli")
    public String getAdvise(
            @RequestParam(value = "pn", defaultValue = "1") Integer pn,
            Model model) {
        PageHelper.startPage(pn, 6);
        List<Advisereview> advises = advisereviewService.selectAdvise();
        PageInfo page = new PageInfo(advises, 6);
        model.addAttribute("pageInfo", page);
        return "admin/advise/advise.jsp";
    }

    @RequestMapping("/insert")
    public String insert(HttpServletRequest request){
        String content=request.getParameter("content");
        String telphone=request.getParameter("telphone");
        Advisereview advisereview=new Advisereview();
        advisereview.setContent(content);
        advisereview.setTelphone(telphone);
        advisereview.setTime(new java.sql.Date(new java.util.Date().getTime()));
        int h=advisereviewService.insert(advisereview);
        return "redirect:adviseguanli";
    }
    @RequestMapping("/searchadvise")
    public String searchadvise(@RequestParam(value = "pn", defaultValue = "1") Integer pn,
                 Model model, HttpServletRequest request) {
        String content=request.getParameter("content");
        String status=request.getParameter("status");
        request.setAttribute("content",content);
        request.setAttribute("status",status);
        List<Advisereview> searchlist ;
        PageHelper.startPage(pn, 6);
        if (" ".equals(content))
            searchlist = advisereviewService.selectAdvise();
        else
            searchlist=advisereviewService.findBycontent(content.replace("'", ""));
        PageInfo page = new PageInfo(searchlist, 6);
        model.addAttribute("searchadvise", page);
        return "admin/advise/advise1.jsp";
    }
    @RequestMapping("/countysearchadvise")
    public String countysearchadvise(@RequestParam(value = "pn", defaultValue = "1") Integer pn,
                               Model model, HttpServletRequest request)  {
        String content=request.getParameter("content");
        String status=request.getParameter("status");
        request.setAttribute("content",content);
        request.setAttribute("status",status);
        List<Advisereview> searchlist ;
        PageHelper.startPage(pn, 6);
        if(" ".equals(content)){
            if (" ".equals(status)){
                searchlist=advisereviewService.selectAdvise();
            }
            else{
                searchlist=advisereviewService.findBystatus(status.replace("'", ""));
            }
        }
        else {
            if (" ".equals(status)){

                searchlist=advisereviewService.findBycontent(content.replace("'", ""));
            }
            else {

                searchlist=advisereviewService.findBycontentandstatus(content.replace("'", ""),status.replace("'", ""));
            }
        }
        PageInfo page = new PageInfo(searchlist, 6);
        model.addAttribute("searchadvise", page);
        return "manager/advise/advise1.jsp";
    }

    @RequestMapping("countyguanli")
    public String getcountyAdvise(
            @RequestParam(value = "pn", defaultValue = "1") Integer pn,
            Model model) {
        PageHelper.startPage(pn, 6);
        List<Advisereview> advises = advisereviewService.selectAdvise();
        PageInfo page = new PageInfo(advises, 6);
        model.addAttribute("pageInfo", page);
        return "manager/advise/advise.jsp";
    }

}
