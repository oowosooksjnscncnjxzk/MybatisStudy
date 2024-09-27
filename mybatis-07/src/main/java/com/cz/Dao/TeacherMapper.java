package com.cz.Dao;

import com.cz.pojo.Teacher;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;

import java.util.List;

public interface TeacherMapper {
    List<Teacher> selectAll();

    //获取指定老师下的所有学生及老师信息
    Teacher getTeacher(@Param("tid") int id);
}
