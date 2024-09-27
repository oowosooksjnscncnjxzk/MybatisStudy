import com.cz.Dao.StudentMapper;
import com.cz.Dao.TeacherMapper;
import com.cz.pojo.Student;
import com.cz.pojo.Teacher;
import com.cz.utils.Mybatisutil;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.session.SqlSession;
import org.junit.Test;

import java.util.List;

public class Mytest {
    @Test
    public void test() {
        SqlSession sqlSession = Mybatisutil.getSqlSession();
        try {
            TeacherMapper mapper = sqlSession.getMapper(TeacherMapper.class);
            Teacher teacher = mapper.getTeacher(1);
            System.out.println(teacher);
        } finally {
            sqlSession.close();
        }
    }


    @Test
    public void test2() {
        SqlSession sqlSession = Mybatisutil.getSqlSession();
        try {
            StudentMapper mapper = sqlSession.getMapper(StudentMapper.class);
            List<Student> allStudents = mapper.getAllStudents();
            for (Student allStudent : allStudents) {
                System.out.println(allStudent);
            }
        } finally {
            sqlSession.close();
        }
    }
    @Test
    public void test3() {
        SqlSession sqlSession = Mybatisutil.getSqlSession();
        try {
            StudentMapper mapper = sqlSession.getMapper(StudentMapper.class);
            List<Student> allStudents2 = mapper.getAllStudents2();
            for (Student student : allStudents2) {
                System.out.println(student);
            }
        } finally {
            sqlSession.close();
        }
    }
}
