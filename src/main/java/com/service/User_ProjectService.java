package com.service;


import com.entity.User_project;

public interface User_ProjectService {
    public int addUser_Project(User_project user_project);

    int delUser_Project(int projectid);

    User_project findByprojectid(int projectid);


}
