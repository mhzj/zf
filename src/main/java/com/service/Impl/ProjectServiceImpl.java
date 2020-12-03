package com.service.Impl;
import com.dao.ProjectMapper;
import com.entity.Project;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.service.ProjectService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.security.PublicKey;
import java.util.List;
@Service("ProjectService")
public class ProjectServiceImpl implements ProjectService {
    @Resource
    private ProjectMapper projectMapper;
    @Override
    public int insert(Project project) {
        return projectMapper.insertSelective(project);
    }
    @Override
    public List<Project> selectProject() {
        return projectMapper.selectByExample(null);

    }
    @Override
    public Project findprojectByID(int projectid) {
        return projectMapper.selectByPrimaryKey(projectid);
    }
    @Override
    public int delproject(int projectid) {
        return  projectMapper.deleteByPrimaryKey(projectid);
    }

    @Override
    public int updateproject(Project project) {
        return projectMapper.updateByPrimaryKey(project);
    }

    public List<Project> listByProperty_noPage(String property) {

        return projectMapper.listByProperty(property);
    }
    public List<Project> listByType_noPage(String type) {

        return projectMapper.listByType(type);
    }

    @Override
    public List<Project> listBysendType(String type) {
        return projectMapper.listBysendType(type);
    }

    public List<Project> findByName(String name){
        return projectMapper.findByName(name);
     }

    @Override
    public List<Project> findBysendName(String name) {
        return projectMapper.findBysendName(name);
    }

    public List<Project> findByTypeandProperty(String type,String property){
        return projectMapper.findByTypeandProperty(type, property);

    }
    public List<Project> findByNameandProperty(String name, String property){
        return projectMapper.findByNameandProperty(name, property);

    }

    @Override
    public List<Project> findBysendTypeandName(String type, String name) {
        return projectMapper.findBysendTypeandName(type,name);
    }

    public List<Project> findByTypeandName(String name, String type){
        return projectMapper.findByTypeandName(name,type);
    }

    public List<Project> findByNameTypeandProperty(String name, String type, String property){
        return projectMapper.findByNameTypeandProperty(name,type, property);

    }
    @Override
    public Project selectByName(String name) {
        return projectMapper.selectByName(name);
    }

    @Override
    public List<Project> findBysendstatus(String sendstatus) {
        return projectMapper.findBysendstatus(sendstatus);
    }

    @Override
    public List<Project> listBySite(String site) {
        return projectMapper.listBySite(site);
    }

    @Override
    public List<Project> findBySiteandName(String name, String site) {
        return projectMapper.findBySiteandName(name,site);
    }

    @Override
    public List<Project> findByTypeandSite(String type, String site) {
        return projectMapper.findByTypeandSite(type,site);
    }

    @Override
    public List<Project> findByNameTypeandSite(String name, String type, String site) {
        return projectMapper.findByNameTypeandSite(name,type,site);
    }

    @Override
    public List<Project> findByNameandSendstatus(String name, String sendstatus) {
        return projectMapper.findByNameandSendstatus(name,sendstatus);
    }

    @Override
    public List<Project> findProjectByName(String name) {
        return projectMapper.findProjectByName(name);
    }


}
