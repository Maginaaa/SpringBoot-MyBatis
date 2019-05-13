package com.demo.service.impl;

import com.demo.bean.User;
import com.demo.mapper.UserMapper;
import com.demo.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service(value = "userService")
public class UserServiceimpl implements UserService {


    @Autowired
    private UserMapper userMapper;

    @Override
    public int addUser(User user) {
        return userMapper.insertUser(user);
    }

    @Override
    public List<User> findAllUser() {
        return userMapper.selectAllUser();
    }
}
