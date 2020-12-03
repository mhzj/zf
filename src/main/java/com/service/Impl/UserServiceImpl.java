package com.service.Impl;

import com.dao.UserMapper;
import com.entity.User;
import com.service.UserService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service("UserService")
public class UserServiceImpl implements UserService {

    @Resource
    UserMapper userMapper;
    public User findUser(User user){
        return userMapper.findUser(user);
    }

    public List<User> findAll() {
        return userMapper.findAll();
    }

    @Override
    public User findUserById(Integer userid) {
        return userMapper.findUserById(userid);
    }

    @Override
    public User findUserByName(String username) {
        return userMapper.findUserByName(username);
    }

    @Override
    public int addUser(User user){
        return   userMapper.insertSelective(user);
    }

    @Override
    public User findUserByInstitutionName(String institutionname) {
        return userMapper.findUserByInstitutionName(institutionname);
    }

    @Override
    public int update(User user) {
        return userMapper.updateByPrimaryKey(user);
    }

}
