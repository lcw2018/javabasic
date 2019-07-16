package com.lcw.jdbcTemplate;

import com.lcw.domain.Account;
import com.lcw.utils.JDBCUtils;
import org.junit.Test;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;
import java.util.Map;

/**
 * Create by chuanwen.li on 2019/6/6
 */


public class jdbcTemplateDemo2 {


    //Junit单元测试，可以让方法独立运行


    //获取jdbcTemplate对象
    private JdbcTemplate jdbcTemplate = new JdbcTemplate(JDBCUtils.getDataSource());

    //修改id=6的账号的money=600
    @Test
    public void test1() {

        //编写sql语句
        String sql = "update account set money=600 where id=?";

        //返回更新的行数
        int count = jdbcTemplate.update(sql, 6);

        //打印结果
        System.out.println(count);


    }


    @Test
    //添加一条记录
    public void test2() {

        //编写sql语句
        String sql = "insert into account values(null,?,?)";

        //执行sql语句
        int count = jdbcTemplate.update(sql, "果果", 1000);


        System.out.println(count);


    }


    //删除刚才添加的记录

    @Test
    public void test3() {

        //编写sql语句
        String sql = "delete from account where id=?";

        //执行sql语句

        int count = jdbcTemplate.update(sql, 25);

        System.out.println(count);


    }


    //查询id为24的记录，将其封装为map集合,此方法返回的记录数只能是1

    @Test
    public void test4() {

        //编写sql语句

        String sql = "select * from account where id=?";

        //执行sql语句
        Map<String, Object> map = jdbcTemplate.queryForMap(sql, 24);

        System.out.println(map);


    }


    //查询所有记录，将其封装为list

    @Test
    public void test5() {


        //编写sql语句

        String sql = "select * from account";


        List<Map<String, Object>> maps = jdbcTemplate.queryForList(sql);

        for (Map<String, Object> map :
                maps) {

            System.out.println(map);


        }


    }


//查询所有记录，将其封装为Account对象的list集合

    @Test
    public void test6() {

        //编写sql语句

        String sql = "select * from account";


        //执行sql语句

        List<Account> list = jdbcTemplate.query(sql, new RowMapper<Account>() {
            public Account mapRow(ResultSet resultSet, int i) throws SQLException {

                Account account = new Account();

                int id = resultSet.getInt("id");

                String name = resultSet.getString("name");

                double money = resultSet.getDouble("money");


                account.setId(id);
                account.setName(name);
                account.setMoney(money);

                return account;
            }
        });


        for (Account a :
                list) {

            System.out.println(a);
        }


    }


    //查询所有记录，将其封装为Account对象的List集合

    @Test
    public void test6_2() {

        //编写sql语句

        String sql = "select * from account";


        List<Account> accounts = jdbcTemplate.query(sql, new BeanPropertyRowMapper<Account>(Account.class));

        for (Account a :
                accounts) {
            System.out.println(a);
        }


    }


    //查询总记录数

    @Test
    public void test7() {

        //编写sql语句

        String sql = "select count(*) from account";

        Long count = jdbcTemplate.queryForObject(sql, Long.class);

        System.out.println(count);


    }


}
