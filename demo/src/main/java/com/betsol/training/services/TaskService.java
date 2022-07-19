package com.betsol.training.services;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.betsol.training.dao.TaskDao;
import com.betsol.training.entity.Task;
import com.betsol.training.entity.TaskDto;
import com.betsol.training.entity.User;
import com.betsol.training.entity.changeTask;

@Service
public class TaskService {
    
    @Autowired
    public TaskDao taskDao;

    public Task getTask(Long taskID){
        Optional<Task> findById= taskDao.findById(taskID);
        return findById.get();
    }

    public Task createTask(TaskDto taskDto){
        Task task= new Task();
        task.setTaskID(taskDto.getTaskID());
        task.setTask_name(taskDto.getTask_name());
        task.setDeadline(taskDto.getDeadline());
        task.setDetails(taskDto.getDetails());
        task.setPriority(taskDto.getPriority());
        task.setDateCreated(taskDto.getDateCreated());
        // task.setUserID(taskDto.getUserID());

        User user = new User();
        user.setId(taskDto.getUserID());
        task.setUserID(user);

        return taskDao.save(task);
    }

    public String deleteTask(Long taskID){
        if(taskDao.existsById(taskID)){
            taskDao.deleteById(taskID);
            return "Deleted successfully";
        }
        return "User not found";
    }

    public Task changeTask(changeTask changeTask){
        
        taskDao.changeTask(changeTask.getTask_id(), changeTask.getTask_name(), changeTask.getDetails(), changeTask.getPriority(), changeTask.getDeadline());
        return taskDao.findById(changeTask.getTask_id()).get();
    }
}
