package com.service.Impl;

import com.dao.ReviewMapper;
import com.entity.Review;
import com.service.ReviewService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service("ReviewService")
public class ReviewServiceImpl implements ReviewService {
    @Resource
    private ReviewMapper reviewMapper;
    @Override
    public int insert(Review review) {
        return reviewMapper.insertSelective(review);
    }
    @Override
    public List<Review> findByshoption(String shoption,String institution) {
        return reviewMapper.findByshoption(shoption,institution);
    }
    @Override
    public List<Review> selectReview() {
        return reviewMapper.selectByExample(null);
    }
    @Override
    public List<Review> listBywaitSite(String site) {
        return reviewMapper.findBywaitSite(site);
    }
    @Override
    public List<Review> listBywaitType(String projectype) {
        return reviewMapper.findBywaitType(projectype);
    }
    @Override
    public List<Review> findBywaitTypeandSite(String projectype, String site) {
        return reviewMapper.findBywaitTypeandSite(projectype,site);
    }
    @Override
    public List<Review> findBywaitName(String projectname) {
        return reviewMapper.findBywaitName(projectname);
    }

    @Override
    public List<Review> findBywaitSiteandName(String projectname, String site) {
        return reviewMapper.findBywaitSiteandName(projectname,site);
    }

    @Override
    public List<Review> findBywaitTypeandName(String projectname, String projectype) {
        return reviewMapper.findBywaitTypeandName(projectname,projectype);
    }

    @Override
    public List<Review> findBywaitNameTypeandSite(String projectname, String projectype, String site) {
        return reviewMapper.findBywaitNameTypeandSite(projectname,projectype,site);
    }

    @Override
    public Review findreviewByID(int id) {
        return reviewMapper.selectByPrimaryKey(id);
    }

    @Override
    public int update(Review review) {
        return reviewMapper.updateByPrimaryKey(review);
    }

    @Override
    public int deletereviewByID(int id) {
        return reviewMapper.deleteByPrimaryKey(id);
    }

    @Override
    public Review selectByprojectid(Integer projectid) {
        return reviewMapper.selectByprojectid(projectid);
    }
}
