package com.cz.dao;

import com.cz.pojo.Blog;

import java.util.List;
import java.util.Map;

public interface BlogMapper {
    //插入数据
    public  void insertBlog(Blog blog) ;
    //查询博客
    List<Blog> selectBlogsIF(Map<String, String> map);
    //按条件查询博客
    List<Blog> selectBlogsByCondition(Map map);

    //动态更新博客
    void updateBlog(Map map);

    //查询1-2-3条博客
    List<Blog> selectBlogsForeach(Map map);

}
