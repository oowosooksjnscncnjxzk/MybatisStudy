package com.cz.Dao;

import com.cz.pojo.User;

import java.util.List;
import java.util.Map;

public interface UserDao {
    // 查询所有用户
    List<User> getAllUsers();

    List<User> getUserByLimit(Map<String, Object> map);
}
