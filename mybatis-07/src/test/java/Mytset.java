import com.cz.Dao.TeacherMapper;
import com.cz.pojo.Teacher;
import com.cz.utils.Mybatisutil;
import org.apache.ibatis.session.SqlSession;
import org.junit.Test;

import java.util.List;

public class Mytset {
    @Test
    public void test() {
        SqlSession sqlSession = Mybatisutil.getSqlSession();
        try {
            TeacherMapper mapper = sqlSession.getMapper(TeacherMapper.class);
            List<Teacher> teachers = mapper.selectAll();
            for (Teacher teacher : teachers) {
                System.out.println(teacher);
            }
        } finally {
            sqlSession.close();
    }
    }

    @Test
    public void test2() {
        SqlSession sqlSession = Mybatisutil.getSqlSession();
        try {

            TeacherMapper mapper = sqlSession.getMapper(TeacherMapper.class);
            Teacher teacher = mapper.getTeacher(1);
            System.out.println(teacher);

        } finally {
            sqlSession.close();
    }
    }
}
