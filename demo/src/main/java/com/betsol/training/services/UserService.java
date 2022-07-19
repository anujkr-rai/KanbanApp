package com.betsol.training.services;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.betsol.training.entity.User;
import com.betsol.training.entity.UserDto;
import com.betsol.training.dao.UserDao;

@Service
public class UserService {

	@Autowired
	public UserDao userDao;
	
	public User getUser(Long id) {
		Optional<User> findById = userDao.findById(id);
		return findById.get();
	}

	public User createUser(UserDto userDto){
		User user= new User();
		user.setFirst_name(userDto.getFirst_name());
		user.setLast_name(userDto.getLast_name());
		user.setId(userDto.getId());
		user.setUsername(userDto.getUsername());
		user.setPassword(userDto.getPassword());
		return userDao.save(user);
	}

	
}
