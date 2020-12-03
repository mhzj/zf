package com.dao;

import com.entity.User_project;
import com.entity.User_projectExample;
import java.util.List;

import com.service.User_ProjectService;
import org.apache.ibatis.annotations.Param;

public interface User_projectMapper {
    int countByExample(User_projectExample example);

    int deleteByExample(User_projectExample example);

    int insert(User_project record);

    int insertSelective(User_project record);

    List<User_project> selectByExample(User_projectExample example);

    int updateByExampleSelective(@Param("record") User_project record, @Param("example") User_projectExample example);

    int updateByExample(@Param("record") User_project record, @Param("example") User_projectExample example);

    int deleteByProjectid(Integer projectid);

    User_project findByprojectid(Integer projectid);
}