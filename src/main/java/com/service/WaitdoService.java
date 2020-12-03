package com.service;

import com.entity.Waitdo;

import java.util.Date;
import java.util.List;

public interface WaitdoService {
    List<Waitdo> findBytime(Date data1,Date date2);

    List<Waitdo> selectWaitdo();

    List<Waitdo> findBycontent(String content);

    List<Waitdo> findBycontentandtime(String content,Date data1,Date date2);
}
