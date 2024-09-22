import com.cz.Dao.UserDao;
import com.cz.pojo.User;
import com.cz.utils.Mybatisutil;
import org.apache.ibatis.session.SqlSession;
import org.junit.Test;

import java.util.List;

public class Mytest {
    @Test
    public void test() {
        SqlSession sqlSession = Mybatisutil.getSqlSession();
        try {
            UserDao mapper = sqlSession.getMapper(UserDao.class);
            List<User> allUsers = mapper.getAllUsers();
            for (User user : allUsers) {
                System.out.println(user);
            }
        } finally {
            sqlSession.close();
        }
    }
}
