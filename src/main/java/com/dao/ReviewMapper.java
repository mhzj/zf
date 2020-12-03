package com.dao;

import com.entity.Review;
import com.entity.ReviewExample;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface ReviewMapper {
    int countByExample(ReviewExample example);

    int deleteByExample(ReviewExample example);
    //插入一条完整的
    int insert(Review record);
    //插入一条部分
    int insertSelective(Review record);

    List<Review> selectByExample(ReviewExample example);

    int updateByExample(@Param("record") Review record, @Param("example") ReviewExample example);

    List<Review> findByshoption(@Param("shoption") String shoption,@Param("institution") String institution);

    int updateByExampleSelective(@Param("record") Review record, @Param("example") ReviewExample example);

    List<Review> findBywaitSite(String site);

    List<Review> findBywaitType(String projectype);

    List<Review> findBywaitTypeandSite(String projectype, String site);

    List<Review> findBywaitName(String projectname);

    List<Review> findBywaitSiteandName(String projectname, String site);

    List<Review> findBywaitTypeandName(String projectname, String projectype);

    List<Review> findBywaitNameTypeandSite(String projectname, String projectype, String site);

    Review selectByPrimaryKey(Integer id);

    Review selectByprojectid(Integer projectid);

    int updateByPrimaryKey(Review review);

    int deleteByPrimaryKey(Integer id);
}