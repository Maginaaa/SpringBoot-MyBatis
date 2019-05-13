package com.demo.mapper;

import com.demo.bean.User;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;


@Mapper
public interface UserMapper {

    int insertUser(User user);

    List<User> selectAllUser();
}
