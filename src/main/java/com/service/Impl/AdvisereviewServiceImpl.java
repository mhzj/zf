package com.service.Impl;

import com.dao.AdvisereviewMapper;
import com.entity.Advisereview;
import com.service.AdvisereviewService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.Date;
import java.util.List;

@Service("AdvisereviewService")
public class AdvisereviewServiceImpl implements AdvisereviewService {
    @Resource
    private AdvisereviewMapper advisereviewMapper;
    @Override
    public int insert(Advisereview advisereview) {
        return advisereviewMapper.insert(advisereview);
    }

    @Override
    public Advisereview findByID(Integer id) {
        return advisereviewMapper.selectByPrimaryKey(id);
    }

    @Override
    public List<Advisereview> selectAdvise() {
        return advisereviewMapper.selectByExample(null);
    }

    @Override
    public List<Advisereview> findBytime(Date date1, Date date2) {
        return advisereviewMapper.findBytime(date1,date2);
    }

    @Override
    public List<Advisereview> findBystatus(String status) {
        return advisereviewMapper.findBystatus(status);
    }

    @Override
    public List<Advisereview> findBycontent(String content) {
        return advisereviewMapper.findBycontent(content);
    }

    @Override
    public List<Advisereview> findBycontentandstatus(String content, String status) {
        return advisereviewMapper.findBycontentandstatus(content,status);
    }
}
