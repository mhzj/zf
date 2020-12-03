package com.service;

import com.entity.Scheduling;

import java.util.List;

public interface SchedulingService {
    List<Scheduling> findAll();

    int deleteByPrimaryKey(int schedulingid);

    int insertSelective(Scheduling scheduling);

    Scheduling findByprojectid(Integer projectid);

    Scheduling selectByPrimaryKey(int schedulingid);

    Scheduling findByname(String name);

    int update(Scheduling scheduling);

    List<Scheduling> findBytdstatus(String tdstatus);

    List<Scheduling> findBytdxfunitandtdstatus(String tdstatus,String tdxfunit);

    List<Scheduling> findBytdxfunit(String tdxfunit);
}
