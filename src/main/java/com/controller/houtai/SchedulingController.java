package com.controller.houtai;

import com.entity.Project;
import com.entity.Rollplan;
import com.entity.Scheduling;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.service.ProjectService;
import com.service.RollplanService;
import com.service.SchedulingService;
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
@RequestMapping("/scheduling")
public class SchedulingController {
    @Autowired
    private SchedulingService schedulingService;
    @Autowired
    private RollplanService rollplanService;
    @Autowired
    private ProjectService projectService;
    @RequestMapping("/bianzhi")
    public String bianzhiinfo(  @RequestParam(value = "pn", defaultValue = "1") Integer pn,
                                Model model) {
        PageHelper.startPage(pn, 6);
        List<Scheduling> schedulings = schedulingService.findBytdxfunit("县发改");
        PageInfo page = new PageInfo(schedulings, 6);
        model.addAttribute("pageInfo", page);
        return "manager/tiaodu/tiaodubianzhi.jsp";
    }
    @RequestMapping("/citybianzhi")
    public String citybianzhiinfo(  @RequestParam(value = "pn", defaultValue = "1") Integer pn,
                                Model model) {
        PageHelper.startPage(pn, 6);
        List<Scheduling> schedulings = schedulingService.findBytdxfunit("市发改");
        PageInfo page = new PageInfo(schedulings, 6);
        model.addAttribute("pageInfo", page);
        return "city/tiaodu/tiaodubianzhi.jsp";
    }
    @RequestMapping("/tiaoxuanrollplan")
    public String tiaoxuanrollplan(
            @RequestParam(value = "pn", defaultValue = "1") Integer pn,
            Model model,HttpServletRequest request) {
        String name=request.getParameter("name");
        String stype=request.getParameter("stype");
        String cycle=request.getParameter("cycle");
        String tdstatus=request.getParameter("tdstatus");
        String requirement=request.getParameter("requirement");
        String startyear=request.getParameter("tdstart");
        String endyear=request.getParameter("tdend");
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
        Scheduling scheduling=new Scheduling();
        scheduling.setName(name);
        scheduling.setStype(stype);
        scheduling.setCycle(cycle);
        scheduling.setRequirement(requirement);
        scheduling.setTdstart(start);
        scheduling.setTdend(end);
        scheduling.setTdstatus(tdstatus);
        scheduling.setTdxfunit("县发改");
        int h=schedulingService.insertSelective(scheduling);
        request.setAttribute("name",name);
        PageHelper.startPage(pn, 6);
        List<Rollplan> rollplans = rollplanService.findyearrollplanBysendstatus("县发改");
        PageInfo page = new PageInfo(rollplans, 6);
        model.addAttribute("pageInfo", page);
        return "manager/tiaodu/yearrollplan.jsp";
    }
    @RequestMapping("/citytiaoxuanrollplan")
    public String citytiaoxuanrollplan(
            @RequestParam(value = "pn", defaultValue = "1") Integer pn,
            Model model,HttpServletRequest request) {
        String name=request.getParameter("name");
        String stype=request.getParameter("stype");
        String cycle=request.getParameter("cycle");
        String tdstatus=request.getParameter("tdstatus");
        String requirement=request.getParameter("requirement");
        String startyear=request.getParameter("tdstart");
        String endyear=request.getParameter("tdend");
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
        Scheduling scheduling=new Scheduling();
        scheduling.setName(name);
        scheduling.setStype(stype);
        scheduling.setCycle(cycle);
        scheduling.setRequirement(requirement);
        scheduling.setTdstart(start);
        scheduling.setTdend(end);
        scheduling.setTdstatus(tdstatus);
        scheduling.setTdxfunit("市发改");
        int h=schedulingService.insertSelective(scheduling);
        request.setAttribute("name",name);
        PageHelper.startPage(pn, 6);
        List<Rollplan> rollplans = rollplanService.findyearrollplanBysendstatus("市发改");
        PageInfo page = new PageInfo(rollplans, 6);
        model.addAttribute("pageInfo", page);
        return "city/tiaodu/yearrollplan.jsp";
    }
    @RequestMapping("/countytiaoxuan")
    public String countytiaoxuan(HttpServletRequest req){
        String ids=req.getParameter("ids");
        String scheduname=req.getParameter("scheduname");
        Rollplan rollplan=rollplanService.findrollplanByID(Integer.parseInt(ids));
        Scheduling scheduling=schedulingService.findByname(scheduname);
        scheduling.setProjectid(rollplan.getProjectid());
        int h=schedulingService.update(scheduling);
        req.getSession().setAttribute("rollplan", rollplan);
        return "redirect:bianzhi";
    }
    @RequestMapping("/citytiaoxuan")
    public String citytiaoxuan(HttpServletRequest req){
        String ids=req.getParameter("ids");
        String scheduname=req.getParameter("scheduname");
        Rollplan rollplan=rollplanService.findrollplanByID(Integer.parseInt(ids));
        Scheduling scheduling=schedulingService.findByname(scheduname);
        scheduling.setProjectid(rollplan.getProjectid());
        int h=schedulingService.update(scheduling);
        req.getSession().setAttribute("rollplan", rollplan);
        return "redirect:citybianzhi";
    }
    @RequestMapping("/update")
    public String update(HttpServletRequest req, String ids){
        Scheduling scheduling=schedulingService.selectByPrimaryKey(Integer.parseInt(ids));
        req.getSession().setAttribute("updatescheduling", scheduling);
        return "manager/tiaodu/tiaoduupdate.jsp";
    }
    @RequestMapping("/cityupdate")
    public String cityupdate(HttpServletRequest req, String ids){
        Scheduling scheduling=schedulingService.selectByPrimaryKey(Integer.parseInt(ids));
        req.getSession().setAttribute("updatescheduling", scheduling);
        return "city/tiaodu/tiaoduupdate.jsp";
    }
    @RequestMapping("/save")
    public String save(@RequestParam(value = "pn", defaultValue = "1") Integer pn,
                       Model model,HttpServletRequest request){
        String schedulingid=request.getParameter("schedulingid");
        String name=request.getParameter("name");
        String stype=request.getParameter("stype");
        String cycle=request.getParameter("cycle");
        String tdstatus=request.getParameter("tdstatus");
        String requirement=request.getParameter("requirement");
        String startyear=request.getParameter("tdstart");
        String endyear=request.getParameter("tdend");
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
        Scheduling scheduling=schedulingService.selectByPrimaryKey(Integer.parseInt(schedulingid));
        scheduling.setName(name);
        scheduling.setStype(stype);
        scheduling.setCycle(cycle);
        scheduling.setRequirement(requirement);
        scheduling.setTdstart(start);
        scheduling.setTdend(end);
        scheduling.setTdstatus(tdstatus);
        int x= schedulingService.update(scheduling);
        Scheduling scheduling1=schedulingService.selectByPrimaryKey(Integer.parseInt(schedulingid));
        System.out.println(scheduling1.getProjectid());
        PageHelper.startPage(pn, 6);
        List<Rollplan> rollplans = rollplanService.findByprojectidandreceivesite(scheduling1.getProjectid(),"县发改");
        PageInfo page = new PageInfo(rollplans, 6);
        model.addAttribute("pageInfo", page);
        return "manager/tiaodu/projectinfo.jsp";
    }
    @RequestMapping("/citysave")
    public String citysave(@RequestParam(value = "pn", defaultValue = "1") Integer pn,
                       Model model,HttpServletRequest request){
        String schedulingid=request.getParameter("schedulingid");
        String name=request.getParameter("name");
        String stype=request.getParameter("stype");
        String cycle=request.getParameter("cycle");
        String tdstatus=request.getParameter("tdstatus");
        String requirement=request.getParameter("requirement");
        String startyear=request.getParameter("tdstart");
        String endyear=request.getParameter("tdend");
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
        Scheduling scheduling=schedulingService.selectByPrimaryKey(Integer.parseInt(schedulingid));
        scheduling.setName(name);
        scheduling.setStype(stype);
        scheduling.setCycle(cycle);
        scheduling.setRequirement(requirement);
        scheduling.setTdstart(start);
        scheduling.setTdend(end);
        scheduling.setTdstatus(tdstatus);
        int x= schedulingService.update(scheduling);
        Scheduling scheduling1=schedulingService.selectByPrimaryKey(Integer.parseInt(schedulingid));
        System.out.println(scheduling1.getProjectid());
        PageHelper.startPage(pn, 6);
        List<Rollplan> rollplans = rollplanService.findByprojectidandreceivesite(scheduling1.getProjectid(),"市发改");
        PageInfo page = new PageInfo(rollplans, 6);
        model.addAttribute("pageInfo", page);
        return "city/tiaodu/projectinfo.jsp";
    }
    @RequestMapping("/delmore")
    public String delmore(HttpServletRequest req, String ids){
        String[] sts = ids.split(",");
        for (int i = 0; i < sts.length; i++) {
                Scheduling scheduling=schedulingService.selectByPrimaryKey(Integer.parseInt(sts[i]));
                if (("新增").equals(scheduling.getTdstatus())) {
                    int h = schedulingService.deleteByPrimaryKey(Integer.parseInt(sts[i]));
                }
                else {
                    req.getSession().setAttribute("message","您选中的任务在调度中，不能删除!");
                }
        }
        return "redirect:bianzhi";
    }
    @RequestMapping("/citydelmore")
    public String citydelmore(HttpServletRequest req, String ids){
        String[] sts = ids.split(",");
        for (int i = 0; i < sts.length; i++) {
            Scheduling scheduling=schedulingService.selectByPrimaryKey(Integer.parseInt(sts[i]));
            if (("新增").equals(scheduling.getTdstatus())) {
                int h = schedulingService.deleteByPrimaryKey(Integer.parseInt(sts[i]));
            }
            else {
                req.getSession().setAttribute("message","您选中的任务在调度中，不能删除!");
            }
        }
        return "redirect:citybianzhi";
    }
    @RequestMapping("/xiafa")
    public String xiafa(HttpServletRequest req, String ids){
        String[] sts = ids.split(",");
        for (int i = 0; i < sts.length; i++) {
            Scheduling scheduling=schedulingService.selectByPrimaryKey(Integer.parseInt(sts[i]));
            if (scheduling.getTdstatus().equals("调度中")){
                req.getSession().setAttribute("mess","调度任务["+scheduling.getName()+"]调度中，不能操作“下发调度”按钮。");
            }else if(scheduling.getTdstatus().equals("已完成")){
                req.getSession().setAttribute("mess","调度任务["+scheduling.getName()+"]已完成调度，不能操作“下发调度”按钮。");
            } else {
                scheduling.setTdstatus("调度中");
                scheduling.setWritestatus("未填写");
                SimpleDateFormat sdf0 = new SimpleDateFormat("yyyy");
                SimpleDateFormat sdf1 = new SimpleDateFormat("MM");
                String str1 = sdf0.format(scheduling.getTdstart());
                String str2 = sdf1.format(scheduling.getTdstart());
                String snumber=str1.concat(str2);
                scheduling.setSnumber(snumber);
                Rollplan rollplan= rollplanService.findByprojectid(scheduling.getProjectid(),"县发改");
                scheduling.setTdxfunit(rollplan.getReceivesite());
                int h=schedulingService.update(scheduling);
            }
        }
        return "redirect:bianzhi";
    }
    @RequestMapping("/cityxiafa")
    public String cityxiafa(HttpServletRequest req, String ids){
        String[] sts = ids.split(",");
        for (int i = 0; i < sts.length; i++) {
            Scheduling scheduling=schedulingService.selectByPrimaryKey(Integer.parseInt(sts[i]));
            if (scheduling.getTdstatus().equals("调度中")){
                req.getSession().setAttribute("mess","调度任务["+scheduling.getName()+"]调度中，不能操作“下发调度”按钮。");
            }else if(scheduling.getTdstatus().equals("已完成")){
                req.getSession().setAttribute("mess","调度任务["+scheduling.getName()+"]已完成调度，不能操作“下发调度”按钮。");
            } else {
                scheduling.setTdstatus("调度中");
                scheduling.setWritestatus("未填写");
                SimpleDateFormat sdf0 = new SimpleDateFormat("yyyy");
                SimpleDateFormat sdf1 = new SimpleDateFormat("MM");
                String str1 = sdf0.format(scheduling.getTdstart());
                String str2 = sdf1.format(scheduling.getTdstart());
                System.out.println("年份为："+str1);
                System.out.println("月份为："+str2);
                String snumber=str1.concat(str2);
                scheduling.setSnumber(snumber);
                Rollplan rollplan= rollplanService.findByprojectid(scheduling.getProjectid(),"市发改");
                scheduling.setTdxfunit(rollplan.getReceivesite());
                int h=schedulingService.update(scheduling);
            }
        }
        return "redirect:citybianzhi";
    }
    @RequestMapping("/countyguanli")
    public String countyguanli(  @RequestParam(value = "pn", defaultValue = "1") Integer pn,
                                Model model,HttpServletRequest req) {
        PageHelper.startPage(pn, 6);
        List<Scheduling> schedulings = schedulingService.findBytdstatus("调度中");
        PageInfo page = new PageInfo(schedulings, 6);
        model.addAttribute("pageInfo", page);
        List<Rollplan> rollplans=rollplanService.findAll();
        req.getSession().setAttribute("rollplans", rollplans);
        return "manager/tiaodu/mytiaodutask.jsp";
    }
    @RequestMapping("/cityguanli")
    public String cityguanli(  @RequestParam(value = "pn", defaultValue = "1") Integer pn,
                                 Model model,HttpServletRequest req) {
        PageHelper.startPage(pn, 6);
        List<Scheduling> schedulings = schedulingService.findBytdxfunitandtdstatus("调度中","市发改");
        PageInfo page = new PageInfo(schedulings, 6);
        model.addAttribute("pageInfo", page);
        List<Rollplan> rollplans=rollplanService.findyearrollplanBysendstatus("市发改");
        req.getSession().setAttribute("rollplans", rollplans);
        return "city/tiaodu/mytiaodutask.jsp";
    }
    @RequestMapping("/tiaoduwrite")
    public String tiaoduwrite(HttpServletRequest req){
        int projectid=Integer.parseInt(req.getParameter("projectid"));
        int rollplanid=Integer.parseInt(req.getParameter("rollplanid"));
        int schedulingid=Integer.parseInt(req.getParameter("schedulingid"));
        Project project=projectService.findprojectByID(projectid);
        req.getSession().setAttribute("project", project);
        Scheduling scheduling=schedulingService.selectByPrimaryKey(schedulingid);
        req.getSession().setAttribute("scheduling", scheduling);
        return "manager/tiaodu/tiaoduwrite.jsp";
    }
    @RequestMapping("/citytiaoduwrite")
    public String citytiaoduwrite(HttpServletRequest req){
        int projectid=Integer.parseInt(req.getParameter("projectid"));
        int rollplanid=Integer.parseInt(req.getParameter("rollplanid"));
        int schedulingid=Integer.parseInt(req.getParameter("schedulingid"));
        Project project=projectService.findprojectByID(projectid);
        req.getSession().setAttribute("project", project);
        Scheduling scheduling=schedulingService.selectByPrimaryKey(schedulingid);
        req.getSession().setAttribute("scheduling", scheduling);
        return "city/tiaodu/tiaoduwrite.jsp";
    }
    @RequestMapping("/savetiaodu")
    public String savetiaodu(HttpServletRequest request){
        int schedulingid=Integer.parseInt(request.getParameter("schedulingid"));
        String reallystart=request.getParameter("reallystart");
        String reallyend=request.getParameter("reallyend");
        String zbtype=request.getParameter("zbtype");
        String buildunit=request.getParameter("buildunit");
        String imageprogress=request.getParameter("imageprogress");
        String question=request.getParameter("question");
        String sendfund=request.getParameter("sendfund");
        String finishfund=request.getParameter("finishfund");
        SimpleDateFormat format= new SimpleDateFormat("yyyy-MM-dd");
        Date start= null;
        try {
            start = format.parse(reallystart);
        } catch (ParseException e) {
            e.printStackTrace();
        }
        Date end= null;
        try {
            end = format.parse(reallyend);
        } catch (ParseException e) {
            e.printStackTrace();
        }
        Scheduling scheduling=schedulingService.selectByPrimaryKey(schedulingid);
        scheduling.setReallystart(start);
        scheduling.setReallyend(end);
        scheduling.setZbtype(zbtype);
        scheduling.setBuildunit(buildunit);
        scheduling.setImageprogress(imageprogress);
        scheduling.setQuestion(question);
        scheduling.setSendfund(sendfund);
        scheduling.setFinishfund(finishfund);
        scheduling.setWritestatus("有变化");
        int h=schedulingService.update(scheduling);
        return "redirect:countyguanli";
    }
    @RequestMapping("/citysavetiaodu")
    public String citysavetiaodu(HttpServletRequest request){
        int schedulingid=Integer.parseInt(request.getParameter("schedulingid"));
        SimpleDateFormat format= new SimpleDateFormat("yyyy-MM-dd");
        Date start= null;
        try {
            start = format.parse(request.getParameter("reallystart"));
        } catch (ParseException e) {
            e.printStackTrace();
        }
        Date end= null;
        try {
            end = format.parse(request.getParameter("reallyend"));
        } catch (ParseException e) {
            e.printStackTrace();
        }
        Scheduling scheduling=schedulingService.selectByPrimaryKey(schedulingid);
        scheduling.setReallystart(start);
        scheduling.setReallyend(end);
        scheduling.setZbtype(request.getParameter("zbtype"));
        scheduling.setBuildunit(request.getParameter("buildunit"));
        scheduling.setImageprogress(request.getParameter("imageprogress"));
        scheduling.setQuestion(request.getParameter("question"));
        scheduling.setSendfund(request.getParameter("sendfund"));
        scheduling.setFinishfund(request.getParameter("finishfund"));
        scheduling.setWritestatus("有变化");
        int h=schedulingService.update(scheduling);
        return "redirect:cityguanli";
    }
    @RequestMapping("/queren")
    public String queren(HttpServletRequest req, String ids){
        String[] sts = ids.split(",");
        for (int i = 0; i < sts.length; i++) {
            Scheduling scheduling=schedulingService.selectByPrimaryKey(Integer.parseInt(sts[i]));
            if(scheduling.getWritestatus().equals("未填写"))
            {
                req.getSession().setAttribute("message","调度任务["+scheduling.getName()+"]还未填写实施情况，不能进行确认。");
            }else {
                scheduling.setTdstatus("已完成");
                int h = schedulingService.update(scheduling);
            }
        }
        return "redirect:countyguanli";
    }
    @RequestMapping("/cityqueren")
    public String cityqueren(HttpServletRequest req, String ids){
        String[] sts = ids.split(",");
        for (int i = 0; i < sts.length; i++) {
            Scheduling scheduling=schedulingService.selectByPrimaryKey(Integer.parseInt(sts[i]));
            if(scheduling.getWritestatus().equals("未填写"))
            {
                req.getSession().setAttribute("message","下级单位还未填报调度任务["+scheduling.getName()+"]实施情况，不能进行确认。");
            }else {
                scheduling.setTdstatus("已完成");
                int h = schedulingService.update(scheduling);
            }
        }
        return "redirect:cityguanli";
    }
    @RequestMapping("/finishtask")
    public String finishtask(  @RequestParam(value = "pn", defaultValue = "1") Integer pn,
                                   Model model,HttpServletRequest req) {
        PageHelper.startPage(pn, 6);
        List<Scheduling> schedulings = schedulingService.findBytdstatus("已完成");
        PageInfo page = new PageInfo(schedulings, 6);
        model.addAttribute("pageInfo", page);
        List<Rollplan> rollplans=rollplanService.findAll();
        req.getSession().setAttribute("rollplans", rollplans);
        return "manager/tiaodu/finishtask.jsp";
    }
    @RequestMapping("/cityfinishtask")
    public String cityfinishtask(  @RequestParam(value = "pn", defaultValue = "1") Integer pn,
                               Model model,HttpServletRequest req) {
        PageHelper.startPage(pn, 6);
        List<Scheduling> schedulings = schedulingService.findBytdxfunitandtdstatus("已完成","市发改");
        PageInfo page = new PageInfo(schedulings, 6);
        model.addAttribute("pageInfo", page);
        List<Rollplan> rollplans=rollplanService.findyearrollplanBysendstatus("市发改");
        req.getSession().setAttribute("rollplans", rollplans);
        return "city/tiaodu/finishtask.jsp";
    }
}
