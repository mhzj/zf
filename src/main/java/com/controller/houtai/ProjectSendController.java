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

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import java.io.UnsupportedEncodingException;
import java.util.ArrayList;
import java.util.List;

@Controller
@RequestMapping("/projectsend")
public class ProjectSendController {
    @Autowired
    private ProjectService projectService;
    @Autowired
    private ProjectsendService projectsendService;
    @Autowired
    private ReviewService reviewService;
    @RequestMapping("/guanli")
    public String getProjectsend(
            @RequestParam(value = "pn", defaultValue = "1") Integer pn,
            Model model, HttpServletRequest req) {
        List<Project> projects = projectService.findBysendstatus("已上报");
        req.getSession().setAttribute("projects", projects);
        PageHelper.startPage(pn, 6);
        List<Projectsend> projectsends=projectsendService.findAll();
        req.getSession().setAttribute("projectsends", projectsends);
        PageInfo page = new PageInfo(projectsends, 6);
        model.addAttribute("pageInfo", page);
        return "admin/projectsend.jsp";
    }
    @RequestMapping("/search")
    public String search( @RequestParam(value = "pn", defaultValue = "1") Integer pn,
                                 Model model,HttpServletRequest request) throws UnsupportedEncodingException {
        PageHelper.startPage(pn, 6);
        String name=request.getParameter("name");
        String type=request.getParameter("type");
        String site=request.getParameter("site");
        request.setAttribute("name", name);
        request.setAttribute("type",type);
        request.setAttribute("site", site);
        List<Project> searchlist ;
        List<Project> projects=new ArrayList<>();
        List<Projectsend> searchsendlist=projectsendService.findAll();
        request.getSession().setAttribute("searchsend", searchsendlist);
        if(" ".equals(name)){
            if(" ".equals(type)){
                if(" ".equals(site)){
                    searchlist=projectService.findBysendstatus("已上报");
                }
                else {
                    searchlist= projectService.listBySite(site.replace("'", ""));
                }
            }
            else {
                if (" ".equals(site)){
                    searchlist=projectService.listBysendType(type.replace("'", ""));
                }
                else {
                    searchlist=projectService.findByTypeandSite(type.replace("'", ""),site.replace("'", ""));
                }
            }
        }
        else {
            if(" ".equals(type)){
                if (" ".equals(site)){

                    searchlist=projectService.findBysendName(name.replace("'", ""));
                }
                else {

                    searchlist=projectService.findBySiteandName(name.replace("'", ""),site.replace("'", ""));
                }
            }
            else {
                if (" ".equals(site)){

                    searchlist=projectService.findBysendTypeandName(type.replace("'", ""),name.replace("'", ""));
                }
                else {

                    searchlist=projectService.findByNameTypeandSite(name.replace("'", ""),type.replace("'", ""),site.replace("'", ""));
                }
            }
        }
        if (searchsendlist.size()!=0) {
            for (int i = 0; i < searchsendlist.size(); i++) {
                if (searchlist.size() != 0) {
                    for (int j = 0; j < searchlist.size(); j++) {
                        if (searchlist.get(j).getProjectid().equals(searchsendlist.get(i).getProjectid())) {
                            Project project=searchlist.get(j);
                            projects.add(project);
                        }
                    }
                }
            }
        }
        PageInfo page = new PageInfo(projects, 6);
        model.addAttribute("searchproject", page);
        return "admin/projectsend1.jsp";
    }

    @RequestMapping("/backproject")
    public String backProject(HttpServletRequest req,String ids){
        String[] strs = ids.split(",");
        for (int i = 0; i < strs.length; i++) {
                Projectsend projectsend=projectsendService.findByprojectid(Integer.parseInt(strs[i]));
                if (projectsend.getSaverate()==null) {
                    System.out.println(projectsend.getSaverate());
                    Project project=projectService.findprojectByID(projectsend.getProjectid());
                    project.setSendstatus("待上报");
                    int h = projectService.updateproject(project);
                    System.out.println(project.getSendstatus());
                    Review review=reviewService.selectByprojectid(project.getProjectid());
                    System.out.println(review.getId());
                    System.out.println(projectsend.getId());
                    int z=reviewService.deletereviewByID(review.getId());
                    int j= projectsendService.delprojectsend(projectsend.getId());
                } else {
                    req.getSession().setAttribute("message", "尊敬的用户，该项目已被上级部门纳入本级项目储备库，无法撤回！");
                }
        }
        return "redirect:guanli";
    }
}
