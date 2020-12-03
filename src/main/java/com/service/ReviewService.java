package com.service;

import com.entity.Review;

import java.util.List;

public interface ReviewService {
    //添加审核项目
    public int insert(Review review);
    //根据审核意见查找项目
    List<Review> findByshoption(String shoption,String institution);
    //查找所有审核项目
    List<Review> selectReview();
    //根据建设地点查找待审核的项目
    List<Review> listBywaitSite(String site);
    //根据项目类型查找待审核的项目
    List<Review> listBywaitType(String projectype);
    //根据项目类型和建设地点查找待审核的项目
    List<Review> findBywaitTypeandSite(String projectype, String site);
    //根据项目名称查找待审核的项目
    List<Review> findBywaitName(String projectname);
    //根据项目名称和建设地点查找待审核的项目
    List<Review> findBywaitSiteandName(String projectname, String site);
    //根据项目名称和项目类型查找待审核的项目
    List<Review> findBywaitTypeandName(String projectname, String projectype);
    //根据项目名称、项目类型和建设地点查找待审核的项目
    List<Review> findBywaitNameTypeandSite(String projectname, String projectype, String site);
    //根据id查找审核项目
    Review findreviewByID(int id);

    int update(Review review);

    int deletereviewByID(int id);

    Review selectByprojectid(Integer projectid);
}
