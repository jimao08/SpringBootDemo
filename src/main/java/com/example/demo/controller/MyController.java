package com.example.demo.controller;


import com.example.demo.bean.AppUser;
import com.example.demo.bean.Mybean;
import com.example.demo.dao.AccountRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.support.rowset.SqlRowSet;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MyController {

    @Autowired
    private AccountRepository accountRepository;

    @Autowired
    private JdbcTemplate jdbcTemplate;

    @RequestMapping("/hello")
    public String hello() {
        return "Hello Spring Boot!";
    }

    @RequestMapping("/aa")
    public Object aa() {
        Mybean mybean = Mybean.builder()
                .ival(100)
                .msg("message")
                .build();

        AppUser oneById = accountRepository.findOneById(3);

        return oneById;
    }
}
