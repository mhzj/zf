package com.controller.houtai;

import com.entity.Waitdo;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.service.WaitdoService;
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
@RequestMapping("/waitdo")
public class WaitdoController {
    @Autowired
    private WaitdoService waitdoService;
    @RequestMapping("/waitdoguanli")
    public String getWaitdo(@RequestParam(value = "pn", defaultValue = "1") Integer pn,
            Model model) {
        PageHelper.startPage(pn, 6);
        List<Waitdo> waitdos = waitdoService.selectWaitdo();
        PageInfo page = new PageInfo(waitdos, 6);
        model.addAttribute("pageInfo", page);
        return "admin/waitdo/waitdo.jsp";
    }
    @RequestMapping("/searchwaitdo")
    public String searchwaitdo(@RequestParam(value = "pn", defaultValue = "1") Integer pn,
                               Model model, HttpServletRequest request){
        String content=request.getParameter("content");
        request.setAttribute("content",content);
        List<Waitdo> searchlist ;
        PageHelper.startPage(pn, 6);
        if ("".equals(content))
                searchlist=waitdoService.selectWaitdo();
        else
            searchlist=waitdoService.findBycontent(content);
        PageInfo page = new PageInfo(searchlist, 6);
        model.addAttribute("searchwaitdo", page);
        return "admin/waitdo/waitdo1.jsp";
    }
}
