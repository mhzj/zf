package com.service.Impl;

import com.dao.User_projectMapper;
import com.entity.User_project;
import com.service.User_ProjectService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
@Service("User_ProjectService")
public class User_ProjectServiceImpl implements User_ProjectService {
    @Resource
    private User_projectMapper user_projectMapper;
    @Override
    public int addUser_Project(User_project user_project) {
        return user_projectMapper.insertSelective(user_project);
    }

    @Override
    public int delUser_Project(int projectid) {
        return user_projectMapper.deleteByProjectid(projectid);
    }

    @Override
    public User_project findByprojectid(int projectid) {
        return user_projectMapper.findByprojectid(projectid);
    }
}
