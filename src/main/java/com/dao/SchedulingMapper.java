package com.dao;

import com.entity.Scheduling;
import com.entity.SchedulingExample;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface SchedulingMapper {
    int countByExample(SchedulingExample example);

    int deleteByExample(SchedulingExample example);

    int insert(Scheduling record);

    int insertSelective(Scheduling record);

    List<Scheduling> selectByExample(SchedulingExample example);

    int updateByExampleSelective(@Param("record") Scheduling record, @Param("example") SchedulingExample example);

    int updateByExample(@Param("record") Scheduling record, @Param("example") SchedulingExample example);

    int deleteByPrimaryKey(int schedulingid);

    Scheduling findByprojectid(Integer projectid);

    Scheduling selectByPrimaryKey(int schedulingid);

    Scheduling findByname(String name);

    int updateByPrimaryKey(Scheduling scheduling);

    List<Scheduling> findBytdstatus(String tdstatus);

    List<Scheduling> findBytdxfunitandtdstatus(@Param("tdstatus") String tdstatus,@Param("tdxfunit") String tdxfunit);

    List<Scheduling> findBytdxfunit(String tdxfunit);
}