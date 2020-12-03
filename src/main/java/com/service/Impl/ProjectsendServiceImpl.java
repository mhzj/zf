package com.service.Impl;

import com.dao.ProjectsendMapper;
import com.entity.Projectsend;
import com.service.ProjectsendService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service("ProjectsendService")
public class ProjectsendServiceImpl implements ProjectsendService {
    @Resource
    private ProjectsendMapper projectsendMapper;
    @Override
    public int addProjectsend(Projectsend projectsend) {
        return projectsendMapper.insertSelective(projectsend);
    }

    @Override
    public List<Projectsend> findAll() {
        return projectsendMapper.findAll();
    }

    @Override
    public Projectsend findprojectsendByID(int id) {
        return projectsendMapper.selectByPrimaryKey(id);
    }

    @Override
    public int delprojectsend(int id) {
        return projectsendMapper.deleteByPrimaryKey(id);
    }

    @Override
    public int update(Projectsend projectsend) {
        return projectsendMapper.updateByPrimaryKey(projectsend);
    }

    @Override
    public Projectsend findByprojectid(int projectid) {
        return projectsendMapper.selectByprojectid(projectid);
    }

    @Override
    public List<Projectsend> findBysaverate(String saverate) {
        return projectsendMapper.findBysaverate(saverate);
    }

    @Override
    public List<Projectsend> findBytype(String librarytype,String receivesite) {
        return projectsendMapper.findBytype(librarytype,receivesite);
    }


}
