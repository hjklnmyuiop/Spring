package com.atguigu.spring6.jdbc;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.test.context.junit.jupiter.SpringJUnitConfig;

import java.util.HashMap;
import java.util.List;

/**
 * @Author: dev_guo
 * @Date: 2023/3/28 18:07
 */
@SpringJUnitConfig(locations = "classpath:bean.xml")
public class jdbcTemplateTest {
    @Autowired
    private JdbcTemplate jdbcTemplate;
    //查询 返回对象
    @Test
    public void testSelectObject(){
        String sql="select * from t_emp where id=?";
        Emp emp1 = jdbcTemplate.queryForObject(sql,
              new BeanPropertyRowMapper<>(Emp.class), 3);
        System.out.println(emp1);
    }
    //查询list集合
    @Test
    public void testSelectList(){
        String sql="select * from t_emp";
        List list = jdbcTemplate.query(sql, new BeanPropertyRowMapper(Emp.class));
        System.out.println(list);
    }
    //查询单个值

    //添加修改删除
    @Test
    public void testUpdate() {
        //编写sql语句
        String sql = "INSERT into t_emp VALUES(NULL,?,?,?);";
        //调用jdbcTemplate方法，传入相关参数
        Object[] param = {"dev", 3, "男"};
        jdbcTemplate.update(sql, param);

        //修改功能
        String edisql = "update t_emp set name=? where id=?";
        int result = jdbcTemplate.update(edisql, "张三atguigu", 1);

        //删除功能
        String desql = "delete from t_emp where id=?";
        jdbcTemplate.update(desql, 1);
    }
}
