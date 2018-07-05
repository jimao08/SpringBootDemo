package com.example.demo.dao;

import com.example.demo.bean.AppUser;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AccountRepository extends JpaRepository<AppUser, Integer> {

    AppUser findOneByUsername(String username);

    AppUser findOneById(Integer id);
}
