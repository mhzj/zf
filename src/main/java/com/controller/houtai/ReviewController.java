package com.controller.houtai;

import com.entity.*;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.service.*;
import com.sun.org.apache.regexp.internal.RE;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import javax.servlet.http.HttpServletRequest;
import java.io.UnsupportedEncodingException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@Controller
@RequestMapping("/review")
public class ReviewController {
    @Autowired
    private ReviewService reviewService;
    @Autowired
    private ProjectService projectService;
    @Autowired
    private ProjectsendService projectsendService;
    @Autowired
    private RollplanService rollplanService;
    @Autowired
    private User_ProjectService user_projectService;
    @Autowired
    private UserService userService;
    @RequestMapping("/waitguanli")
    public String getReview(
            @RequestParam(value = "pn", defaultValue = "1") Integer pn,
            Model model) {
        PageHelper.startPage(pn, 6);
        List<Review> reviews = reviewService.findByshoption("待审核","县发改");
        PageInfo page = new PageInfo(reviews, 6);
        model.addAttribute("pageInfo", page);
        return "manager/review/waitreview.jsp";
    }
    @RequestMapping("/citywaitguanli")
    public String citywaitguanli(
            @RequestParam(value = "pn", defaultValue = "1") Integer pn,
            Model model) {
        PageHelper.startPage(pn, 6);
        List<Review> reviews = reviewService.findByshoption("待审核","市发改");
        PageInfo page = new PageInfo(reviews, 6);
        model.addAttribute("pageInfo", page);
        return "city/review/waitreview.jsp";
    }
    @RequestMapping("/finishreview")
    public String getfinishReview(
            @RequestParam(value = "pn", defaultValue = "1") Integer pn,
            Model model) {
        PageHelper.startPage(pn, 6);
        List<Review> reviews = reviewService.findByshoption("已审核","县发改");
        PageInfo page = new PageInfo(reviews, 6);
        model.addAttribute("pageInfo", page);
        return "manager/review/finishreview.jsp";
    }
    @RequestMapping("/cityfinishreview")
    public String cityfinishreview(
            @RequestParam(value = "pn", defaultValue = "1") Integer pn,
            Model model) {
        PageHelper.startPage(pn, 6);
        List<Review> reviews = reviewService.findByshoption("已审核","市发改");
        PageInfo page = new PageInfo(reviews, 6);
        model.addAttribute("pageInfo", page);
        return "city/review/finishreview.jsp";
    }
    @RequestMapping("/ruku")
    public String ruku(HttpServletRequest request){
        String ids=request.getParameter("ids");
        request.setAttribute("ids", ids);
        return "manager/review/ruku.jsp";
    }
    @RequestMapping("/cityruku")
    public String cityruku(HttpServletRequest request){
        String ids=request.getParameter("ids");
        request.setAttribute("ids", ids);
        return "city/review/ruku.jsp";
    }
    @RequestMapping("/delmore")
    public String delmore(HttpServletRequest req,String ids){
        String []ss = ids.split(",");
        for (int i = 0; i < ss.length; i++) {
            int z= reviewService.deletereviewByID(Integer.parseInt(ss[i]));
        }
        return "redirect:waitguanli";
    }
    @RequestMapping("/citydelmore")
    public String citydelmore(HttpServletRequest req,String ids){
        String []ss = ids.split(",");
        for (int i = 0; i < ss.length; i++) {
            int z= reviewService.deletereviewByID(Integer.parseInt(ss[i]));
        }
        return "redirect:citywaitguanli";
    }
    @RequestMapping("/tuihui")
    public String tuihui(HttpServletRequest req,String ids){
       String []ss = ids.split(",");
        for (int i = 0; i < ss.length; i++) {
                Review review= reviewService.findreviewByID(Integer.parseInt(ss[i]));
                review.setShoption("待审核");
                int h=reviewService.update(review);
        }
        return "redirect:finishreview";
    }
    @RequestMapping("/citytuihui")
    public String citytuihui(HttpServletRequest req,String ids){
        String []ss = ids.split(",");
        for (int i = 0; i < ss.length; i++) {
                Review review= reviewService.findreviewByID(Integer.parseInt(ss[i]));
                review.setShoption("待审核");
                int h=reviewService.update(review);
        }
        return "redirect:cityfinishreview";
    }
    @RequestMapping("/oneguiku")
    public String oneguiku(HttpServletRequest req,String ids) {
        String []strs = ids.split(",");
        for (int i = 0; i < strs.length; i++) {
                Review review = reviewService.findreviewByID(Integer.parseInt(strs[i]));
                review.setShoption("已审核");
                int z = reviewService.update(review);
                Projectsend projectsend = projectsendService.findByprojectid(review.getProjectid());
                if (review.getStatus().equals("待审核"))
                    projectsend.setFromproject("下级填报");
                if (review.getStatus().equals("新增"))
                    projectsend.setFromproject("本级填报");
                if (projectsend.getReceivesite().contains("县发改")) {
                    projectsend.setSaverate("县级储备");
                    projectsend.setSavesite(projectsend.getReceivesite());
                }
                if (projectsend.getReceivesite().contains("市发改")) {
                    projectsend.setSaverate("市级储备");
                    projectsend.setSavesite(projectsend.getReceivesite());
                }
                projectsend.setProjectname(review.getProjectname());
                projectsend.setProjecttype(review.getProjectype());
                projectsend.setSite(review.getSite());
                projectsend.setGbindustry(review.getGbindustry());
                projectsend.setIndustry(review.getIndustry());
                projectsend.setInvestment(review.getFund());
                projectsend.setStarttime(review.getStarttime());
                projectsend.setEndtime(review.getEndtime());
                projectsend.setLibrarytype(req.getParameter("librarytype"));
                projectsend.setChubeitime(new java.sql.Date(new java.util.Date().getTime()));
                int h = projectsendService.update(projectsend);
        }
        return "redirect:waitguanli";
    }
    @RequestMapping("/cityoneguiku")
    public String cityoneguiku(HttpServletRequest req,String ids) {
        String librarytype=req.getParameter("librarytype");
        String []strs = ids.split(",");
        for (int i = 0; i < strs.length; i++) {
            Review review = reviewService.findreviewByID(Integer.parseInt(strs[i]));
            review.setShoption("已审核");
            int z = reviewService.update(review);
            Project project=projectService.findprojectByID(review.getProjectid());
            project.setSendstatus("已上报");
            int h=projectService.updateproject(project);
            Projectsend projectsend=new Projectsend();
            projectsend.setProjectid(review.getProjectid());
            projectsend.setReceivesite(review.getInstitution());
            if (review.getStatus().equals("待审核"))
                projectsend.setFromproject("下级填报");
            if (review.getStatus().equals("新增"))
                projectsend.setFromproject("本级填报");
            if (projectsend.getReceivesite().contains("县发改")) {
                projectsend.setSaverate("县级储备");
                projectsend.setSavesite(projectsend.getReceivesite());
            }
            if (projectsend.getReceivesite().contains("市发改")) {
                projectsend.setSaverate("市级储备");
                projectsend.setSavesite(projectsend.getReceivesite());
            }
            projectsend.setStatus("已上报");
            projectsend.setRate(review.getRate());
            projectsend.setFromsite(review.getFromsite());
            projectsend.setProjectname(review.getProjectname());
            projectsend.setProjecttype(review.getProjectype());
            projectsend.setSite(review.getSite());
            projectsend.setGbindustry(review.getGbindustry());
            projectsend.setIndustry(review.getIndustry());
            projectsend.setInvestment(review.getFund());
            projectsend.setStarttime(review.getStarttime());
            projectsend.setEndtime(review.getEndtime());
            projectsend.setLibrarytype(librarytype);
            projectsend.setChubeitime(new java.sql.Date(new java.util.Date().getTime()));
            projectsend.setSavetime(new java.sql.Date(new java.util.Date().getTime()));
            int j= projectsendService.addProjectsend(projectsend);
        }
        return "redirect:citywaitguanli";
    }
    @RequestMapping("/twoguiku")
    public String twoguiku(HttpServletRequest req,String ids) {
        String librarytype=req.getParameter("librarytype");
        System.out.println(librarytype);
        String []strs = ids.split(",");
            for (int i = 0; i < strs.length; i++) {
                    Review review = reviewService.findreviewByID(Integer.parseInt(strs[i]));
                    review.setShoption("已审核");
                    int z = reviewService.update(review);
                    Projectsend projectsend = projectsendService.findByprojectid(review.getProjectid());
                    if (review.getStatus().equals("待审核"))
                        projectsend.setFromproject("下级填报");
                    if (review.getStatus().equals("新增"))
                        projectsend.setFromproject("本级填报");
                    if (projectsend.getReceivesite().contains("县发改")) {
                        projectsend.setSaverate("县级储备");
                        projectsend.setSavesite(projectsend.getReceivesite());
                    }
                    if (projectsend.getReceivesite().contains("市发改")) {
                        projectsend.setSaverate("市级储备");
                        projectsend.setSavesite(projectsend.getReceivesite());
                    }
                    projectsend.setProjectname(review.getProjectname());
                    projectsend.setProjecttype(review.getProjectype());
                    projectsend.setSite(review.getSite());
                    projectsend.setGbindustry(review.getGbindustry());
                    projectsend.setIndustry(review.getIndustry());
                    projectsend.setInvestment(review.getFund());
                    projectsend.setStarttime(review.getStarttime());
                    projectsend.setEndtime(review.getEndtime());
                    projectsend.setLibrarytype(librarytype);
                    projectsend.setChubeitime(new java.sql.Date(new java.util.Date().getTime()));
                    int h = projectsendService.update(projectsend);
                    Rollplan rollplan = new Rollplan();
                    rollplan.setProjectid(review.getProjectid());
                    rollplan.setRate(review.getRate());
                    rollplan.setProjectname(review.getProjectname());
                    rollplan.setProjecttype(review.getProjectype());
                    rollplan.setSite(review.getSite());
                    rollplan.setFromsite(review.getFromsite());
                    rollplan.setIndustry(review.getIndustry());
                    rollplan.setInvestment(review.getFund());
                    rollplan.setStarttime(review.getStarttime());
                    rollplan.setEndtime(review.getEndtime());
                    rollplan.setPlantime(new java.sql.Date(new java.util.Date().getTime()));
                    rollplan.setUpdatetime(new java.sql.Date(new java.util.Date().getTime()));
                    rollplan.setReceivesite(review.getInstitution());
                    rollplan.setSendstatus("已编制");
                    int j = rollplanService.insertSelective(rollplan);
            }
        return "redirect:waitguanli";
    }
    @RequestMapping("/citytwoguiku")
    public String citytwoguiku(HttpServletRequest req,String ids) {
        String librarytype=req.getParameter("librarytype");
        System.out.println(librarytype);
        String []strs = ids.split(",");
        for (int i = 0; i < strs.length; i++) {
                Review review = reviewService.findreviewByID(Integer.parseInt(strs[i]));
                review.setShoption("已审核");
                int z = reviewService.update(review);
                Project project=projectService.findprojectByID(review.getProjectid());
                project.setSendstatus("已上报");
                int h=projectService.updateproject(project);
                Projectsend projectsend=new Projectsend();
                projectsend.setProjectid(review.getProjectid());
                projectsend.setReceivesite(review.getInstitution());
                if (review.getStatus().equals("待审核"))
                    projectsend.setFromproject("下级填报");
                if (review.getStatus().equals("新增"))
                    projectsend.setFromproject("本级填报");
                if (projectsend.getReceivesite().contains("县发改")) {
                    projectsend.setSaverate("县级储备");
                    projectsend.setSavesite(projectsend.getReceivesite());
                }
                if (projectsend.getReceivesite().contains("市发改")) {
                    projectsend.setSaverate("市级储备");
                    projectsend.setSavesite(projectsend.getReceivesite());
                }
                projectsend.setStatus("已上报");
                projectsend.setRate(review.getRate());
                projectsend.setFromsite(review.getFromsite());
                projectsend.setProjectname(review.getProjectname());
                projectsend.setProjecttype(review.getProjectype());
                projectsend.setSite(review.getSite());
                projectsend.setGbindustry(review.getGbindustry());
                projectsend.setIndustry(review.getIndustry());
                projectsend.setInvestment(review.getFund());
                projectsend.setStarttime(review.getStarttime());
                projectsend.setEndtime(review.getEndtime());
                projectsend.setLibrarytype(librarytype);
                projectsend.setChubeitime(new java.sql.Date(new java.util.Date().getTime()));
                projectsend.setSavetime(new java.sql.Date(new java.util.Date().getTime()));
                int j= projectsendService.addProjectsend(projectsend);
                Rollplan rollplan = new Rollplan();
                rollplan.setProjectid(review.getProjectid());
                rollplan.setRate(review.getRate());
                rollplan.setProjectname(review.getProjectname());
                rollplan.setProjecttype(review.getProjectype());
                rollplan.setSite(review.getSite());
                rollplan.setFromsite(review.getFromsite());
                rollplan.setIndustry(review.getIndustry());
                rollplan.setInvestment(review.getFund());
                rollplan.setStarttime(review.getStarttime());
                rollplan.setEndtime(review.getEndtime());
                rollplan.setPlantime(new java.sql.Date(new java.util.Date().getTime()));
                rollplan.setUpdatetime(new java.sql.Date(new java.util.Date().getTime()));
                rollplan.setReceivesite(review.getInstitution());
                rollplan.setSendstatus("已编制");
                int m = rollplanService.insertSelective(rollplan);
        }
        return "redirect:citywaitguanli";
    }
    @RequestMapping("/projectvisit")
    public String projectvisit(HttpServletRequest req){
        int projectid=Integer.parseInt(req.getParameter("projectid"));
        Project project=projectService.findprojectByID(projectid);
        req.getSession().setAttribute("updateproject", project);
        return "manager/review/projectvisit.jsp";
    }
    @RequestMapping("/search")
    public String search( @RequestParam(value = "pn", defaultValue = "1") Integer pn,
                          Model model,HttpServletRequest request) throws UnsupportedEncodingException {
        PageHelper.startPage(pn, 6);
        String name=request.getParameter("projectname");
        String type=request.getParameter("projectype");
        String site=request.getParameter("site");
        request.setAttribute("projectname", name);
        request.setAttribute("projectype",type);
        request.setAttribute("site", site);
        List<Review> searchlist ;
        if(" ".equals(name)){
            if(" ".equals(type)){
                if(" ".equals(site)){
                    searchlist=reviewService.findByshoption("待审核","县发改");
                }
                else {
                    searchlist= reviewService.listBywaitSite(site.replace("'", ""));
                }
            }
            else {
                if (" ".equals(site)){
                    searchlist=reviewService.listBywaitType(type.replace("'", ""));
                }
                else {
                    searchlist=reviewService.findBywaitTypeandSite(type.replace("'", ""),site.replace("'", ""));
                }
            }
        }
        else {
            if(" ".equals(type)){
                if (" ".equals(site)){

                    searchlist=reviewService.findBywaitName(name.replace("'", ""));
                }
                else {

                    searchlist=reviewService.findBywaitSiteandName(name.replace("'", ""),site.replace("'", ""));
                }
            }
            else {
                if (" ".equals(site)){

                    searchlist=reviewService.findBywaitTypeandName(type.replace("'", ""),name.replace("'", ""));
                }
                else {

                    searchlist=reviewService.findBywaitNameTypeandSite(name.replace("'", ""),type.replace("'", ""),site.replace("'", ""));
                }
            }
        }
        PageInfo page = new PageInfo(searchlist, 6);
        model.addAttribute("searchreview", page);
        return "manager/review/waitreview1.jsp";
    }
    @RequestMapping("/citysearch")
    public String citysearch( @RequestParam(value = "pn", defaultValue = "1") Integer pn,
                          Model model,HttpServletRequest request) throws UnsupportedEncodingException {
        PageHelper.startPage(pn, 6);
        String name=request.getParameter("projectname");
        String type=request.getParameter("projectype");
        String site=request.getParameter("site");
        request.setAttribute("projectname", name);
        request.setAttribute("projectype",type);
        request.setAttribute("site", site);
        List<Review> searchlist ;
        if(" ".equals(name)){
            if(" ".equals(type)){
                if(" ".equals(site)){
                    searchlist=reviewService.findByshoption("待审核","市发改");
                }
                else {
                    searchlist= reviewService.listBywaitSite(site.replace("'", ""));
                }
            }
            else {
                if (" ".equals(site)){
                    searchlist=reviewService.listBywaitType(type.replace("'", ""));
                }
                else {
                    searchlist=reviewService.findBywaitTypeandSite(type.replace("'", ""),site.replace("'", ""));
                }
            }
        }
        else {
            if(" ".equals(type)){
                if (" ".equals(site)){

                    searchlist=reviewService.findBywaitName(name.replace("'", ""));
                }
                else {

                    searchlist=reviewService.findBywaitSiteandName(name.replace("'", ""),site.replace("'", ""));
                }
            }
            else {
                if (" ".equals(site)){

                    searchlist=reviewService.findBywaitTypeandName(type.replace("'", ""),name.replace("'", ""));
                }
                else {

                    searchlist=reviewService.findBywaitNameTypeandSite(name.replace("'", ""),type.replace("'", ""),site.replace("'", ""));
                }
            }
        }
        PageInfo page = new PageInfo(searchlist, 6);
        model.addAttribute("searchreview", page);
        return "city/review/waitreview1.jsp";
    }
    @RequestMapping("/insert")
    public String insert(HttpServletRequest req) {
        String countryid=req.getParameter("countryid");
        String placeid=req.getParameter("placeid");
        String name=req.getParameter("name");
        String type=req.getParameter("type");
        String property=req.getParameter("property");
        String country=req.getParameter("country");
        String institution=req.getParameter("institution");
        String site=req.getParameter("site");
        String address=req.getParameter("address");
        String gbindustry=req.getParameter("gbindustry");
        String industry=req.getParameter("industry");
        String investment=req.getParameter("investment");
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
        String buildscale=req.getParameter("buildscale");
        String quantifyscale=req.getParameter("quantifyscale");
        String content=req.getParameter("content");
        String dutyperson=req.getParameter("dutyperson");
        String dutypersontel=req.getParameter("dutypersontel");
        String conperson=req.getParameter("conperson");
        String conpersontel=req.getParameter("conpersontel");
        String fundtype=req.getParameter("fundtype");
        String allfund=req.getParameter("allfund");
        String xfund=req.getParameter("xfund");
        String finvestment=req.getParameter("finvestment");
        String sfund=req.getParameter("sfund");
        String reviewthing=req.getParameter("reviewthing");
        String reviewinstitution=req.getParameter("reviewinstitution");
        String reviewtime=req.getParameter("reviewtime");
        Date rtime= null;
        try {
            rtime = format.parse(reviewtime);
        } catch (ParseException e) {
            e.printStackTrace();
        }
        String reviewname=req.getParameter("reviewname");
        String reviewnumber=req.getParameter("reviewnumber");
        String reviewstatus=req.getParameter("reviewstatus");
        String sendstatus=req.getParameter("sendstatus");
        Project project=new Project();
        project.setCountryid(countryid);
        project.setPlaceid(placeid);
        project.setName(name);
        project.setType(type);
        project.setProperty(property);
        project.setCountry(country);
        project.setInstitution(institution);
        project.setSite(site);
        project.setAddress(address);
        project.setGbindustry(gbindustry);
        project.setIndustry(industry);
        project.setInvestment(investment);
        project.setStartyear(new java.sql.Date(start.getTime()));
        project.setEndyear(new java.sql.Date(end.getTime()));
        project.setBuildscale(buildscale);
        project.setQuantifyscale(quantifyscale);
        project.setContent(content);
        project.setDutyperson(dutyperson);
        project.setDutypersontel(dutypersontel);
        project.setConperson(conperson);
        project.setConpersontel(conpersontel);
        project.setFundtype(fundtype);
        project.setAllfund(allfund);
        project.setXfund(xfund);
        project.setFinvestment(finvestment);
        project.setSfund(sfund);
        project.setReviewthing(reviewthing);
        project.setReviewinstitution(reviewinstitution);
        project.setReviewtime(new java.sql.Date(rtime.getTime()));
        project.setReviewnumber(reviewnumber);
        project.setReviewstatus(reviewstatus);
        project.setSendstatus(sendstatus);
        int x=projectService.insert(project);
        Project project1=projectService.selectByName(name);
        User loginuser=userService.findUserByInstitutionName(project1.getInstitution());
        User_project user_project=new User_project();
        user_project.setUserid(loginuser.getUserid());
        user_project.setProjectid(project1.getProjectid());
        user_project.setCreatetime(new java.sql.Date(new java.util.Date().getTime()));
        int m=user_projectService.addUser_Project(user_project);
        Review review=new Review();
        review.setShoption("待审核");
        review.setProjectid(project1.getProjectid());
        review.setRate("无");
        review.setInstitution(project1.getInstitution());
        review.setProjectname(project1.getName());
        review.setProjectype(project1.getType());
        review.setSite(project1.getSite());
        review.setGbindustry(project1.getGbindustry());
        review.setIndustry(project1.getIndustry());
        review.setFund(project1.getAllfund());
        review.setStarttime(project1.getStartyear());
        review.setEndtime(project1.getEndyear());
        review.setSendtime(new java.sql.Date(new java.util.Date().getTime()));
        review.setFromsite(project1.getInstitution());
        review.setCreatetime(new java.sql.Date(new java.util.Date().getTime()));
        review.setStatus("新增");
        int n=reviewService.insert(review);
        return "redirect:waitguanli";
    }
    @RequestMapping("/cityinsert")
    public String cityinsert(HttpServletRequest req) {
        String countryid=req.getParameter("countryid");
        String placeid=req.getParameter("placeid");
        String name=req.getParameter("name");
        String type=req.getParameter("type");
        String property=req.getParameter("property");
        String country=req.getParameter("country");
        String institution=req.getParameter("institution");
        String site=req.getParameter("site");
        String address=req.getParameter("address");
        String gbindustry=req.getParameter("gbindustry");
        String industry=req.getParameter("industry");
        String investment=req.getParameter("investment");
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
        String buildscale=req.getParameter("buildscale");
        String quantifyscale=req.getParameter("quantifyscale");
        String content=req.getParameter("content");
        String dutyperson=req.getParameter("dutyperson");
        String dutypersontel=req.getParameter("dutypersontel");
        String conperson=req.getParameter("conperson");
        String conpersontel=req.getParameter("conpersontel");
        String fundtype=req.getParameter("fundtype");
        String allfund=req.getParameter("allfund");
        String xfund=req.getParameter("xfund");
        String finvestment=req.getParameter("finvestment");
        String sfund=req.getParameter("sfund");
        String reviewthing=req.getParameter("reviewthing");
        String reviewinstitution=req.getParameter("reviewinstitution");
        String reviewtime=req.getParameter("reviewtime");
        Date rtime= null;
        try {
            rtime = format.parse(reviewtime);
        } catch (ParseException e) {
            e.printStackTrace();
        }
        String reviewname=req.getParameter("reviewname");
        String reviewnumber=req.getParameter("reviewnumber");
        String reviewstatus=req.getParameter("reviewstatus");
        String sendstatus=req.getParameter("sendstatus");
        Project project=new Project();
        project.setCountryid(countryid);
        project.setPlaceid(placeid);
        project.setName(name);
        project.setType(type);
        project.setProperty(property);
        project.setCountry(country);
        project.setInstitution(institution);
        project.setSite(site);
        project.setAddress(address);
        project.setGbindustry(gbindustry);
        project.setIndustry(industry);
        project.setInvestment(investment);
        project.setStartyear(new java.sql.Date(start.getTime()));
        project.setEndyear(new java.sql.Date(end.getTime()));
        project.setBuildscale(buildscale);
        project.setQuantifyscale(quantifyscale);
        project.setContent(content);
        project.setDutyperson(dutyperson);
        project.setDutypersontel(dutypersontel);
        project.setConperson(conperson);
        project.setConpersontel(conpersontel);
        project.setFundtype(fundtype);
        project.setAllfund(allfund);
        project.setXfund(xfund);
        project.setFinvestment(finvestment);
        project.setSfund(sfund);
        project.setReviewthing(reviewthing);
        project.setReviewinstitution(reviewinstitution);
        project.setReviewtime(new java.sql.Date(rtime.getTime()));
        project.setReviewnumber(reviewnumber);
        project.setReviewstatus(reviewstatus);
        project.setSendstatus(sendstatus);
        int x=projectService.insert(project);
        Project project1=projectService.selectByName(name);
        User loginuser=userService.findUserByInstitutionName(project1.getInstitution());
        User_project user_project=new User_project();
        user_project.setUserid(loginuser.getUserid());
        user_project.setProjectid(project1.getProjectid());
        user_project.setCreatetime(new java.sql.Date(new java.util.Date().getTime()));
        int m=user_projectService.addUser_Project(user_project);
        Review review=new Review();
        review.setShoption("待审核");
        review.setProjectid(project1.getProjectid());
        review.setRate("无");
        review.setInstitution(project1.getInstitution());
        review.setProjectname(project1.getName());
        review.setProjectype(project1.getType());
        review.setSite(project1.getSite());
        review.setGbindustry(project1.getGbindustry());
        review.setIndustry(project1.getIndustry());
        review.setFund(project1.getAllfund());
        review.setStarttime(project1.getStartyear());
        review.setEndtime(project1.getEndyear());
        review.setSendtime(new java.sql.Date(new java.util.Date().getTime()));
        review.setFromsite(project1.getInstitution());
        review.setCreatetime(new java.sql.Date(new java.util.Date().getTime()));
        review.setStatus("新增");
        int n=reviewService.insert(review);
        return "redirect:citywaitguanli";
    }
    @RequestMapping("/cityupdateproject")
    public String cityupdateproject(HttpServletRequest req){
        int id=Integer.parseInt(req.getParameter("id"));
        Review review= reviewService.findreviewByID(id);
        req.getSession().setAttribute("review", review);
        Project project=projectService.findprojectByID(review.getProjectid());
        req.getSession().setAttribute("updateproject", project);
        return "city/review/projectupdate.jsp";
    }
    @RequestMapping("/citysave")
    public String save(HttpServletRequest req){
        String rinstitution=req.getParameter("rinstitution");
        int projectid=Integer.parseInt(req.getParameter("projectid"));
        String countryid=req.getParameter("countryid");
        String placeid=req.getParameter("placeid");
        String name=req.getParameter("name");
        String type=req.getParameter("type");
        String property=req.getParameter("property");
        String country=req.getParameter("country");
        String institution=req.getParameter("institution");
        String site=req.getParameter("site");
        String sitedetail=req.getParameter("sitedetail");
        String address=req.getParameter("address");
        String gbindustry=req.getParameter("gbindustry");
        String industry=req.getParameter("industry");
        String investment=req.getParameter("investment");
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
        String buildscale=req.getParameter("buildscale");
        String quantifyscale=req.getParameter("quantifyscale");
        String content=req.getParameter("content");
        String dutyperson=req.getParameter("dutyperson");
        String dutypersontel=req.getParameter("dutypersontel");
        String conperson=req.getParameter("conperson");
        String conpersontel=req.getParameter("conpersontel");
        String fundtype=req.getParameter("fundtype");
        String allfund=req.getParameter("allfund");
        String xfund=req.getParameter("xfund");
        String finvestment=req.getParameter("finvestment");
        String sfund=req.getParameter("sfund");
        String reviewthing=req.getParameter("reviewthing");
        String reviewinstitution=req.getParameter("reviewinstitution");
        String reviewtime=req.getParameter("reviewtime");
        Date rtime= null;
        try {
            rtime = format.parse(reviewtime);
        } catch (ParseException e) {
            e.printStackTrace();
        }
        String reviewname=req.getParameter("reviewname");
        String reviewnumber=req.getParameter("reviewnumber");
        String reviewstatus=req.getParameter("reviewstatus");
        String sendstatus=req.getParameter("sendstatus");
        Project project=new Project();
        project.setProjectid(projectid);
        project.setCountryid(countryid);
        project.setPlaceid(placeid);
        project.setName(name);
        project.setType(type);
        project.setProperty(property);
        project.setCountry(country);
        project.setInstitution(institution);
        project.setSite(site);
        project.setSitedetail(sitedetail);
        project.setAddress(address);
        project.setGbindustry(gbindustry);
        project.setIndustry(industry);
        project.setInvestment(investment);
        project.setStartyear(new java.sql.Date(start.getTime()));
        project.setEndyear(new java.sql.Date(end.getTime()));
        project.setBuildscale(buildscale);
        project.setQuantifyscale(quantifyscale);
        project.setContent(content);
        project.setDutyperson(dutyperson);
        project.setDutypersontel(dutypersontel);
        project.setConperson(conperson);
        project.setConpersontel(conpersontel);
        project.setFundtype(fundtype);
        project.setAllfund(allfund);
        project.setXfund(xfund);
        project.setFinvestment(finvestment);
        project.setSfund(sfund);
        project.setReviewthing(reviewthing);
        project.setReviewinstitution(reviewinstitution);
        project.setReviewname(reviewname);
        project.setReviewtime(new java.sql.Date(rtime.getTime()));
        project.setReviewnumber(reviewnumber);
        project.setReviewstatus(reviewstatus);
        project.setSendstatus(sendstatus);
        int x= projectService.updateproject(project);
        if (rinstitution.contains("市发改"))
            return "redirect:citywaitguanli";
        else
            return "redirect:waitguanli";
    }
}
