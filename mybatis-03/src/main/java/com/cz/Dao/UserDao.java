package com.cz.Dao;

import com.cz.pojo.User;

import java.util.List;

public interface UserDao {
    // 查询所有用户
    List<User> getAllUsers();

}
