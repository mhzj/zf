package com.dao;

import com.entity.Waitdo;
import com.entity.WaitdoExample;

import java.util.Date;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface WaitdoMapper {
    int countByExample(WaitdoExample example);

    int deleteByExample(WaitdoExample example);

    int insert(Waitdo record);

    int insertSelective(Waitdo record);
    //查找所有的待办任务
    List<Waitdo> selectByExample(WaitdoExample example);

    int updateByExampleSelective(@Param("record") Waitdo record, @Param("example") WaitdoExample example);

    int updateByExample(@Param("record") Waitdo record, @Param("example") WaitdoExample example);
    //根据内容关键字查找待办任务
    List<Waitdo> findBycontent(String content);
    //根据时间段查询待办任务
    List<Waitdo> findBytime(Date date1,Date date2);
    //根据内容和时间段查询待办任务
    List<Waitdo> findBycontentandtime(String content,Date date1,Date date2);
}