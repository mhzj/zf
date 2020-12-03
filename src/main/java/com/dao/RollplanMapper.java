package com.dao;

import com.entity.Rollplan;
import com.entity.RollplanExample;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface RollplanMapper {
    int countByExample(RollplanExample example);
    int deleteByExample(RollplanExample example);
    int insert(Rollplan record);
    int insertSelective(Rollplan record);
    List<Rollplan> selectByExample(RollplanExample example);
    int updateByExampleSelective(@Param("record") Rollplan record, @Param("example") RollplanExample example);
    int updateByExample(@Param("record") Rollplan record, @Param("example") RollplanExample example);
    List<Rollplan> findBysendstatusandreceivesite(@Param("sendstatus") String sendstatus,@Param("receivesite") String receivesite);
    Rollplan selectByPrimaryKey(int rollplanid);
    int updateByPrimaryKey(Rollplan rollplan);
    int deleteByPrimaryKey(Integer rollplanid);
    List<Rollplan> findyearrollplanBysendstatus(String receivesite);
    List<Rollplan> findByprojectidandreceivesite(@Param("projectid") Integer projectid,@Param("receivesite") String receivesite);
    Rollplan findByprojectid(@Param("projectid") Integer projectid,@Param("receivesite") String receivesite);
}