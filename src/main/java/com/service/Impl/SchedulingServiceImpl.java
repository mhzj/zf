package com.service.Impl;

import com.dao.SchedulingMapper;
import com.entity.Scheduling;
import com.service.SchedulingService;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.annotation.Resource;
import java.util.List;

@Service("SchedulingService")
public class SchedulingServiceImpl implements SchedulingService {
@Resource
private SchedulingMapper schedulingMapper;
    @Override
    public List<Scheduling> findAll() {
        return schedulingMapper.selectByExample(null);
    }

    @Override
    public int deleteByPrimaryKey(int schedulingid) {
        return schedulingMapper.deleteByPrimaryKey(schedulingid);
    }

    @Override
    public int insertSelective(Scheduling scheduling) {
        return schedulingMapper.insertSelective(scheduling);
    }

    @Override
    public Scheduling findByprojectid(Integer projectid) {
        return schedulingMapper.findByprojectid(projectid);
    }

    @Override
    public Scheduling selectByPrimaryKey(int schedulingid) {
        return schedulingMapper.selectByPrimaryKey(schedulingid);
    }

    @Override
    public Scheduling findByname(String name) {
        return schedulingMapper.findByname(name);
    }

    @Override
    public int update(Scheduling scheduling) {
        return schedulingMapper.updateByPrimaryKey(scheduling);
    }

    @Override
    public List<Scheduling> findBytdstatus(String tdstatus) {
        return schedulingMapper.findBytdstatus(tdstatus);
    }

    @Override
    public List<Scheduling> findBytdxfunitandtdstatus(String tdstatus, String tdxfunit) {
        return schedulingMapper.findBytdxfunitandtdstatus(tdstatus,tdxfunit);
    }

    @Override
    public List<Scheduling> findBytdxfunit(String tdxfunit) {
        return schedulingMapper.findBytdxfunit(tdxfunit);
    }


}
