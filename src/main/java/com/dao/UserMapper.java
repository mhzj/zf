package com.dao;

import com.entity.User;
import com.entity.UserExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface UserMapper {
    int countByExample(UserExample example);

    int deleteByExample(UserExample example);

    int insert(User record);

    int insertSelective(User record);

    List<User> selectByExample(UserExample example);

    int updateByExampleSelective(@Param("record") User record, @Param("example") UserExample example);

    int updateByExample(@Param("record") User record, @Param("example") UserExample example);

    User findUser(User user);

    List<User> findAll();

    User findUserByName(String username);

    User findUserById(Integer userid);

    User findUserByInstitutionName(String institutionname);

    int updateByPrimaryKey(User user);
}