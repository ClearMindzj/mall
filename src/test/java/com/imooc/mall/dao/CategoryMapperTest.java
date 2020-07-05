package com.imooc.mall.dao;

import com.imooc.mall.MallApplicationTests;
import com.imooc.mall.pojo.Category;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

/**
 * Created by zhengjie on 2020/3/11.
 */

public class CategoryMapperTest extends MallApplicationTests {
    @Autowired
    private CategoryMapper categoryMapper;

    @Test
    public void fingById() {
        Category category=categoryMapper.selectByPrimaryKey(100001);
        System.out.println(category.toString());
    }

    @Test
    public void queryById() {
        Category category=categoryMapper.selectByPrimaryKey(100001);
        System.out.println(category.toString());
    }
}