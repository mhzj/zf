package com.dao;

import com.entity.Yearplan;
import com.entity.YearplanExample;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface YearplanMapper {
    int countByExample(YearplanExample example);

    int deleteByExample(YearplanExample example);

    int insert(Yearplan record);

    int insertSelective(Yearplan record);

    List<Yearplan> selectByExample(YearplanExample example);

    int updateByExampleSelective(@Param("record") Yearplan record, @Param("example") YearplanExample example);

    int updateByExample(@Param("record") Yearplan record, @Param("example") YearplanExample example);

    Yearplan selectByPrimaryKey(int yearplanid);

    int updateByPrimaryKey(Yearplan yearplan);

    int deleteByPrimaryKey(int yearplanid);

    List<Yearplan> findByplanstatusandreceiveunit(String planstatus,String receiveunit);

    List<Yearplan> findBysendstatusandreceiveunit(String receiveunit);

    List<Yearplan> findyearByplanstatusreceiveunit(String receiveunit);

    List<Yearplan> findByreceiveunit(String receiveunit);
}