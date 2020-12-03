package com.service;

import com.entity.Project;

import java.util.List;

public interface ProjectService {
    //添加项目
    public int insert(Project project);
    //查找所有项目
    public List<Project> selectProject();
    //根据ID查找项目
    public Project findprojectByID(int projectid);
    //根据id删除项目
    public int delproject(int projectid);
    //修改项目
    public int updateproject(Project project);
    //根据建设性质查找待上报的项目
    public List<Project> listByProperty_noPage(String property);
    //根据项目类型查找待上报的项目
    List<Project> listByType_noPage(String type);
    //根据项目类型查找已上报的项目
    List<Project> listBysendType(String type);
    //根据项目类型和建设性质查找待上报的项目
    List<Project> findByTypeandProperty(String type, String property);
    //根据项目名称查找待上报的项目
    List<Project> findByName(String name);
    //根据项目名称查找已上报的项目
    List<Project> findBysendName(String name);
    //根据项目名称和建设性质查找待上报的项目
    List<Project> findByNameandProperty(String name, String property);
    //根据项目名称和建设性质查找已上报的项目
    List<Project> findBysendTypeandName(String type, String name);
    //根据项目名称和项目类型查找待上报的项目
    List<Project> findByTypeandName(String type, String name);
    //根据项目名称和项目类型和建设性质查找待上报的项目
    List<Project> findByNameTypeandProperty(String name, String type, String property);
    //根据项目名称查找项目
    Project selectByName(String name);
    //根据填报状态查找项目
    List<Project> findBysendstatus(String sendstatus);
    //根据建设地点查找已上报的项目
    List<Project> listBySite(String site);
    //根据项目名称和建设地点查找已上报的项目
    List<Project> findBySiteandName(String name, String site);
    //根据项目类型和建设地点查找已上报的项目
    List<Project> findByTypeandSite(String type, String site);
    //根据项目名称和建设地点和项目类型查找已上报的项目
    List<Project> findByNameTypeandSite(String name, String type, String site);
    //根据项目名称和填报状态查找项目
    List<Project> findByNameandSendstatus(String name, String sendstatus);
    //根据项目名称查找项目
    List<Project> findProjectByName(String name);
}
