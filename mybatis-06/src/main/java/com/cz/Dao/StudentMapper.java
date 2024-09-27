package com.cz.Dao;

import com.cz.pojo.Student;

import java.util.List;

public interface StudentMapper {
    //查询所有学生的信息，以及对于的老师的信息！
    public List<Student> getAllStudents();
    public List<Student> getAllStudents2();


}
