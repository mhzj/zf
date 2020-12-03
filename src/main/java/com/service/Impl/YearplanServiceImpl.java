package com.service.Impl;

import com.dao.YearplanMapper;
import com.entity.Yearplan;
import com.service.YearplanService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service("YearplanService")
public class YearplanServiceImpl implements YearplanService {
    @Resource
    private YearplanMapper yearplanMapper;
    @Override
    public Yearplan findyearplanByID(int yearplanid) {
        return yearplanMapper.selectByPrimaryKey(yearplanid);
    }

    @Override
    public int update(Yearplan yearplan) {
        return yearplanMapper.updateByPrimaryKey(yearplan);
    }

    @Override
    public int deleteByPrimaryKey(int yearplanid) {
        return yearplanMapper.deleteByPrimaryKey(yearplanid);
    }

    @Override
    public int insertSelective(Yearplan yearplan) {
        return yearplanMapper.insertSelective(yearplan);
    }

    @Override
    public List<Yearplan> findByplanstatusandreceiveunit(String planstatus, String receiveunit) {
        return yearplanMapper.findByplanstatusandreceiveunit(planstatus,receiveunit);
    }

    @Override
    public List<Yearplan> findBysendstatusandreceiveunit(String receiveunit) {
        return yearplanMapper.findBysendstatusandreceiveunit(receiveunit);
    }

    @Override
    public List<Yearplan> findyearByplanstatusreceiveunit(String receiveunit) {
        return yearplanMapper.findyearByplanstatusreceiveunit(receiveunit);
    }

    @Override
    public List<Yearplan> findByreceiveunit(String receiveunit) {
        return yearplanMapper.findByreceiveunit(receiveunit);
    }
}
