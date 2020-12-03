package com.service;

import com.common.ServerResponse;
import com.entity.User;

import java.util.List;

/**
 * Created by huang
 */
public interface UserService {

    public User findUser(User user);

    public List<User> findAll();

    public User findUserById(Integer userid);

    public User findUserByName(String username);

    public int addUser(User user);

    public User findUserByInstitutionName(String institutionname);

    int update(User user);
}
