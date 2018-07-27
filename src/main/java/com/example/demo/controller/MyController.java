package com.example.demo.controller;


import com.example.demo.bean.AppUser;
import com.example.demo.bean.Mybean;
import com.example.demo.dao.AccountRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MyController {

    @Autowired
    private AccountRepository accountRepository;

//    @Autowired
//    private JdbcTemplate jdbcTemplate;

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

        AppUser oneById = accountRepository.findById(3).orElse(null);


        AppUser user = AppUser.builder()
                .username("app4")
                .password("password4")
                .build();

        accountRepository.save(user);


        return oneById;
    }
}
