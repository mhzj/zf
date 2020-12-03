package com.service.Impl;

import com.dao.RollplanMapper;
import com.entity.Rollplan;
import com.service.RollplanService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service("RollplanService")
public class RollplanServiceImpl implements RollplanService {
    @Resource
    private RollplanMapper rollplanMapper;
    @Override
    public int insertSelective(Rollplan rollplan) {
        return rollplanMapper.insertSelective(rollplan);
    }
    @Override
    public List<Rollplan> findAll() {
        return rollplanMapper.selectByExample(null);
    }
    @Override
    public List<Rollplan> findBysendstatusandreceivesite(String sendstatus,String receivesite) {
        return rollplanMapper.findBysendstatusandreceivesite(sendstatus,receivesite);
    }
    @Override
    public List<Rollplan> findyearrollplanBysendstatus(String receivesite) {
        return rollplanMapper.findyearrollplanBysendstatus(receivesite);
    }
    @Override
    public Rollplan findrollplanByID(int rollplanid) {
        return rollplanMapper.selectByPrimaryKey(rollplanid);
    }

    @Override
    public int update(Rollplan rollplan) {
        return rollplanMapper.updateByPrimaryKey(rollplan);
    }

    @Override
    public int deleteByPrimaryKey(Integer rollplanid) {
        return rollplanMapper.deleteByPrimaryKey(rollplanid);
    }

    @Override
    public List<Rollplan> findByprojectidandreceivesite(Integer projectid,String receivesite) {
        return rollplanMapper.findByprojectidandreceivesite(projectid,receivesite);
    }

    @Override
    public Rollplan findByprojectid(Integer projectid,String fromsite) {
        return rollplanMapper.findByprojectid(projectid,fromsite);
    }
}
