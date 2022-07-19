package com.betsol.training.entity;


import java.sql.Date;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import org.hibernate.annotations.CreationTimestamp;

@Entity
@Table
public class Task {

    @Column(name="task_name")
    private String task_name;

    @Column(name="details")
    private String details;
    
    @Id
    @Column(name="task_id")
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long taskID;

    @Column(name="priority")
    private Integer priority;

    @Column(name="deadline")
    private String deadline;

    @CreationTimestamp
    @Column(name="date_created", updatable = false)
    private Date dateCreated;

    // @Column
    // private Integer userID;

    // @OneToOne
    // @JoinColumn(name="user_id")
    // private User userID;

    @OneToOne
    @JoinColumn(name="user_id", referencedColumnName = "user_id")
    private User userID;

    public Task(){

    }

    public Task(String task_name,String details, Long taskID, Integer priority, String deadline, User userID) {
		super();
		this.task_name=task_name;
        this.deadline=deadline;
        this.details=details;
        this.priority=priority;
        this.taskID=taskID;
        this.userID=userID;
	}

    public String getTask_name() {
        return task_name;
    }

    public void setTask_name(String task_name) {
        this.task_name = task_name;
    }

    public String getDetails() {
        return details;
    }

    public void setDetails(String details) {
        this.details = details;
    }

    public Long getTaskID() {
        return taskID;
    }

    public void setTaskID(Long taskID) {
        this.taskID = taskID;
    }

    public Integer getPriority() {
        return priority;
    }

    public void setPriority(Integer priority) {
        this.priority = priority;
    }

    public String getDeadline() {
        return deadline;
    }

    public void setDeadline(String deadline) {
        this.deadline = deadline;
    }

    public User getUserID() {
        return userID;
    }

    public void setUserID(User userID) {
        this.userID = userID;
    }

    public Date getDateCreated() {
        return dateCreated;
    }

    public void setDateCreated(Date dateCreated) {
        this.dateCreated = dateCreated;
    }
    

    


    
}
