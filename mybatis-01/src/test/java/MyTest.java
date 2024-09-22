import com.cz.Dao.UserDao;
import com.cz.pojo.User;
import com.cz.utils.Mybatisutil;
import org.apache.ibatis.session.SqlSession;
import org.junit.Test;

import java.util.List;

public class MyTest {
    @Test
    public void test() {
        //获取SqlSession对象
        SqlSession sqlSession = Mybatisutil.getSqlSession();
        //执行SQL语句
        UserDao mapper = sqlSession.getMapper(UserDao.class);
        List<User> allUsers = mapper.getAllUsers();
        for (User allUser : allUsers) {
            System.out.println(allUser);
        }
        //关闭SqlSession对象
        sqlSession.close();
    }
}
