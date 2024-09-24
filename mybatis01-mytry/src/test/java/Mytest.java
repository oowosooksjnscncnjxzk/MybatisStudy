import com.cz.Dao.Dao;
import com.cz.pojo.User;
import com.cz.utils.Utils;
import org.apache.ibatis.session.SqlSession;
import org.junit.Test;

import java.util.List;

public class Mytest {
    @Test
    public void test() {
        // 创建SqlSession    正实角色
        SqlSession sqlSession = Utils.getSqlSession();
        try {
            // 获取Dao接口的实现类  动态代理
            Dao mapper = sqlSession.getMapper(Dao.class);
            // 执行查询方法
            List<User> users = mapper.GetUserList();
            // 打印查询结果
            for (User user : users) {
                System.out.println(user);
            }

        }finally {
            // 关闭SqlSession
            //每次收到 HTTP 请求，就可以打开一个 SqlSession，返回一个响应后，就关闭它。 这个关闭操作很重要，为了确保每次都能执行关闭操作，你应该把这个关闭操作放到 finally 块中。
            sqlSession.close();
        }


    }
}
