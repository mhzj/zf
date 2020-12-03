package com.controller.houtai;
import com.dao.ProjectMapper;
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
import java.io.UnsupportedEncodingException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;
@Controller
@RequestMapping("/project")
public class ProjectController {
    @Autowired
    private ProjectService projectService;
    @Autowired
    private ProjectsendService projectsendService;
    @Autowired
    private UserService userService;
    @Autowired
    private User_ProjectService user_projectService;
    @Autowired
    private ReviewService reviewService;
    @Autowired
    private SchedulingService schedulingService;
    @Autowired
    private RollplanService rollplanService;
    private User loginuser;
    private Project sendproject;
    @RequestMapping("/projectguanli")
    public String getProject(
            @RequestParam(value = "pn", defaultValue = "1") Integer pn,
            Model model) {
        PageHelper.startPage(pn, 6);
        List<Project> projects = projectService.findBysendstatus("待上报");
        PageInfo page = new PageInfo(projects, 6);
        model.addAttribute("pageInfo", page);
        return "admin/projectinfo.jsp";
    }

    @RequestMapping("/updateproject")
    public String updateproject(HttpServletRequest req){
        int projectid=Integer.parseInt(req.getParameter("projectid"));
        Project project=projectService.findprojectByID(projectid);
        req.getSession().setAttribute("updateproject", project);
        return "admin/projectupdate.jsp";
    }
    @RequestMapping("/dealmore")
    public String dealmore(HttpServletRequest req,String ids){
        String[] strs = ids.split(",");
        for (int i = 0; i < strs.length; i++) {
            int z=projectService.delproject(Integer.parseInt(strs[i]));
            int m=user_projectService.delUser_Project(Integer.parseInt(strs[i]));
        }
        return "redirect:projectguanli";
    }
    @RequestMapping("/delproject")
    public String delproject(HttpServletRequest req){
        int projectid=Integer.parseInt(req.getParameter("projectid"));
        int i=projectService.delproject(projectid);
        int m=user_projectService.delUser_Project(projectid);
        return "redirect:projectguanli";
    }
    @RequestMapping("/insert")
    public String insert(HttpServletRequest req) {
        SimpleDateFormat format= new SimpleDateFormat("yyyy-MM-dd");
        Date start= null;
        try {
            start = format.parse(req.getParameter("startyear"));
        } catch (ParseException e) {
            e.printStackTrace();
        }
        Date end= null;
        try {
            end = format.parse(req.getParameter("endyear"));
        } catch (ParseException e) {
            e.printStackTrace();
        }
        Date rtime= null;
        try {
            rtime = format.parse(req.getParameter("reviewtime"));
        } catch (ParseException e) {
            e.printStackTrace();
        }
        Project project=new Project();
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
        int x=projectService.insert(project);
        Project project1=projectService.selectByName(req.getParameter("name"));
        String institutionname=project1.getInstitution();
        loginuser=userService.findUserByInstitutionName(institutionname);
        User_project user_project=new User_project();
        user_project.setUserid(loginuser.getUserid());
        user_project.setProjectid(project1.getProjectid());
        user_project.setCreatetime(new java.sql.Date(new java.util.Date().getTime()));
        int m=user_projectService.addUser_Project(user_project);
        return "redirect:projectguanli";
    }
    @RequestMapping("/save")
    public String save(HttpServletRequest req){
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
        return "redirect:projectguanli";
    }
    @RequestMapping("/searchproject")
    public String searchproject( @RequestParam(value = "pn", defaultValue = "1") Integer pn,
                                    Model model,HttpServletRequest request) throws UnsupportedEncodingException{
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

    @RequestMapping("/projectcheck")
    public String projectcheck(HttpServletRequest req,String ids){
        String[] strs = ids.split(",");
        for (int i = 0; i < strs.length; i++) {
            try {
                Project project=projectService.findprojectByID(Integer.parseInt(strs[i]));
                req.getSession().setAttribute("updateproject", project);
            } catch (Exception e) {
            }
        }
        return "admin/projectcheck.jsp";
    }
    @RequestMapping("/send")
    public String send(HttpServletRequest req) {
        int projectid = Integer.parseInt(req.getParameter("projectid"));
         sendproject = projectService.findprojectByID(projectid);
        req.getSession().setAttribute("sendproject", sendproject);
        return "admin/send.jsp";
    }

    @RequestMapping("/projectsend")
    public String projectsend(HttpServletRequest req){
        int projectid = sendproject.getProjectid();
        Project project = projectService.findprojectByID(projectid);
        User user=userService.findUserByInstitutionName(project.getInstitution());
        String receivesite=req.getParameter("receivesite");
        project.setSendstatus("已上报");
        Projectsend projectsend=new Projectsend();
        projectsend.setProjectid(projectid);
        if(user.getInstitutionname().contains("县发改")){
            projectsend.setRate("县级");
        }else if(user.getInstitutionname().contains("市发改")){
            projectsend.setRate("市级");
        }else {
            projectsend.setRate("无");
        }
        projectsend.setStatus("已上报");
        projectsend.setFromsite(user.getInstitutionname());
        projectsend.setReceivesite(receivesite);
        projectsend.setSavetime(new java.sql.Date(new java.util.Date().getTime()));
        int h= projectService.updateproject(project);
        int m=projectsendService.addProjectsend(projectsend);
        Review review=new Review();
        review.setShoption("待审核");
        review.setProjectid(projectsend.getProjectid());
        review.setRate(projectsend.getRate());
        review.setInstitution(projectsend.getReceivesite());
        review.setProjectname(project.getName());
        review.setProjectype(project.getType());
        review.setSite(project.getSite());
        review.setGbindustry(project.getGbindustry());
        review.setIndustry(project.getIndustry());
        review.setFund(project.getAllfund());
        review.setStarttime(project.getStartyear());
        review.setEndtime(project.getEndyear());
        review.setSendtime(projectsend.getSavetime());
        review.setFromsite(projectsend.getFromsite());
        review.setCreatetime(new java.sql.Date(new java.util.Date().getTime()));
        review.setStatus("待审核");
        int n=reviewService.insert(review);
        return "redirect:projectguanli";
    }

    @RequestMapping("/allproject")
    public String allproject(    @RequestParam(value = "pn", defaultValue = "1") Integer pn,
                                 Model model, HttpServletRequest req) {
        PageHelper.startPage(pn, 6);
        List<Project> list=projectService.selectProject();
        req.getSession().setAttribute("projects", list);
        List<Projectsend> projectsends=projectsendService.findAll();
        req.getSession().setAttribute("projectsends", projectsends);
        PageInfo page = new PageInfo(list, 6);
        model.addAttribute("pageInfo", page);
        return "admin/projectall.jsp";
    }

    @RequestMapping("/searchAll")
    public String searchAll( @RequestParam(value = "pn", defaultValue = "1") Integer pn,
                                 Model model,HttpServletRequest request){
        PageHelper.startPage(pn, 6);
        String name=request.getParameter("name");
        String sendstatus=request.getParameter("sendstatus");
        request.setAttribute("name", name);
        request.setAttribute("sendstatus",sendstatus);
        List<Project> searchlist;
        if(" ".equals(name)){
            if(" ".equals(sendstatus)){
                    searchlist=projectService.selectProject();
                }
            else {
                    searchlist=projectService.findBysendstatus(sendstatus.replace("'", ""));
                }
        }
        else {
            if (" ".equals(sendstatus)){
                searchlist=projectService.findProjectByName(name.replace("'", ""));
            }
            else{
                searchlist=projectService.findByNameandSendstatus(name.replace("'", ""),sendstatus.replace("'", ""));
            }
        }
        PageInfo page = new PageInfo(searchlist, 6);
        model.addAttribute("search", page);
        List<Projectsend> projectsends=projectsendService.findAll();
        request.getSession().setAttribute("searchsends", projectsends);
        return "admin/projectall1.jsp";
    }
    @RequestMapping("/tiaoducountyguanli")
    public String tiaoducountyguanli(  @RequestParam(value = "pn", defaultValue = "1") Integer pn,
                                 Model model,HttpServletRequest req) {
        PageHelper.startPage(pn, 6);
        List<Scheduling> schedulings = schedulingService.findBytdstatus("调度中");
        PageInfo page = new PageInfo(schedulings, 6);
        model.addAttribute("pageInfo", page);
        List<Rollplan> rollplans=rollplanService.findAll();
        req.getSession().setAttribute("rollplans", rollplans);
        return "admin/tiaodu/mytiaodutask.jsp";
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
        return "admin/tiaodu/tiaoduwrite.jsp";
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
        return "redirect:tiaoducountyguanli";
    }
    @RequestMapping("/tiaodufinish")
    public String tiaodufinish(  @RequestParam(value = "pn", defaultValue = "1") Integer pn,
                                       Model model,HttpServletRequest req) {
        PageHelper.startPage(pn, 6);
        List<Scheduling> schedulings = schedulingService.findBytdstatus("已完成");
        PageInfo page = new PageInfo(schedulings, 6);
        model.addAttribute("pageInfo", page);
        List<Rollplan> rollplans=rollplanService.findyearrollplanBysendstatus("县发改");
        req.getSession().setAttribute("rollplans", rollplans);
        return "admin/tiaodu/finishtask.jsp";
    }

}
