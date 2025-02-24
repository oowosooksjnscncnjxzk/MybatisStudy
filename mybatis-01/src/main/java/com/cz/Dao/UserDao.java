package com.cz.Dao;

import com.cz.pojo.User;

import java.util.List;
import java.util.Map;

public interface UserDao {
    // 查询所有用户
    List<User> getAllUsers();
    // 根据id查询用户
    User getUserById(int id);

    // 添加用户
    int addUser(User user);

    // 更新用户
    int updateUser(User user);


    int adduser2(Map<String, Object> map);

}
