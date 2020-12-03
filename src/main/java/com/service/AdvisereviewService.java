package com.service;

import com.entity.Advisereview;

import java.util.Date;
import java.util.List;

public interface AdvisereviewService {
    //添加意见
    public int insert(Advisereview advisereview);
    //根据ID查询意见
    public Advisereview findByID(Integer id);
    //查询所有意见
    public List<Advisereview>  selectAdvise();

    public List<Advisereview> findBytime(Date date1,Date date2);

    List<Advisereview> findBystatus(String status);

    List<Advisereview> findBycontent(String content);

    List<Advisereview> findBycontentandstatus(String replace, String replace1);
}
