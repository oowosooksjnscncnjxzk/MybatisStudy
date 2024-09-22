package com.cz.Dao;

import com.cz.pojo.User;

import java.util.List;
import java.util.Map;

public interface UserDao {
    // 查询所有用户
    List<User> getAllUsers();

    // 添加用户
    int addUser(User user);

    // 更新用户
    int updateUser(User user);
    // 删除用户
    int deleteUser(int id);
}
