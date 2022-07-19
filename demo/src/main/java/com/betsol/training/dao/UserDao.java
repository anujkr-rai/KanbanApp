package com.betsol.training.dao;

// import org.springframework.data.jpa.repository.JpaRepository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.betsol.training.entity.User;

@Repository
public interface UserDao extends JpaRepository<User, Long>{

}


