package com.example.jdbc.demo.service;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Service;

@Service
public class UserService {
    @Autowired
    JdbcTemplate jdbcTemplate;
    public void updataUserList() {

        String sql = "update userinfo set password='123456' where uid='2'";
        jdbcTemplate.update(sql);
    }
}
