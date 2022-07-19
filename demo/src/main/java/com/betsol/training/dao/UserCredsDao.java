package com.betsol.training.dao;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.betsol.training.entity.UserCreds;

@Repository
public interface UserCredsDao extends JpaRepository<UserCreds, Long>{

}