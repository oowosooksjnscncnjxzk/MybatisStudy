package com.cz.Dao;

import com.cz.pojo.Teacher;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;

public interface TeacherMapper {
    //查询老师
    @Select("SELECT * FROM teacher WHERE id = #{tid}")
    public Teacher getTeacher(@Param("tid") int id);
}
