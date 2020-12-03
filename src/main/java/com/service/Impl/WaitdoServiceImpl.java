package com.service.Impl;

import com.dao.WaitdoMapper;
import com.entity.Waitdo;
import com.service.WaitdoService;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.annotation.Resource;
import java.util.Date;
import java.util.List;

@Service("WaitdoService")
public class WaitdoServiceImpl implements WaitdoService {
    @Resource
    private WaitdoMapper waitdoMapper;
    @Override
    public List<Waitdo> findBytime(Date data1, Date date2) {
        return waitdoMapper.findBytime(data1, date2);
    }

    @Override
    public List<Waitdo> selectWaitdo() {
        return waitdoMapper.selectByExample(null);
    }

    @Override
    public List<Waitdo> findBycontent(String content) {
        return waitdoMapper.findBycontent(content);
    }

    @Override
    public List<Waitdo> findBycontentandtime(String content, Date data1, Date date2) {
        return waitdoMapper.findBycontentandtime(content,data1,date2);
    }
}
