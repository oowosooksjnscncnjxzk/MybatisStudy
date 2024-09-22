import com.cz.Dao.UserDao;
import com.cz.pojo.User;
import com.cz.utils.Mybatisutil;
import org.apache.ibatis.session.SqlSession;
import org.junit.Test;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class MyTest {
    @Test
    public void test() {
        //获取SqlSession对象
        SqlSession sqlSession = Mybatisutil.getSqlSession();
        //执行SQL语句  动态代理  创建代理类实例
        UserDao mapper = sqlSession.getMapper(UserDao.class);
        List<User> allUsers = mapper.getAllUsers();
        for (User allUser : allUsers) {
            System.out.println(allUser);
        }
        //关闭SqlSession对象
        sqlSession.close();
    }

    @Test
    public void test2() {
        //获取SqlSession对象
        SqlSession sqlSession = Mybatisutil.getSqlSession();
        UserDao mapper = sqlSession.getMapper(UserDao.class);
        User user = mapper.getUserById(1);
        System.out.println(user);
        //关闭SqlSession对象
        sqlSession.close();
    }

    @Test
    public void test3() {
        //获取SqlSession对象
        SqlSession sqlSession = Mybatisutil.getSqlSession();
        UserDao mapper = sqlSession.getMapper(UserDao.class);
        User user = new User();
        user.setId(5);
        user.setName("cz");
        user.setPwd("123456");
        int result = mapper.addUser(user);
        System.out.println(result);

        //增删改需要手动提交事务
        sqlSession.commit();
        //关闭SqlSession对象
        sqlSession.close();
    }

    //更新用户信息
    @Test
    public void test4() {
        //获取SqlSession对象
        SqlSession sqlSession = Mybatisutil.getSqlSession();
        UserDao mapper = sqlSession.getMapper(UserDao.class);
        User user = new User();
        user.setId(5);
        user.setName("陈倬");
        user.setPwd("123456");
        int result = mapper.updateUser(user);
        System.out.println(result);

        //增删改需要手动提交事务
        sqlSession.commit();
        //关闭SqlSession对象
        sqlSession.close();
    }

    @Test
    public void test5() {
        //获取SqlSession对象
        SqlSession sqlSession = Mybatisutil.getSqlSession();
        UserDao mapper = sqlSession.getMapper(UserDao.class);
        Map<String, Object> map = new HashMap< String, Object>();
        map.put("id", 8);
        map.put("name", "陈aa");
        map.put("pwd", "1234");
        int result = mapper.adduser2(map);
        System.out.println(result);

        //增删改需要手动提交事务
        sqlSession.commit();
        //关闭SqlSession对象
        sqlSession.close();
    }


}
