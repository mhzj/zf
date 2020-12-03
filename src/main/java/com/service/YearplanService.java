package com.service;

import com.entity.Yearplan;

import java.util.List;

public interface YearplanService {
    Yearplan findyearplanByID(int yearplanid);

    int update(Yearplan yearplan);

    int deleteByPrimaryKey(int yearplanid);

    int insertSelective(Yearplan yearplan);

    List<Yearplan> findByplanstatusandreceiveunit(String planstatus,String receiveunit);

    List<Yearplan> findBysendstatusandreceiveunit(String receiveunit);

    List<Yearplan> findyearByplanstatusreceiveunit(String receiveunit);

    List<Yearplan> findByreceiveunit(String receiveunit);
}
