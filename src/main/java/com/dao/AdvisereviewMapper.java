package com.dao;

import com.entity.Advisereview;
import com.entity.AdvisereviewExample;

import java.util.Date;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface AdvisereviewMapper {
    int countByExample(AdvisereviewExample example);

    int deleteByExample(AdvisereviewExample example);
    //添加意见
    int insert(Advisereview record);

    int insertSelective(Advisereview record);
    //查询所有意见
    List<Advisereview> selectByExample(AdvisereviewExample example);

    int updateByExampleSelective(@Param("record") Advisereview record, @Param("example") AdvisereviewExample example);

    int updateByExample(@Param("record") Advisereview record, @Param("example") AdvisereviewExample example);
    //根据id查找意见
    Advisereview selectByPrimaryKey(Integer id);
    //根据时间查询意见
    List<Advisereview> findBytime(Date date1,Date date2);

    List<Advisereview> findBystatus(String status);

    List<Advisereview> findBycontent(String content);

    List<Advisereview> findBycontentandstatus(String content, String status);
}