package com.cz.Dao;

import com.cz.pojo.User;

import java.util.List;

public interface Dao {
    //查询所有用户信息
    List<User> GetUserList();

}
