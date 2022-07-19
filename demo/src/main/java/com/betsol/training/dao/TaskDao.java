package com.betsol.training.dao;

import javax.transaction.Transactional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.betsol.training.entity.Task;

@Repository
public interface TaskDao extends JpaRepository<Task, Long> {
 
    @Transactional
    @Modifying
    @Query(value = "update task set task.task_name = :taskName, task.details = :details, task.priority = :priority, task.deadline = :deadline where task.task_id = :taskID ", nativeQuery = true)
    void changeTask(@Param("taskID") Long taskID, @Param("taskName") String taskName, @Param("details") String details, @Param("priority") Integer priority, @Param("deadline") String deadline);

}
