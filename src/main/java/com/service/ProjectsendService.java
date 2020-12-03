package com.service;

import com.entity.Projectsend;

import java.util.List;

public interface ProjectsendService {
    public int addProjectsend(Projectsend projectsend);

    List<Projectsend> findAll();

    public Projectsend findprojectsendByID(int id);

    public int delprojectsend(int id);

    int update(Projectsend projectsend);

    Projectsend findByprojectid(int projectid);

    List<Projectsend> findBysaverate(String saverate);

    List<Projectsend> findBytype(String librarytype,String receivesite);

}
