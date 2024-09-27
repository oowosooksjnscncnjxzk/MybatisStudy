import com.cz.Dao.UserDao;
import com.cz.pojo.User;
import com.cz.utils.Mybatisutil;
import org.apache.ibatis.session.SqlSession;
import org.junit.Test;

import java.util.HashMap;
import java.util.List;

public class UserMapper {
    @Test
    public void test() {
        //底层主要使用反射
        SqlSession sqlSession = Mybatisutil.getSqlSession();
        UserDao mapper = sqlSession.getMapper(UserDao.class);
        List<User> users = mapper.selectAll();
        for (User user : users) {
            System.out.println(user);
        }
        sqlSession.close();

    }

    @Test
    public void test2() {
        //底层主要使用反射
        SqlSession sqlSession = Mybatisutil.getSqlSession();
        UserDao mapper = sqlSession.getMapper(UserDao.class);
        HashMap<String, Object> stringObjectHashMap = new HashMap<>();
        stringObjectHashMap.put("id", 5);
        stringObjectHashMap.put("name", "陈倬");

        User user = mapper.selectByIdAndName(stringObjectHashMap);
        System.out.println(user);
        sqlSession.close();
    }

    @Test
    public void test3() {
        //底层主要使用反射
        SqlSession sqlSession = Mybatisutil.getSqlSession();
        UserDao mapper = sqlSession.getMapper(UserDao.class);
        User user = new User();
        user.setId(7);
        user.setName("sjw");
        user.setPassword("123456");
        int result = mapper.addUser(user);
        sqlSession.commit();
        sqlSession.close();
    }
}
