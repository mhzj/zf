package com.controller.houtai;

import com.entity.*;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.service.*;
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
import java.util.Map;
@Controller
@RequestMapping("/rollplan")
public class RollplanController {
    @Autowired
    private RollplanService rollplanService;
    @Autowired
    private ProjectsendService projectsendService;
    @Autowired
    private User_ProjectService user_projectService;
    @Autowired
    private UserService userService;
    @Autowired
    private ProjectService projectService;
    @RequestMapping("/bianzhiguanli")
    public String getRollplan(@RequestParam(value = "pn", defaultValue = "1") Integer pn, Model model) {
        PageHelper.startPage(pn, 6);
        List<Rollplan> rollplans = rollplanService.findBysendstatusandreceivesite("已编制","县发改");
        PageInfo page = new PageInfo(rollplans, 6);
        model.addAttribute("pageInfo", page);
        return "manager/rollplan/rollplaninfo.jsp";
    }

    @RequestMapping("/citybianzhiguanli")
    public String   citybianzhiguanli(
            @RequestParam(value = "pn", defaultValue = "1") Integer pn,
            Model model) {
        PageHelper.startPage(pn, 6);
        List<Rollplan> rollplans = rollplanService.findBysendstatusandreceivesite("已编制","市发改");
        PageInfo page = new PageInfo(rollplans, 6);
        model.addAttribute("pageInfo", page);
        return "city/rollplan/rollplaninfo.jsp";
    }
    @RequestMapping("/daibao")
    public String getdaibao(
            @RequestParam(value = "pn", defaultValue = "1") Integer pn,
            Model model) {
        PageHelper.startPage(pn, 6);
        List<Rollplan> rollplans = rollplanService.findBysendstatusandreceivesite("待报送","县发改");
        PageInfo page = new PageInfo(rollplans, 6);
        model.addAttribute("pageInfo", page);
        return "manager/rollplan/dbrollplan.jsp";
    }
    @RequestMapping("/citydaibao")
    public String getcitydaibao(
            @RequestParam(value = "pn", defaultValue = "1") Integer pn,
            Model model) {
        PageHelper.startPage(pn, 6);
        List<Rollplan> rollplans = rollplanService.findBysendstatusandreceivesite("待报送","市发改");
        PageInfo page = new PageInfo(rollplans, 6);
        model.addAttribute("pageInfo", page);
        return "city/rollplan/dbrollplan.jsp";
    }
    @RequestMapping("/yearrollplan")
    public String yearrollplan(
            @RequestParam(value = "pn", defaultValue = "1") Integer pn,
            Model model) {
        PageHelper.startPage(pn, 6);
        List<Rollplan> rollplans = rollplanService.findyearrollplanBysendstatus("县发改");
        PageInfo page = new PageInfo(rollplans, 6);
        model.addAttribute("pageInfo", page);
        return "manager/rollplan/yearrollplan.jsp";
    }
    @RequestMapping("/cityyearrollplan")
    public String cityyearrollplan(
            @RequestParam(value = "pn", defaultValue = "1") Integer pn,
            Model model) {
        PageHelper.startPage(pn, 6);
        List<Rollplan> rollplans = rollplanService.findyearrollplanBysendstatus("市发改");
        PageInfo page = new PageInfo(rollplans, 6);
        model.addAttribute("pageInfo", page);
        return "city/rollplan/yearrollplan.jsp";
    }
    @RequestMapping("/senddaibao")
    public String senddaibao(HttpServletRequest req,String ids){
            String[] strs = ids.split(",");
            for (int i = 0; i < strs.length; i++) {

                    Rollplan rollplan= rollplanService.findrollplanByID(Integer.parseInt(strs[i]));
                    rollplan.setSendstatus("待报送");
                    int h=rollplanService.update(rollplan);
            }
        return "redirect:bianzhiguanli";
    }
    @RequestMapping("/citysenddaibao")
    public String citysenddaibao(HttpServletRequest req,String ids){
        String[] strs = ids.split(",");
        for (int i = 0; i < strs.length; i++) {
                Rollplan rollplan= rollplanService.findrollplanByID(Integer.parseInt(strs[i]));
                rollplan.setSendstatus("待报送");
                int h=rollplanService.update(rollplan);
        }
        return "redirect:citybianzhiguanli";
    }
    @RequestMapping("/daibaotuihui")
    public String daibaotuihui(HttpServletRequest req,String ids){
        String[] strs = ids.split(",");
        for (int i = 0; i < strs.length; i++) {
                Rollplan rollplan= rollplanService.findrollplanByID(Integer.parseInt(strs[i]));
                rollplan.setSendstatus("已编制");
                int h=rollplanService.update(rollplan);
        }
        return "redirect:daibao";
    }
    @RequestMapping("/citydaibaotuihui")
    public String citydaibaotuihui(HttpServletRequest req,String ids){
        String[] strs = ids.split(",");
        for (int i = 0; i < strs.length; i++) {
            Rollplan rollplan= rollplanService.findrollplanByID(Integer.parseInt(strs[i]));
            rollplan.setSendstatus("已编制");
            int h=rollplanService.update(rollplan);
        }
        return "redirect:citydaibao";
    }
    @RequestMapping("/yearrollplantuihui")
    public String yearrollplantuihui(HttpServletRequest req, String ids){
        String[] strs = ids.split(",");
        for (int i = 0; i < strs.length; i++) {
                Rollplan rollplan= rollplanService.findrollplanByID(Integer.parseInt(strs[i]));
                if (rollplan.getSendstatus().equals("已报送")) {
                    req.getSession().setAttribute("message", "您选中的项目中项目名为:"+rollplan.getProjectname()+"的项目已报送上级，无法退回至待报区。");
                }else {
                    rollplan.setSendstatus("待报送");
                    int h = rollplanService.update(rollplan);
                }
        }
        return "redirect:yearrollplan";
    }
    @RequestMapping("/cityyearrollplantuihui")
    public String cityyearrollplantuihui(HttpServletRequest req, String ids){
        String[] strs = ids.split(",");
        for (int i = 0; i < strs.length; i++) {
            Rollplan rollplan= rollplanService.findrollplanByID(Integer.parseInt(strs[i]));
            if (rollplan.getSendstatus().equals("已报送")) {
                req.getSession().setAttribute("message", "您选中的项目中项目名为:"+rollplan.getProjectname()+"的项目已报送上级，无法退回至待报区。");
            }else {
                rollplan.setSendstatus("待报送");
                int h = rollplanService.update(rollplan);
            }
        }
        return "redirect:cityyearrollplan";
    }
    @RequestMapping("/bianzhidelete")
    public String bianzhidelete(HttpServletRequest req,String ids){
        String[] sts = ids.split(",");
        for (int i = 0; i < sts.length; i++) {
            int h= rollplanService.deleteByPrimaryKey(Integer.parseInt(sts[i]));
        }
        return "redirect:bianzhiguanli";
    }
    @RequestMapping("/citybianzhidelete")
    public String citybianzhidelete(HttpServletRequest req,String ids){
        String[] sts = ids.split(",");
        for (int i = 0; i < sts.length; i++) {
            int h= rollplanService.deleteByPrimaryKey(Integer.parseInt(sts[i]));
        }
        return "redirect:citybianzhiguanli";
    }
    @RequestMapping("/countyjiasuo")
    public String countyjiasuo(HttpServletRequest req,String ids){
        String[] s = ids.split(",");
        for (int i = 0; i < s.length; i++) {
                Rollplan rollplan2= rollplanService.findrollplanByID(Integer.parseInt(s[i]));
                if (rollplan2.getRate().equals("无")){
                    rollplan2.setRate("县级");
                    int h=rollplanService.update(rollplan2);
                }else {}
            }
        return "redirect:bianzhiguanli";
    }
    @RequestMapping("/cityjiasuo")
    public String cityjiasuo(HttpServletRequest req,String ids){
        String[] s = ids.split(",");
        for (int i = 0; i < s.length; i++) {
            Rollplan rollplan2= rollplanService.findrollplanByID(Integer.parseInt(s[i]));
            if (rollplan2.getRate().equals("无")) {
                rollplan2.setRate("县级");
            }else {
                rollplan2.setRate("市级");
            }
            int h=rollplanService.update(rollplan2);
        }
        return "redirect:citybianzhiguanli";
    }
    @RequestMapping("/countydaibaojiasuo")
    public String countydaibaojiasuo(HttpServletRequest req,String ids){
        String[] s = ids.split(",");
        for (int i = 0; i < s.length; i++) {
                Rollplan rollplan2= rollplanService.findrollplanByID(Integer.parseInt(s[i]));
                if (rollplan2.getRate().equals("无")){
                    rollplan2.setRate("县级");
                    int h=rollplanService.update(rollplan2);
                }else {}
        }
        return "redirect:daibao";
    }
    @RequestMapping("/citydaibaojiasuo")
    public String citydaibaojiasuo(HttpServletRequest req,String ids){
        String[] s = ids.split(",");
        for (int i = 0; i < s.length; i++) {
            Rollplan rollplan2= rollplanService.findrollplanByID(Integer.parseInt(s[i]));
            if (rollplan2.getRate().equals("无")) {
                rollplan2.setRate("县级");
            }else {
                rollplan2.setRate("市级");
            }
            int h=rollplanService.update(rollplan2);
        }
        return "redirect:citydaibao";
    }
    @RequestMapping("/countyyearrollplanjiasuo")
    public String countyyearrollplanjiasuo(HttpServletRequest req,String ids){
        String[] s = ids.split(",");
        for (int i = 0; i < s.length; i++) {
                Rollplan rollplan2= rollplanService.findrollplanByID(Integer.parseInt(s[i]));
                if (rollplan2.getRate().equals("无")){
                    rollplan2.setRate("县级");
                    int h=rollplanService.update(rollplan2);
                }else {}
        }
        return "redirect:yearrollplan";
    }
    @RequestMapping("/cityyearrollplanjiasuo")
    public String cityyearrollplanjiasuo(HttpServletRequest req,String ids){
        String[] s = ids.split(",");
        for (int i = 0; i < s.length; i++) {
                Rollplan rollplan2= rollplanService.findrollplanByID(Integer.parseInt(s[i]));
                if (rollplan2.getRate().equals("无")) {
                    rollplan2.setRate("县级");
                }else {
                    rollplan2.setRate("市级");
                }
                int h=rollplanService.update(rollplan2);
        }
        return "redirect:cityyearrollplan";
    }
    @RequestMapping("/countyjiesuo")
    public String countyjiesuo(HttpServletRequest req,String ids){
        String[] t = ids.split(",");
        for (int i = 0; i < t.length; i++) {

                Rollplan rollplan1= rollplanService.findrollplanByID(Integer.parseInt(t[i]));
                if (rollplan1.getRate().equals("县级")){
                    rollplan1.setRate("无");
                    int h=rollplanService.update(rollplan1);
                }else {}
        }
        return "redirect:bianzhiguanli";
    }
    @RequestMapping("/cityjiesuo")
    public String cityjiesuo(HttpServletRequest req,String ids){
        String[] t = ids.split(",");
        for (int i = 0; i < t.length; i++) {

            Rollplan rollplan1= rollplanService.findrollplanByID(Integer.parseInt(t[i]));
            if (rollplan1.getRate().equals("市级")) {
                rollplan1.setRate("县级");
            }else rollplan1.setRate("无");
            int h=rollplanService.update(rollplan1);
        }
        return "redirect:citybianzhiguanli";
    }
    @RequestMapping("/countyyearrollplanjiesuo")
    public String countyyearrollplanjiesuo(HttpServletRequest req,String ids){
        String[] t = ids.split(",");
        for (int i = 0; i < t.length; i++) {
                Rollplan rollplan1= rollplanService.findrollplanByID(Integer.parseInt(t[i]));
                if (rollplan1.getRate().equals("县级")){
                    rollplan1.setRate("无");
                    int h=rollplanService.update(rollplan1);
                }else {}
        }
        return "redirect:yearrollplan";
    }
    @RequestMapping("/cityyearrollplanjiesuo")
    public String cityyearrollplanjiesuo(HttpServletRequest req,String ids){
        String[] t = ids.split(",");
        for (int i = 0; i < t.length; i++) {
            Rollplan rollplan1= rollplanService.findrollplanByID(Integer.parseInt(t[i]));
            if (rollplan1.getRate().equals("市级")) {
                rollplan1.setRate("县级");
            }else rollplan1.setRate("无");
            int h=rollplanService.update(rollplan1);
        }
        return "redirect:cityyearrollplan";
    }
    @RequestMapping("/countydaibaojiesuo")
    public String countydaibaojiesuo(HttpServletRequest req,String ids){
        String[] t = ids.split(",");
        for (int i = 0; i < t.length; i++) {
                Rollplan rollplan1= rollplanService.findrollplanByID(Integer.parseInt(t[i]));
                if (rollplan1.getRate().equals("县级")){
                    rollplan1.setRate("无");
                    int h=rollplanService.update(rollplan1);
                }else {}
        }
        return "redirect:daibao";
    }
    @RequestMapping("/citydaibaojiesuo")
    public String citydaibaojiesuo(HttpServletRequest req,String ids){
        String[] t = ids.split(",");
        for (int i = 0; i < t.length; i++) {
            Rollplan rollplan1= rollplanService.findrollplanByID(Integer.parseInt(t[i]));
            if (rollplan1.getRate().equals("市级")) {
                rollplan1.setRate("县级");
            }else rollplan1.setRate("无");
            int h=rollplanService.update(rollplan1);
        }
        return "redirect:citydaibao";
    }
    @RequestMapping("/countyguanli")
    public String getcountyguanli(
            @RequestParam(value = "pn", defaultValue = "1") Integer pn,
            Model model, HttpServletRequest req) {
        PageHelper.startPage(pn, 6);
        List<Projectsend> projectsends=projectsendService.findBysaverate("县级储备");
        req.getSession().setAttribute("projectsends", projectsends);
        PageInfo page = new PageInfo(projectsends, 6);
        model.addAttribute("pageInfo", page);
        return "manager/rollplan/projectlibraryinfo.jsp";
    }
    @RequestMapping("/cityguanli")
    public String getcityguanli(
            @RequestParam(value = "pn", defaultValue = "1") Integer pn,
            Model model, HttpServletRequest req) {
        PageHelper.startPage(pn, 6);
        List<Projectsend> projectsends=projectsendService.findBysaverate("市级储备");
        req.getSession().setAttribute("projectsends", projectsends);
        PageInfo page = new PageInfo(projectsends, 6);
        model.addAttribute("pageInfo", page);
        return "city/rollplan/projectlibraryinfo.jsp";
    }
    @RequestMapping("/countytiaoxuan")
    public String countytiaoxuan(HttpServletRequest req,String ids){
        String[] tx = ids.split(",");
        for (int i = 0; i < tx.length; i++) {
            try {
                Projectsend projectsend=projectsendService.findprojectsendByID(Integer.parseInt(tx[i]));
                Rollplan rollplan=new Rollplan();
                rollplan.setProjectid(projectsend.getProjectid());
                rollplan.setRate(projectsend.getRate());
                rollplan.setProjectname(projectsend.getProjectname());
                rollplan.setProjecttype(projectsend.getProjecttype());
                rollplan.setSite(projectsend.getSite());
                rollplan.setFromsite(projectsend.getFromsite());
                rollplan.setIndustry(projectsend.getIndustry());
                rollplan.setInvestment(projectsend.getInvestment());
                rollplan.setStarttime(projectsend.getStarttime());
                rollplan.setEndtime(projectsend.getEndtime());
                rollplan.setPlantime(new java.sql.Date(new java.util.Date().getTime()));
                rollplan.setUpdatetime(new java.sql.Date(new java.util.Date().getTime()));
                rollplan.setReceivesite(projectsend.getReceivesite());
                rollplan.setSendstatus("已编制");
                int j = rollplanService.insertSelective(rollplan);
            } catch (Exception e) {
            }
        }
        return "redirect:bianzhiguanli";
    }
    @RequestMapping("/citytiaoxuan")
    public String citytiaoxuan(HttpServletRequest req,String ids){
        String[] tx = ids.split(",");
        for (int i = 0; i < tx.length; i++) {
                Projectsend projectsend=projectsendService.findprojectsendByID(Integer.parseInt(tx[i]));
                Rollplan rollplan=new Rollplan();
                rollplan.setProjectid(projectsend.getProjectid());
                rollplan.setRate(projectsend.getRate());
                rollplan.setProjectname(projectsend.getProjectname());
                rollplan.setProjecttype(projectsend.getProjecttype());
                rollplan.setSite(projectsend.getSite());
                rollplan.setFromsite(projectsend.getFromsite());
                rollplan.setReceivesite(projectsend.getReceivesite());
                rollplan.setIndustry(projectsend.getIndustry());
                rollplan.setInvestment(projectsend.getInvestment());
                rollplan.setStarttime(projectsend.getStarttime());
                rollplan.setEndtime(projectsend.getEndtime());
                rollplan.setPlantime(new java.sql.Date(new java.util.Date().getTime()));
                rollplan.setUpdatetime(new java.sql.Date(new java.util.Date().getTime()));
                rollplan.setReceivesite(projectsend.getReceivesite());
                rollplan.setSendstatus("已编制");
                int j = rollplanService.insertSelective(rollplan);
        }
        return "redirect:citybianzhiguanli";
    }
    @RequestMapping("/countydaibaonaru")
    public String countydaibaonaru(HttpServletRequest req,String ids){
        String[] t = ids.split(",");
        for (int i = 0; i < t.length; i++) {
                Rollplan rollplan= rollplanService.findrollplanByID(Integer.parseInt(t[i]));
                  rollplan.setSendstatus("仅纳入(未报送)");
                User_project user_project=user_projectService.findByprojectid(rollplan.getProjectid());
                User user=userService.findUserById(user_project.getUserid());
                  rollplan.setReceivesite(user.getReviewdepartment());
                  int j=rollplanService.update(rollplan);
        }
        return "redirect:daibao";
    }
    @RequestMapping("/citydaibaonaru")
    public String citydaibaonaru(HttpServletRequest req,String ids){
        String[] t = ids.split(",");
        for (int i = 0; i < t.length; i++) {
                Rollplan rollplan= rollplanService.findrollplanByID(Integer.parseInt(t[i]));
                rollplan.setSendstatus("仅纳入(未报送)");

                int j=rollplanService.update(rollplan);
        }
        return "redirect:citydaibao";
    }
    @RequestMapping("/daibaobaosong")
    public String daibaobaosong(HttpServletRequest request){
        String ids=request.getParameter("ids");
        request.setAttribute("ids", ids);
        String[] t = ids.split(",");
        for (int i = 0; i < t.length; i++) {
                Rollplan rollplan= rollplanService.findrollplanByID(Integer.parseInt(t[i]));
                request.getSession().setAttribute("rollplan", rollplan);
        }
        return "manager/rollplan/sendyearrollplan.jsp";
    }
    @RequestMapping("/sendyearrollplan")
    public String  sendyearrollplan(HttpServletRequest req,String ids){
        String[] it = ids.split(",");
        for (int i = 0; i < it.length; i++) {
                Rollplan rollplan= rollplanService.findrollplanByID(Integer.parseInt(it[i]));
                rollplan.setSendstatus("已报送");
                User_project user_project=user_projectService.findByprojectid(rollplan.getProjectid());
                User user=userService.findUserById(user_project.getUserid());
                rollplan.setReceivesite(user.getReviewdepartment());
                int h=rollplanService.update(rollplan);
                Rollplan rollplan1=new Rollplan();
                rollplan1.setProjectid(rollplan.getProjectid());
                rollplan1.setRate(rollplan.getRate());
                rollplan1.setProjectname(rollplan.getProjectname());
                rollplan1.setProjecttype(rollplan.getProjecttype());
                rollplan1.setSite(rollplan.getSite());
                rollplan1.setFromsite(rollplan.getReceivesite());
                rollplan1.setReceivesite(req.getParameter("receivesite"));
                rollplan1.setIndustry(rollplan.getIndustry());
                rollplan1.setInvestment(rollplan.getInvestment());
                rollplan1.setStarttime(rollplan.getStarttime());
                rollplan1.setEndtime(rollplan.getEndtime());
                rollplan1.setPlantime(rollplan.getPlantime());
                rollplan1.setUpdatetime(new java.sql.Date(new java.util.Date().getTime()));
                rollplan1.setSendstatus("已编制");
                int j = rollplanService.insertSelective(rollplan1);
        }
        return "redirect:daibao";
    }
    @RequestMapping("/updateproject")
    public String updateproject(HttpServletRequest req){
        int rollplanid=Integer.parseInt(req.getParameter("rollplanid"));
        Rollplan rollplan= rollplanService.findrollplanByID(rollplanid);
        req.getSession().setAttribute("rollplan", rollplan);
        Project project=projectService.findprojectByID(rollplan.getProjectid());
        req.getSession().setAttribute("updateproject", project);
        return "manager/rollplan/projectupdate.jsp";
    }
    @RequestMapping("/cityupdateproject")
    public String cityupdateproject(HttpServletRequest req){
        int rollplanid=Integer.parseInt(req.getParameter("rollplanid"));
        Rollplan rollplan= rollplanService.findrollplanByID(rollplanid);
        req.getSession().setAttribute("rollplan", rollplan);
        Project project=projectService.findprojectByID(rollplan.getProjectid());
        req.getSession().setAttribute("updateproject", project);
        return "city/rollplan/projectupdate.jsp";
    }
    @RequestMapping("/save")
    public String save(HttpServletRequest req){
        String rollplansendstatus=req.getParameter("rollplansendstatus");
        int projectid=Integer.parseInt(req.getParameter("projectid"));
        String startyear=req.getParameter("startyear");
        String endyear=req.getParameter("endyear");
        SimpleDateFormat format= new SimpleDateFormat("yyyy-MM-dd");
        Date start= null;
        try {
            start = format.parse(startyear);
        } catch (ParseException e) {
            e.printStackTrace();
        }
        Date end= null;
        try {
            end = format.parse(endyear);
        } catch (ParseException e) {
            e.printStackTrace();
        }
        String reviewtime=req.getParameter("reviewtime");
        Date rtime= null;
        try {
            rtime = format.parse(reviewtime);
        } catch (ParseException e) {
            e.printStackTrace();
        }
        Project project=new Project();
        project.setProjectid(projectid);
        project.setCountryid(req.getParameter("countryid"));
        project.setPlaceid(req.getParameter("placeid"));
        project.setName(req.getParameter("name"));
        project.setType(req.getParameter("type"));
        project.setProperty(req.getParameter("property"));
        project.setCountry(req.getParameter("country"));
        project.setInstitution(req.getParameter("institution"));
        project.setSite(req.getParameter("site"));
        project.setSitedetail(req.getParameter("sitedetail"));
        project.setAddress(req.getParameter("address"));
        project.setGbindustry(req.getParameter("gbindustry"));
        project.setIndustry(req.getParameter("industry"));
        project.setInvestment(req.getParameter("investment"));
        project.setStartyear(new java.sql.Date(start.getTime()));
        project.setEndyear(new java.sql.Date(end.getTime()));
        project.setBuildscale(req.getParameter("buildscale"));
        project.setQuantifyscale(req.getParameter("quantifyscale"));
        project.setContent(req.getParameter("content"));
        project.setDutyperson(req.getParameter("dutyperson"));
        project.setDutypersontel(req.getParameter("dutypersontel"));
        project.setConperson(req.getParameter("conperson"));
        project.setConpersontel(req.getParameter("conpersontel"));
        project.setFundtype(req.getParameter("fundtype"));
        project.setAllfund(req.getParameter("allfund"));
        project.setXfund(req.getParameter("xfund"));
        project.setFinvestment(req.getParameter("finvestment"));
        project.setSfund(req.getParameter("sfund"));
        project.setReviewthing(req.getParameter("reviewthing"));
        project.setReviewname(req.getParameter("reviewname"));
        project.setReviewinstitution(req.getParameter("reviewinstitution"));
        project.setReviewtime(new java.sql.Date(rtime.getTime()));
        project.setReviewnumber(req.getParameter("reviewnumber"));
        project.setReviewstatus(req.getParameter("reviewstatus"));
        project.setSendstatus(req.getParameter("sendstatus"));
        int x= projectService.updateproject(project);
        if (rollplansendstatus.equals("已报送")||rollplansendstatus.equals("仅纳入(未报送)"))
        return "redirect:yearrollplan";
        else if (rollplansendstatus.equals("待报送"))
            return "redirect:daibao";
        else
            return "redirect:bianzhiguanli";
    }
    @RequestMapping("/citysave")
    public String citysave(HttpServletRequest req){
        String rollplansendstatus=req.getParameter("rollplansendstatus");
        int projectid=Integer.parseInt(req.getParameter("projectid"));
        String startyear=req.getParameter("startyear");
        String endyear=req.getParameter("endyear");
        SimpleDateFormat format= new SimpleDateFormat("yyyy-MM-dd");
        Date start= null;
        try {
            start = format.parse(startyear);
        } catch (ParseException e) {
            e.printStackTrace();
        }
        Date end= null;
        try {
            end = format.parse(endyear);
        } catch (ParseException e) {
            e.printStackTrace();
        }
        String reviewtime=req.getParameter("reviewtime");
        Date rtime= null;
        try {
            rtime = format.parse(reviewtime);
        } catch (ParseException e) {
            e.printStackTrace();
        }
        Project project=new Project();
        project.setProjectid(projectid);
        project.setCountryid(req.getParameter("countryid"));
        project.setPlaceid(req.getParameter("placeid"));
        project.setName(req.getParameter("name"));
        project.setType(req.getParameter("type"));
        project.setProperty(req.getParameter("property"));
        project.setCountry(req.getParameter("country"));
        project.setInstitution(req.getParameter("institution"));
        project.setSite(req.getParameter("site"));
        project.setSitedetail(req.getParameter("sitedetail"));
        project.setAddress(req.getParameter("address"));
        project.setGbindustry(req.getParameter("gbindustry"));
        project.setIndustry(req.getParameter("industry"));
        project.setInvestment(req.getParameter("investment"));
        project.setStartyear(new java.sql.Date(start.getTime()));
        project.setEndyear(new java.sql.Date(end.getTime()));
        project.setBuildscale(req.getParameter("buildscale"));
        project.setQuantifyscale(req.getParameter("quantifyscale"));
        project.setContent(req.getParameter("content"));
        project.setDutyperson(req.getParameter("dutyperson"));
        project.setDutypersontel(req.getParameter("dutypersontel"));
        project.setConperson(req.getParameter("conperson"));
        project.setConpersontel(req.getParameter("conpersontel"));
        project.setFundtype(req.getParameter("fundtype"));
        project.setAllfund(req.getParameter("allfund"));
        project.setXfund(req.getParameter("xfund"));
        project.setFinvestment(req.getParameter("finvestment"));
        project.setSfund(req.getParameter("sfund"));
        project.setReviewthing(req.getParameter("reviewthing"));
        project.setReviewname(req.getParameter("reviewname"));
        project.setReviewinstitution(req.getParameter("reviewinstitution"));
        project.setReviewtime(new java.sql.Date(rtime.getTime()));
        project.setReviewnumber(req.getParameter("reviewnumber"));
        project.setReviewstatus(req.getParameter("reviewstatus"));
        project.setSendstatus(req.getParameter("sendstatus"));
        int x= projectService.updateproject(project);
        if (rollplansendstatus.equals("已报送")||rollplansendstatus.equals("仅纳入(未报送)"))
            return "redirect:cityyearrollplan";
        else if (rollplansendstatus.equals("待报送"))
            return "redirect:citydaibao";
        else
            return "redirect:citybianzhiguanli";
    }
    @RequestMapping("searchbianzhi")
    public String searchbianzhi( @RequestParam(value = "pn", defaultValue = "1") Integer pn,
                                 Model model,HttpServletRequest request){
        String name=request.getParameter("name");
        String type=request.getParameter("type");
        String property=request.getParameter("property");
        request.setAttribute("name", name);
        request.setAttribute("type",type);
        request.setAttribute("property", property);
        List<Project> searchlist ;
        PageHelper.startPage(pn, 6);
        if(" ".equals(name)){
            if(" ".equals(type)){
                if(" ".equals(property)){
                    searchlist=projectService.findBysendstatus("待上报");
                }
                else {
                    searchlist= projectService.listByProperty_noPage(property.replace("'", ""));
                }
            }
            else {
                if (" ".equals(property)){
                    searchlist=projectService.listByType_noPage(type.replace("'", ""));
                }
                else {
                    searchlist=projectService.findByTypeandProperty(type.replace("'", ""),property.replace("'", ""));
                }
            }
        }
        else {
            if(" ".equals(type)){
                if (" ".equals(property)){

                    searchlist=projectService.findByName(name.replace("'", ""));
                }
                else {

                    searchlist=projectService.findByNameandProperty(name.replace("'", ""),property.replace("'", ""));
                }
            }
            else {
                if (" ".equals(property)){

                    searchlist=projectService.findByTypeandName(type.replace("'", ""),name.replace("'", ""));
                }
                else {

                    searchlist=projectService.findByNameTypeandProperty(name.replace("'", ""),type.replace("'", ""),property.replace("'", ""));
                }
            }
        }
        PageInfo page = new PageInfo(searchlist, 6);
        model.addAttribute("searchproject", page);
        return "admin/projectlist1.jsp";
    }

}
