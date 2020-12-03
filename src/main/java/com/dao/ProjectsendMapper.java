package com.dao;

import com.entity.Projectsend;
import com.entity.ProjectsendExample;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface ProjectsendMapper {
    int countByExample(ProjectsendExample example);

    int deleteByExample(ProjectsendExample example);

    int insert(Projectsend record);

    int insertSelective(Projectsend record);

    List<Projectsend> selectByExample(ProjectsendExample example);

    int updateByExampleSelective(@Param("record") Projectsend record, @Param("example") ProjectsendExample example);

    int updateByExample(@Param("record") Projectsend record, @Param("example") ProjectsendExample example);

    List<Projectsend> findAll();

    Projectsend selectByPrimaryKey(Integer id);

    int deleteByPrimaryKey(Integer id);

    Projectsend selectByprojectid(Integer projectid);

    int updateByPrimaryKey(Projectsend projectsend);

    List<Projectsend> findBysaverate(String saverate);

    List<Projectsend> findBytype(@Param("librarytype") String librarytype,@Param("receivesite") String receivesite);
}