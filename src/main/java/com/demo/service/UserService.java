package com.demo.service;


import com.demo.bean.User;

import java.util.List;


public interface UserService {

    int addUser(User user);

    List<User> findAllUser();


}
