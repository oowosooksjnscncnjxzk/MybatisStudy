import com.cz.dao.BlogMapper;
import com.cz.pojo.Blog;
import com.cz.utils.IDUtils;
import com.cz.utils.Mybatisutil;
import com.sun.javafx.collections.MappingChange;
import org.apache.ibatis.session.SqlSession;
import org.junit.Test;

import java.util.*;

public class Mytest {
    @Test
    public void test() {
        SqlSession sqlSession = Mybatisutil.getSqlSession();
        try {
            BlogMapper mapper = sqlSession.getMapper(BlogMapper.class);
            Blog blog=new Blog();
            blog.setId(IDUtils.gentID());
            blog.setTitle("mybatis如此简单，有手就行，菜就多练，天才只是见我的门槛");
            blog.setAuthor("cz");
            blog.setViews(100);
            blog.setCreateTime(new Date());
            mapper.insertBlog(blog);


            blog.setId(IDUtils.gentID());
            blog.setTitle("mysql如此简单，有手就行，菜就多练，天才只是见我的门槛");
            blog.setAuthor("aw");
            blog.setViews(20);
            blog.setCreateTime(new Date());
            mapper.insertBlog(blog);

            blog.setId(IDUtils.gentID());
            blog.setTitle("spring如此简单，有手就行，菜就多练，天才只是见我的门槛");
            blog.setAuthor("qzy");
            blog.setViews(0);
            blog.setCreateTime(new Date());
            mapper.insertBlog(blog);

            blog.setId(IDUtils.gentID());
            blog.setTitle("springboot如此简单，有手就行，菜就多练，天才只是见我的门槛");
            blog.setAuthor("htx");
            blog.setViews(4000);
            blog.setCreateTime(new Date());
            mapper.insertBlog(blog);


        } finally {
            sqlSession.close();
        }
    }

    @Test
    public void test2() {
        SqlSession sqlSession = Mybatisutil.getSqlSession();
        try {
            BlogMapper mapper = sqlSession.getMapper(BlogMapper.class);
            Map<String, String> map =new HashMap<>();
            map.put("title", "%有手就行%");
            map.put("author", "cz");
            List<Blog> blogs = mapper.selectBlogsIF(map);
            for (Blog blog : blogs) {
                System.out.println(blog);
            }
        } finally {
            sqlSession.close();
        }
    }

    @Test
    public void test3() {
        SqlSession sqlSession = Mybatisutil.getSqlSession();
        try {
            BlogMapper mapper = sqlSession.getMapper(BlogMapper.class);
            Map<String, Object> map =new HashMap<>();
            map.put("title", "%有手就行%");
            List<Blog> blogs = mapper.selectBlogsByCondition(map);
            for (Blog blog : blogs) {
                System.out.println(blog);
            }
        } finally {
            sqlSession.close();
        }
    }
    @Test
    public void test4() {
        SqlSession sqlSession = Mybatisutil.getSqlSession();
        try {
            BlogMapper mapper = sqlSession.getMapper(BlogMapper.class);
            Map<Object, Object> map =new HashMap<>();
            map.put("id","6247d518.a1ed.4286.bded.f3d5b7c3139d");
            map.put("title", "mybatis如此简单5555");
            map.put("createTime", new Date()); // 修正这里，将createTime加入map并设置值
            mapper.updateBlog(map);
        } finally {
            sqlSession.close();
        }
    }

    @Test
    public void test5() {
        SqlSession sqlSession = Mybatisutil.getSqlSession();
        try {
            BlogMapper mapper = sqlSession.getMapper(BlogMapper.class);
            //使用Foreach标签查询第1-3条记录
            Map<String, Object> map =new HashMap<>();
            List<Integer> ids = new ArrayList<>();
            ids.add(1);
            ids.add(2);
            ids.add(3);
            ids.add(4);
            map.put("ids", ids);
            List<Blog> blogs = mapper.selectBlogsForeach(map);
            for (Blog blog : blogs) {
                System.out.println(blog);
            }
        } finally {
            sqlSession.close();
        }
    }
}
