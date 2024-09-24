import com.cz.Dao.UserDao;
import com.cz.pojo.User;
import com.cz.utils.Mybatisutil;
import org.apache.ibatis.session.SqlSession;
import org.apache.log4j.Logger;
import org.junit.Test;

import java.util.HashMap;
import java.util.List;
import java.util.Map;


public class mytest {
    static Logger logger = Logger.getLogger(mytest.class);
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
    @Test
    public void test2() {

        logger.info("info:进入info方法");
        logger.debug("debug:进入debug方法");
        logger.error("error:进入error方法");
        logger.warn("warn:进入warn方法");
    }

    @Test
    public void test3() {
        SqlSession sqlSession = Mybatisutil.getSqlSession();
        try {
            UserDao mapper = sqlSession.getMapper(UserDao.class);
            Map<String, Object> map = new HashMap<>();
            int[] param= new int[] {0, 2};
            map.put("param", param);
            List<User> userByLimit = mapper.getUserByLimit(map);
            for (User user : userByLimit) {
                System.out.println(user);
            }
        } finally {
            sqlSession.close();
        }
    }
}
