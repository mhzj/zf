package com.controller.houtai;

import com.entity.Project;
import com.entity.Rollplan;
import com.entity.Yearplan;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.service.ProjectService;
import com.service.RollplanService;
import com.service.YearplanService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import javax.servlet.http.HttpServletRequest;
import java.util.List;

@Controller
@RequestMapping("/yearplan")
public class YearplanController {
    @Autowired
    private YearplanService yearplanService;
    @Autowired
    private RollplanService rollplanService;
    @Autowired
    private ProjectService projectService;
    @RequestMapping("/bianzhiguanli")
    public String getYearplan(
            @RequestParam(value = "pn", defaultValue = "1") Integer pn,
            Model model) {
        PageHelper.startPage(pn, 6);
        List<Yearplan> yearplans = yearplanService.findByplanstatusandreceiveunit("已编制","县发改");
        PageInfo page = new PageInfo(yearplans, 6);
        model.addAttribute("pageInfo", page);
        return "manager/yearplan/yearplaninfo.jsp";
    }
    @RequestMapping("/citybianzhiguanli")
    public String citybianzhiguanli(
            @RequestParam(value = "pn", defaultValue = "1") Integer pn,
            Model model) {
        PageHelper.startPage(pn, 6);
        List<Yearplan> yearplans = yearplanService.findByplanstatusandreceiveunit("已编制","市发改");
        PageInfo page = new PageInfo(yearplans, 6);
        model.addAttribute("pageInfo", page);
        return "city/yearplan/yearplaninfo.jsp";
    }
    @RequestMapping("/baosong")
    public String baosong(
            @RequestParam(value = "pn", defaultValue = "1") Integer pn,
            Model model) {
        PageHelper.startPage(pn, 6);
        List<Yearplan> yearplans = yearplanService.findBysendstatusandreceiveunit("县发改");
        PageInfo page = new PageInfo(yearplans, 6);
        model.addAttribute("pageInfo", page);
        return "manager/yearplan/bsyearplan.jsp";
    }
    @RequestMapping("/citybaosong")
    public String citybaosong(
            @RequestParam(value = "pn", defaultValue = "1") Integer pn,
            Model model) {
        PageHelper.startPage(pn, 6);
        List<Yearplan> yearplans = yearplanService.findBysendstatusandreceiveunit("市发改");
        PageInfo page = new PageInfo(yearplans, 6);
        model.addAttribute("pageInfo", page);
        return "city/yearplan/bsyearplan.jsp";
    }
    @RequestMapping("/year")
    public String year(
            @RequestParam(value = "pn", defaultValue = "1") Integer pn,
            Model model) {
        PageHelper.startPage(pn, 6);
        List<Yearplan> yearplans = yearplanService.findyearByplanstatusreceiveunit("县发改");
        PageInfo page = new PageInfo(yearplans, 6);
        model.addAttribute("pageInfo", page);
        return "manager/yearplan/yearplan.jsp";
    }
    @RequestMapping("/cityyear")
    public String cityyear(
            @RequestParam(value = "pn", defaultValue = "1") Integer pn,
            Model model) {
        PageHelper.startPage(pn, 6);
        List<Yearplan> yearplans = yearplanService.findByreceiveunit("市发改");
        PageInfo page = new PageInfo(yearplans, 6);
        model.addAttribute("pageInfo", page);
        return "city/yearplan/yearplan.jsp";
    }
    @RequestMapping("/yearcountyguanli")
    public String yearcountyguanli(
            @RequestParam(value = "pn", defaultValue = "1") Integer pn,
            Model model, HttpServletRequest req) {
            PageHelper.startPage(pn, 6);
            List<Rollplan> rollplans = rollplanService.findyearrollplanBysendstatus("县发改");
            PageInfo page = new PageInfo(rollplans, 6);
            model.addAttribute("pageInfo", page);
            return "manager/yearplan/yearrollplan.jsp";
        }
    @RequestMapping("/yearcityguanli")
    public String yearcityguanli(
            @RequestParam(value = "pn", defaultValue = "1") Integer pn,
            Model model, HttpServletRequest req) {
        PageHelper.startPage(pn, 6);
        List<Rollplan> rollplans = rollplanService.findyearrollplanBysendstatus("市发改");
        PageInfo page = new PageInfo(rollplans, 6);
        model.addAttribute("pageInfo", page);
        return "city/yearplan/yearrollplan.jsp";
    }
    @RequestMapping("/yearsenddaibao")
    public String yearsenddaibao(HttpServletRequest req,String ids){
        String[] strs = ids.split(",");
        for (int i = 0; i < strs.length; i++) {
                Yearplan yearplan= yearplanService.findyearplanByID(Integer.parseInt(strs[i]));
                yearplan.setPlanstatus("待报送");
                int h=yearplanService.update(yearplan);
        }
        return "redirect:bianzhiguanli";
    }
    @RequestMapping("/cityyearsenddaibao")
    public String cityyearsenddaibao(HttpServletRequest req,String ids){
        String[] strs = ids.split(",");
        for (int i = 0; i < strs.length; i++) {
            Yearplan yearplan= yearplanService.findyearplanByID(Integer.parseInt(strs[i]));
            yearplan.setPlanstatus("待报送");
            int h=yearplanService.update(yearplan);
        }
        return "redirect:citybianzhiguanli";
    }
    @RequestMapping("/bianzhidelete")
    public String bianzhidelete(HttpServletRequest req,String ids){
        String[] sts = ids.split(",");
        for (int i = 0; i < sts.length; i++) {
                int h= yearplanService.deleteByPrimaryKey(Integer.parseInt(sts[i]));
        }
        return "redirect:bianzhiguanli";
    }
    @RequestMapping("/citybianzhidelete")
    public String citybianzhidelete(HttpServletRequest req,String ids){
        String[] sts = ids.split(",");
        for (int i = 0; i < sts.length; i++) {
            int h= yearplanService.deleteByPrimaryKey(Integer.parseInt(sts[i]));
        }
        return "redirect:citybianzhiguanli";
    }
    @RequestMapping("/yearcountytiaoxuan")
    public String yearcountytiaoxuan(HttpServletRequest req,String ids){
        String[] tx = ids.split(",");
        for (int i = 0; i < tx.length; i++) {
                Rollplan rollplan=rollplanService.findrollplanByID(Integer.parseInt(tx[i]));
                Yearplan yearplan=new Yearplan();
                yearplan.setPlanstatus("已编制");
                yearplan.setProjectid(rollplan.getProjectid());
                yearplan.setBsunit(rollplan.getReceivesite());
                yearplan.setReceiveunit(rollplan.getReceivesite());
                yearplan.setProjectname(rollplan.getProjectname());
                yearplan.setProjecttype(rollplan.getProjecttype());
                yearplan.setSite(rollplan.getSite());
                Project project=projectService.findprojectByID(rollplan.getProjectid());
                yearplan.setGbindustry(project.getGbindustry());
                yearplan.setIndustry(rollplan.getIndustry());
                yearplan.setInvestment(rollplan.getInvestment());
                yearplan.setStarttime(rollplan.getStarttime());
                yearplan.setEndtime(rollplan.getEndtime());
                yearplan.setPlantime(new java.sql.Date(new java.util.Date().getTime()));
                yearplan.setUpdatetime(new java.sql.Date(new java.util.Date().getTime()));
                int j = yearplanService.insertSelective(yearplan);
        }
        return "redirect:bianzhiguanli";
    }
    @RequestMapping("/yearcitytiaoxuan")
    public String yearcitytiaoxuan(HttpServletRequest req,String ids){
        String[] tx = ids.split(",");
        for (int i = 0; i < tx.length; i++) {
            Rollplan rollplan=rollplanService.findrollplanByID(Integer.parseInt(tx[i]));
            Yearplan yearplan=new Yearplan();
            yearplan.setPlanstatus("已编制");
            yearplan.setProjectid(rollplan.getProjectid());
            yearplan.setBsunit(rollplan.getReceivesite());
            yearplan.setReceiveunit(rollplan.getReceivesite());
            yearplan.setProjectname(rollplan.getProjectname());
            yearplan.setProjecttype(rollplan.getProjecttype());
            yearplan.setSite(rollplan.getSite());
            Project project=projectService.findprojectByID(rollplan.getProjectid());
            yearplan.setGbindustry(project.getGbindustry());
            yearplan.setIndustry(rollplan.getIndustry());
            yearplan.setInvestment(rollplan.getInvestment());
            yearplan.setStarttime(rollplan.getStarttime());
            yearplan.setEndtime(rollplan.getEndtime());
            yearplan.setPlantime(new java.sql.Date(new java.util.Date().getTime()));
            yearplan.setUpdatetime(new java.sql.Date(new java.util.Date().getTime()));
            int j = yearplanService.insertSelective(yearplan);
        }
        return "redirect:citybianzhiguanli";
    }
    @RequestMapping("/senddaibao")
    public String senddaibao(HttpServletRequest request,String ids){
        request.setAttribute("ids", ids);
        return "manager/yearplan/baosong.jsp";
    }
    @RequestMapping("/citysenddaibao")
    public String citysenddaibao(HttpServletRequest request,String ids){
        request.setAttribute("ids", ids);
        return "city/yearplan/baosong.jsp";
    }
    @RequestMapping("/successbaosong")
    public String successbaosong(HttpServletRequest request,String ids){
        String[] sts = ids.split(",");
        String title=request.getParameter("title");
        String applyyear= request.getParameter("applyyear");
        for (int i = 0; i < sts.length; i++) {
                Yearplan yearplan= yearplanService.findyearplanByID(Integer.parseInt(sts[i]));
                yearplan.setPlanstatus("待报送");
                yearplan.setSendstatus("未报送");
                yearplan.setTitle(title);
                yearplan.setApplyyear(applyyear);
                yearplan.setBsnumber("待录入");
                int h=yearplanService.update(yearplan);
        }
        return "redirect:bianzhiguanli";
    }
    @RequestMapping("/citysuccessbaosong")
    public String citysuccessbaosong(HttpServletRequest request,String ids){
        String[] sts = ids.split(",");
        String title=request.getParameter("title");
        String applyyear= request.getParameter("applyyear");
        for (int i = 0; i < sts.length; i++) {
            Yearplan yearplan= yearplanService.findyearplanByID(Integer.parseInt(sts[i]));
            yearplan.setPlanstatus("待报送");
            yearplan.setSendstatus("未报送");
            yearplan.setTitle(title);
            yearplan.setApplyyear(applyyear);
            yearplan.setBsnumber("待录入");
            int h=yearplanService.update(yearplan);
        }
        return "redirect:citybianzhiguanli";
    }
    @RequestMapping("/biangeng")
    public String biangeng(HttpServletRequest request,String yearplanid){
        Yearplan yearplan=yearplanService.findyearplanByID(Integer.parseInt(yearplanid));
        request.getSession().setAttribute("yearplan", yearplan);
        return "manager/yearplan/biangeng.jsp";
    }
    @RequestMapping("/citybiangeng")
    public String citybiangeng(HttpServletRequest request,String yearplanid){
        Yearplan yearplan=yearplanService.findyearplanByID(Integer.parseInt(yearplanid));
        request.getSession().setAttribute("yearplan", yearplan);
        return "city/yearplan/biangeng.jsp";
    }
    @RequestMapping("/successbiangeng")
    public String successbiangeng(HttpServletRequest request,String yearplanid){
        String bsnumber=request.getParameter("bsnumber");
        Yearplan yearplan=yearplanService.findyearplanByID(Integer.parseInt(yearplanid));
        if(yearplan.getPlanstatus().equals("待报送")) {
            yearplan.setBsnumber(bsnumber);
            int h = yearplanService.update(yearplan);
        }else if(yearplan.getPlanstatus().equals("已报送")){
            request.getSession().setAttribute("message","该文号已经报送，不允许变更！");
        }else {
            request.getSession().setAttribute("message","该文号已经入库，不允许变更！");
        }
        return "redirect:baosong";
    }
    @RequestMapping("/citysuccessbiangeng")
    public String citysuccessbiangeng(HttpServletRequest request,String yearplanid){
        String bsnumber=request.getParameter("bsnumber");
        Yearplan yearplan=yearplanService.findyearplanByID(Integer.parseInt(yearplanid));
        if(yearplan.getPlanstatus().equals("待报送")) {
            yearplan.setBsnumber(bsnumber);
            int h = yearplanService.update(yearplan);
        }else if(yearplan.getPlanstatus().equals("已报送")){
            request.getSession().setAttribute("message","该文号已经报送，不允许变更！");
        }else {
            request.getSession().setAttribute("message","该文号已经入库，不允许变更！");
        }
        return "redirect:citybaosong";
    }
    @RequestMapping("/baosongtuihui")
    public String baosongtuihui(HttpServletRequest request,String ids){
        String[] st = ids.split(",");
        for (int i = 0; i < st.length; i++) {
            Yearplan yearplan1= yearplanService.findyearplanByID(Integer.parseInt(st[i]));
            if(yearplan1.getPlanstatus().equals("待报送")) {
                yearplan1.setPlanstatus("已编制");
                yearplan1.setSendstatus("");
                yearplan1.setTitle("");
                yearplan1.setApplyyear("");
                yearplan1.setBsnumber("");
                int z = yearplanService.update(yearplan1);
            }else {
                request.getSession().setAttribute("message","您选中的项目中有项目已入库，无法退回至编制区。");
            }
        }
        return "redirect:baosong";
    }
    @RequestMapping("/citybaosongtuihui")
    public String citybaosongtuihui(HttpServletRequest request,String ids){
        String[] st = ids.split(",");
        for (int i = 0; i < st.length; i++) {
            Yearplan yearplan1= yearplanService.findyearplanByID(Integer.parseInt(st[i]));
            if(yearplan1.getPlanstatus().equals("待报送")) {
                yearplan1.setPlanstatus("已编制");
                yearplan1.setSendstatus("");
                yearplan1.setTitle("");
                yearplan1.setApplyyear("");
                yearplan1.setBsnumber("");
                int z = yearplanService.update(yearplan1);
            }else {
                request.getSession().setAttribute("message","您选中的项目中有项目已入库，无法退回至编制区。");
            }
        }
        return "redirect:citybaosong";
    }
    @RequestMapping("/countybaosongnaru")
    public String  countybaosongnaru(HttpServletRequest request,String ids){
        String[] sts = ids.split(",");
        for (int i = 0; i < sts.length; i++) {
            Yearplan yearplan= yearplanService.findyearplanByID(Integer.parseInt(sts[i]));
            if (yearplan.getPlanstatus().equals("待报送")) {
                yearplan.setPlanstatus("仅纳入(未报送)");
                yearplan.setFromproject("本级填报");
                int h = yearplanService.update(yearplan);
            }else {
                request.getSession().setAttribute("message",yearplan.getTitle()+"已入库，请勿重复入库！");
            }
        }
        return "redirect:baosong";
    }
    @RequestMapping("/citybaosongnaru")
    public String  citybaosongnaru(HttpServletRequest request,String ids){
        String[] sts = ids.split(",");
        for (int i = 0; i < sts.length; i++) {
            Yearplan yearplan= yearplanService.findyearplanByID(Integer.parseInt(sts[i]));
            if (yearplan.getPlanstatus().equals("待报送")) {
                yearplan.setPlanstatus("待下达");
                yearplan.setFromproject("本级填报");
                int h = yearplanService.update(yearplan);
            }else {
                request.getSession().setAttribute("message",yearplan.getTitle()+"已入库，请勿重复入库！");
            }
        }
        return "redirect:citybaosong";
    }
    @RequestMapping("/sendyearplan")
    public String sendyearplan(HttpServletRequest request,String ids){
        request.setAttribute("ids", ids);
        return "manager/yearplan/sendyearplan.jsp";
    }
    @RequestMapping("/bscountybaosong")
    public String  bscountybaosong(HttpServletRequest request,String ids){
        String receiveunit=request.getParameter("receiveunit");
        String[] sts = ids.split(",");
        for (int i = 0; i < sts.length; i++) {
            Yearplan yearplan = yearplanService.findyearplanByID(Integer.parseInt(sts[i]));
            if (yearplan.getPlanstatus().equals("待报送")||yearplan.getPlanstatus().equals("仅纳入(未报送)")) {
                yearplan.setPlanstatus("已报送");
                yearplan.setFromproject("本级填报");
                yearplan.setSendstatus("已报送");
                yearplan.setSendtime(new java.sql.Date(new java.util.Date().getTime()));
                int h = yearplanService.update(yearplan);
                Yearplan yearplan1 = new Yearplan();
                yearplan1.setPlanstatus("已编制");
                yearplan1.setProjectid(yearplan.getProjectid());
                yearplan1.setBsunit(yearplan.getReceiveunit());
                yearplan1.setReceiveunit(receiveunit);
                yearplan1.setProjectname(yearplan.getProjectname());
                yearplan1.setProjecttype(yearplan.getProjecttype());
                yearplan1.setSite(yearplan.getSite());
                Project project = projectService.findprojectByID(yearplan.getProjectid());
                yearplan1.setGbindustry(project.getGbindustry());
                yearplan1.setIndustry(yearplan.getIndustry());
                yearplan1.setInvestment(yearplan.getInvestment());
                yearplan1.setStarttime(yearplan.getStarttime());
                yearplan1.setEndtime(yearplan.getEndtime());
                yearplan1.setPlantime(new java.sql.Date(new java.util.Date().getTime()));
                yearplan1.setUpdatetime(new java.sql.Date(new java.util.Date().getTime()));
                int j = yearplanService.insertSelective(yearplan1);
            } else {
                request.getSession().setAttribute("message",yearplan.getTitle()+"已上报，请勿重复上报！");
            }

        }
        return "redirect:baosong";
    }
    @RequestMapping("/countytuihui")
    public String countytuihui(HttpServletRequest req, String ids){
        String[] strs = ids.split(",");
        for (int i = 0; i < strs.length; i++) {
                Yearplan yearplan= yearplanService.findyearplanByID(Integer.parseInt(strs[i]));
                if (yearplan.getPlanstatus().equals("已报送")) {
                    req.getSession().setAttribute("message", "您选中的报送文号为:"+yearplan.getBsnumber()+"的项目已报送上级，无法退回至报送区。");
                }else {
                    yearplan.setPlanstatus("待报送");
                    int h = yearplanService.update(yearplan);
                }
        }
        return "redirect:year";
    }
    @RequestMapping("/citytuihui")
    public String citytuihui(HttpServletRequest req, String ids){
        String[] strs = ids.split(",");
        for (int i = 0; i < strs.length; i++) {
            Yearplan yearplan= yearplanService.findyearplanByID(Integer.parseInt(strs[i]));
            if (yearplan.getPlanstatus().equals("已下达")) {
                req.getSession().setAttribute("message", "您选中的报送文号为:"+yearplan.getBsnumber()+"的项目已下达，无法退回至报送区。");
            }else {
                yearplan.setPlanstatus("待报送");
                int h = yearplanService.update(yearplan);
            }
        }
        return "redirect:cityyear";
    }
    @RequestMapping("/writefundnumber")
    public String writefundnumber(HttpServletRequest request,String yearplanid){
        Yearplan yearplan=yearplanService.findyearplanByID(Integer.parseInt(yearplanid));
        request.getSession().setAttribute("yearplan", yearplan);
        return "city/yearplan/writefundnumber.jsp";
    }
    @RequestMapping("/successwritefundnumber")
    public String successwritefundnumber(HttpServletRequest request,String yearplanid){
        String fundnumber=request.getParameter("fundnumber");
        Yearplan yearplan=yearplanService.findyearplanByID(Integer.parseInt(yearplanid));
        if(yearplan.getPlanstatus().equals("待下达")) {
            yearplan.setFundnumber(fundnumber);
            int h = yearplanService.update(yearplan);
        }else {
            request.getSession().setAttribute("message","该文号已经下达，不允许变更！");
        }
        return "redirect:cityyear";
    }
    @RequestMapping("/cityxiada")
    public String cityxiada(HttpServletRequest request,String ids){
        String[] strs = ids.split(",");
        for (int i = 0; i < strs.length; i++) {
            Yearplan yearplan= yearplanService.findyearplanByID(Integer.parseInt(strs[i]));
            if (yearplan.getPlanstatus().equals("已下达")) {
                request.getSession().setAttribute("message", "您选中的报送文号为:"+yearplan.getBsnumber()+"的项目已下达，请勿重复下达。");
            }else {
                yearplan.setPlanstatus("已下达");
                int h = yearplanService.update(yearplan);
            }
        }
        return "redirect:cityyear";

    }
    @RequestMapping("/countyreceive")
    public String countyreceive(
            @RequestParam(value = "pn", defaultValue = "1") Integer pn,
            Model model) {
        PageHelper.startPage(pn, 6);
        List<Yearplan> yearplans = yearplanService.findByplanstatusandreceiveunit("已下达","市发改");
        PageInfo page = new PageInfo(yearplans, 6);
        model.addAttribute("pageInfo", page);
        return "manager/yearplan/receiveyearplan.jsp";
    }
    @RequestMapping("/cityxiadainfo")
    public String cityxiadainfo(
            @RequestParam(value = "pn", defaultValue = "1") Integer pn,
            Model model) {
        PageHelper.startPage(pn, 6);
        List<Yearplan> yearplans = yearplanService.findByplanstatusandreceiveunit("已下达","市发改");
        PageInfo page = new PageInfo(yearplans, 6);
        model.addAttribute("pageInfo", page);
        return "city/yearplan/cityxiadainfo.jsp";
    }
}
