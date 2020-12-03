package com.controller.houtai;

import com.entity.Project;
import com.entity.Projectsend;
import com.entity.Review;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.service.ProjectService;
import com.service.ProjectsendService;
import com.service.ReviewService;
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
@RequestMapping("/projectlibrary")
public class ProjectlibraryController {
    @Autowired
    private ProjectsendService projectsendService;
    @Autowired
    private ProjectService projectService;
    @Autowired
    private ReviewService reviewService;
    @RequestMapping("/countyguanli")
    public String getcountyguanli(
            @RequestParam(value = "pn", defaultValue = "1") Integer pn,
            Model model, HttpServletRequest req) {
        PageHelper.startPage(pn, 6);
        List<Projectsend> projectsends=projectsendService.findBysaverate("县级储备");
        req.getSession().setAttribute("projectsends", projectsends);
        PageInfo page = new PageInfo(projectsends, 6);
        model.addAttribute("pageInfo", page);
        return "manager/projectlibrary/projectlibraryinfo.jsp";
    }
    @RequestMapping("/cityguanli")
    public String getcityguanli(
            @RequestParam(value = "pn", defaultValue = "1") Integer pn,
            Model model, HttpServletRequest req) {
        PageHelper.startPage(pn, 6);
        List<Projectsend> list=projectsendService.findBysaverate("市级储备");
        req.getSession().setAttribute("projectsends", list);
        PageInfo page = new PageInfo(list, 6);
        model.addAttribute("pageInfo", page);
        return "city/projectlibrary/projectlibraryinfo.jsp";
    }
    @RequestMapping("/zftz")
    public String getzftz(
            @RequestParam(value = "pn", defaultValue = "1") Integer pn,
            Model model, HttpServletRequest req) {
        PageHelper.startPage(pn, 6);
        List<Projectsend> projectsends=projectsendService.findBytype("政府投资项目库","县发改");
        req.getSession().setAttribute("projectsends", projectsends);
        PageInfo page = new PageInfo(projectsends, 6);
        model.addAttribute("pageInfo", page);
        return "manager/projectlibrary/zftz.jsp";
    }
    @RequestMapping("/cityzftz")
    public String cityzftz(
            @RequestParam(value = "pn", defaultValue = "1") Integer pn,
            Model model, HttpServletRequest req) {
        PageHelper.startPage(pn, 6);
        List<Projectsend> projectsends=projectsendService.findBytype("政府投资项目库","市发改");
        req.getSession().setAttribute("projectsends", projectsends);
        PageInfo page = new PageInfo(projectsends, 6);
        model.addAttribute("pageInfo", page);
        return "city/projectlibrary/zftz.jsp";
    }
    @RequestMapping("/zd")
    public String getzd(
            @RequestParam(value = "pn", defaultValue = "1") Integer pn,
            Model model, HttpServletRequest req) {
        PageHelper.startPage(pn, 6);
        List<Projectsend> projectsends=projectsendService.findBytype("重点项目库","县发改");
        req.getSession().setAttribute("projectsends", projectsends);
        PageInfo page = new PageInfo(projectsends, 6);
        model.addAttribute("pageInfo", page);
        return "manager/projectlibrary/zd.jsp";
    }
    @RequestMapping("/cityzd")
    public String cityzd(
            @RequestParam(value = "pn", defaultValue = "1") Integer pn,
            Model model, HttpServletRequest req) {
        PageHelper.startPage(pn, 6);
        List<Projectsend> projectsends=projectsendService.findBytype("重点项目库","市发改");
        req.getSession().setAttribute("projectsends", projectsends);
        PageInfo page = new PageInfo(projectsends, 6);
        model.addAttribute("pageInfo", page);
        return "city/projectlibrary/zd.jsp";
    }
    @RequestMapping("/cy")
    public String getcy(
            @RequestParam(value = "pn", defaultValue = "1") Integer pn,
            Model model, HttpServletRequest req) {
        PageHelper.startPage(pn, 6);
        List<Projectsend> projectsends=projectsendService.findBytype("产业项目库","县发改");
        req.getSession().setAttribute("projectsends", projectsends);
        PageInfo page = new PageInfo(projectsends, 6);
        model.addAttribute("pageInfo", page);
        return "manager/projectlibrary/cy.jsp";
    }
    @RequestMapping("/citycy")
    public String citycy(
            @RequestParam(value = "pn", defaultValue = "1") Integer pn,
            Model model, HttpServletRequest req) {
        PageHelper.startPage(pn, 6);
        List<Projectsend> projectsends=projectsendService.findBytype("产业项目库","市发改");
        req.getSession().setAttribute("projectsends", projectsends);
        PageInfo page = new PageInfo(projectsends, 6);
        model.addAttribute("pageInfo", page);
        return "city/projectlibrary/cy.jsp";
    }
    @RequestMapping("/ghcb")
    public String ghcb(
            @RequestParam(value = "pn", defaultValue = "1") Integer pn,
            Model model, HttpServletRequest req) {
        PageHelper.startPage(pn, 6);
        List<Projectsend> projectsends=projectsendService.findBytype("规划储备项目库","县发改");
        req.getSession().setAttribute("projectsends", projectsends);
        PageInfo page = new PageInfo(projectsends, 6);
        model.addAttribute("pageInfo", page);
        return "manager/projectlibrary/ghcb.jsp";
    }
    @RequestMapping("/cityghcb")
    public String cityghcb(
            @RequestParam(value = "pn", defaultValue = "1") Integer pn,
            Model model, HttpServletRequest req) {
        PageHelper.startPage(pn, 6);
        List<Projectsend> projectsends=projectsendService.findBytype("规划储备项目库","市发改");
        req.getSession().setAttribute("projectsends", projectsends);
        PageInfo page = new PageInfo(projectsends, 6);
        model.addAttribute("pageInfo", page);
        return "city/projectlibrary/ghcb.jsp";
    }
    @RequestMapping("/countyjiasuo")
    public String countyjiasuo(HttpServletRequest req,String ids,String bz){
        String[] s = ids.split(",");
        for (int i = 0; i < s.length; i++) {
             Projectsend projectsend= projectsendService.findprojectsendByID(Integer.parseInt(s[i]));
                if (projectsend.getRate().equals("无")){
                    projectsend.setRate("县级");
                    int h=projectsendService.update(projectsend);
                }else {}
        }
        if (bz.equals("0"))
            return "redirect:countyguanli";
        else if (bz.equals("1"))
            return "redirect:zftz";
        else if (bz.equals("2"))
            return "redirect:zd";
        else  if (bz.equals("3"))
            return "redirect:cy";
        else
            return "redirect:ghcb";
    }
    @RequestMapping("/cityjiasuo")
    public String cityjiasuo(HttpServletRequest req,String ids,String bz){
        String[] s = ids.split(",");
        for (int i = 0; i < s.length; i++) {
            Projectsend projectsend= projectsendService.findprojectsendByID(Integer.parseInt(s[i]));
            if (projectsend.getRate().equals("县级"))
                projectsend.setRate("市级");
               else if (projectsend.getRate().equals("无"))
                   projectsend.setRate("县级");
               else {}
                int h=projectsendService.update(projectsend);
        }
        if (bz.equals("0"))
            return "redirect:cityguanli";
        else if (bz.equals("1"))
            return "redirect:cityzftz";
        else if (bz.equals("2"))
            return "redirect:cityzd";
        else  if (bz.equals("3"))
            return "redirect:citycy";
        else
            return "redirect:cityghcb";
    }
    @RequestMapping("/countyjiesuo")
    public String countyjiesuo(HttpServletRequest req,String ids,String bz){
        String[] t = ids.split(",");
        for (int i = 0; i < t.length; i++) {
            try {
                Projectsend projectsend= projectsendService.findprojectsendByID(Integer.parseInt(t[i]));
                if (projectsend.getRate().equals("县级")){
                    projectsend.setRate("无");
                    int h=projectsendService.update(projectsend);
                }else {}
            } catch (Exception e) {
            }
        }
        if (bz.equals("0"))
            return "redirect:countyguanli";
        else if (bz.equals("1"))
            return "redirect:zftz";
        else if (bz.equals("2"))
            return "redirect:zd";
        else  if (bz.equals("3"))
            return "redirect:cy";
        else
            return "redirect:ghcb";
    }
    @RequestMapping("/cityjiesuo")
    public String cityjiesuo(HttpServletRequest req,String ids,String bz){
        String[] t = ids.split(",");
        for (int i = 0; i < t.length; i++) {
                Projectsend projectsend= projectsendService.findprojectsendByID(Integer.parseInt(t[i]));
                if (projectsend.getRate().equals("县级"))
                    projectsend.setRate("无");
                else if (projectsend.getRate().equals("市级"))
                    projectsend.setRate("县级");
                else {}
            int h=projectsendService.update(projectsend);
        }
        if (bz.equals("0"))
            return "redirect:cityguanli";
        else if (bz.equals("1"))
            return "redirect:cityzftz";
        else if (bz.equals("2"))
            return "redirect:cityzd";
        else  if (bz.equals("3"))
            return "redirect:citycy";
        else
            return "redirect:cityghcb";
    }
    @RequestMapping("/updateproject")
    public String updateproject(HttpServletRequest req){
        int id=Integer.parseInt(req.getParameter("id"));
        Projectsend projectsend= projectsendService.findprojectsendByID(id);
        req.getSession().setAttribute("projectsend", projectsend);
        Project project=projectService.findprojectByID(projectsend.getProjectid());
        req.getSession().setAttribute("updateproject", project);
        return "manager/projectlibrary/projectupdate.jsp";
    }
    @RequestMapping("/cityupdateproject")
    public String cityupdateproject(HttpServletRequest req){
        int id=Integer.parseInt(req.getParameter("id"));
        Projectsend projectsend= projectsendService.findprojectsendByID(id);
        req.getSession().setAttribute("projectsend", projectsend);
        Project project=projectService.findprojectByID(projectsend.getProjectid());
        req.getSession().setAttribute("updateproject", project);
        return "city/projectlibrary/projectupdate.jsp";
    }
    @RequestMapping("/save")
    public String save(HttpServletRequest req){
        String librarytype=req.getParameter("librarytype");
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
        if (librarytype.equals("政府投资项目库"))
            return "redirect:zftz";
        else if (librarytype.equals("重点项目库"))
            return "redirect:zd";
        else if(librarytype.equals("产业项目库"))
            return "redirect:cy";
        else if(librarytype.equals("规划储备项目库"))
            return "redirect:ghcb";
        else
            return "redirect:countyguanli";
    }
    @RequestMapping("/citysave")
    public String citysave(HttpServletRequest req){
        String librarytype=req.getParameter("librarytype");
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
        if (librarytype.equals("政府投资项目库"))
            return "redirect:cityzftz";
        else if (librarytype.equals("重点项目库"))
            return "redirect:cityzd";
        else if(librarytype.equals("产业项目库"))
            return "redirect:citycy";
        else if(librarytype.equals("规划储备项目库"))
            return "redirect:cityghcb";
        else
            return "redirect:cityguanli";
    }
    @RequestMapping("/countytuihui")
    public String daibaotuihui(HttpServletRequest req,String bz,String ids){
        String[] strs = ids.split(",");
        for (int i = 0; i < strs.length; i++) {
            try {
                Projectsend projectsend= projectsendService.findprojectsendByID(Integer.parseInt(strs[i]));
                projectsend.setSaverate("");
                projectsend.setStatus("");
                projectsend.setLibrarytype("");
                int h=projectsendService.update(projectsend);
                Review review=reviewService.selectByprojectid(projectsend.getProjectid());
                review.setShoption("待审核");
                int z=reviewService.update(review);
            } catch (Exception e) {
            }
        }
        if (bz.equals("0"))
            return "redirect:countyguanli";
        else if (bz.equals("1"))
            return "redirect:zftz";
        else if (bz.equals("2"))
            return "redirect:zd";
        else  if (bz.equals("3"))
            return "redirect:cy";
        else
            return "redirect:ghcb";
    }
    @RequestMapping("/citytuihui")
    public String citydaobaotuihui(HttpServletRequest req,String bz,String ids){
        String[] strs = ids.split(",");
        for (int i = 0; i < strs.length; i++) {
            try {
                Projectsend projectsend= projectsendService.findprojectsendByID(Integer.parseInt(strs[i]));
                projectsend.setSaverate("");
                projectsend.setStatus("");
                projectsend.setLibrarytype("");
                int h=projectsendService.update(projectsend);
                Review review=reviewService.selectByprojectid(projectsend.getProjectid());
                review.setShoption("待审核");
                int z=reviewService.update(review);
            } catch (Exception e) {
            }
        }
        if (bz.equals("0"))
            return "redirect:cityguanli";
        else if (bz.equals("1"))
            return "redirect:cityzftz";
        else if (bz.equals("2"))
            return "redirect:cityzd";
        else  if (bz.equals("3"))
            return "redirect:citycy";
        else
            return "redirect:cityghcb";
    }
}
