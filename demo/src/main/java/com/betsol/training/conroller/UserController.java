package com.betsol.training.conroller;

import java.text.SimpleDateFormat;
import java.util.Date;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.betsol.training.entity.Task;
import com.betsol.training.entity.TaskDto;
import com.betsol.training.entity.User;
import com.betsol.training.entity.UserDto;
import com.betsol.training.entity.changeTask;
import com.betsol.training.services.TaskService;
import com.betsol.training.services.UserService;

import lombok.extern.slf4j.Slf4j;

@RestController
@Slf4j
public class UserController {
	
	@Autowired
	private UserService userService;

	@Autowired
	private TaskService taskService;

	@GetMapping("/getUser/{userID}")
	public User getUser(@PathVariable("userID") Long userID) {
		String CLASS_NAME= "getUser";
		log.info(new SimpleDateFormat("yyyy/MM/dd HH:mm:ss").format(new Date()) +"Getting a single user"+CLASS_NAME);
		return userService.getUser(userID);
	}

	@PostMapping("/createUser")
	public User createUser(@RequestBody UserDto user){
		String CLASS_NAME= "createUser";
		log.info(new SimpleDateFormat("yyyy/MM/dd HH:mm:ss").format(new Date()) +"Creating User "+CLASS_NAME);
		return userService.createUser(user);
	}

	@GetMapping("/getTask/{taskID}")
	public Task getTask(@PathVariable("taskID") Long taskID){
		String CLASS_NAME= "getTask";
		log.info(new SimpleDateFormat("yyyy/MM/dd HH:mm:ss").format(new Date()) +"Getting a single Task from "+CLASS_NAME);
		return taskService.getTask(taskID);
	}

	@PostMapping("/createTask")
	public Task createTask(@RequestBody TaskDto task){
		String CLASS_NAME= "createTask";
		log.info(new SimpleDateFormat("yyyy/MM/dd HH:mm:ss").format(new Date()) +"Created a new task from"+CLASS_NAME);
		return taskService.createTask(task);
	}

	@DeleteMapping("/deleteTask/{taskID}")
	public String deleteTask(@PathVariable("taskID") Long taskID){
		String CLASS_NAME= "deleteTask";
		log.info(new SimpleDateFormat("yyyy/MM/dd HH:mm:ss").format(new Date()) +"Deleted Task "+CLASS_NAME);
		return taskService.deleteTask(taskID);
	}

	@PutMapping("/changeTask")
	public Task changeTask(@RequestBody changeTask changeTask){
		String CLASS_NAME= "editTask";
		log.info(new SimpleDateFormat("yyyy/MM/dd HH:mm:ss").format(new Date()) +"Editing Task from "+CLASS_NAME);
		return taskService.changeTask(changeTask);
	}

}
