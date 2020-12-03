package com.service;

import com.entity.Rollplan;

import java.util.List;

public interface RollplanService {
    int insertSelective(Rollplan rollplan);

    List<Rollplan> findBysendstatusandreceivesite(String sendstatus,String receivesite);

    List<Rollplan> findyearrollplanBysendstatus(String receivesite);

    Rollplan findrollplanByID(int rollplanid);

    int update(Rollplan rollplan);

    int deleteByPrimaryKey(Integer rollplanid);

    List<Rollplan> findByprojectidandreceivesite(Integer projectid,String receivesite);

    List<Rollplan> findAll();

    Rollplan findByprojectid(Integer projectid,String receivesite);
}
