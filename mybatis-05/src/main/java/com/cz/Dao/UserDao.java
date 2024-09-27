package com.cz.Dao;

import com.cz.pojo.User;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Select;

import java.util.List;
import java.util.Map;

public interface UserDao {
    @Select("SELECT * FROM user")
    List<User> selectAll();

    //方法存在多个参数，所有的参数前面必须加上@·Param注解，注解的值即为参数名
    @Select("SELECT * FROM user WHERE id = #{id} AND name = #{name}")
    User selectByIdAndName(Map<String, Object> map);


    @Insert("INSERT INTO user(id, name, pwd) VALUES(#{id}, #{name}, #{password})")
    int addUser(User user);

}
