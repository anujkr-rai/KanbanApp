package com.betsol.training.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;


@Entity
@Table
public class UserCreds {

    @Column
    private String username;
    @Column
    private String password;
    @Id
    private Long user_id;
    


    @OneToOne
    @JoinColumn(name="user_id")
    private User userID;

    public UserCreds(){
        
    }
    

    public UserCreds(String username, String password, User userID){
        this.username=username;
        this.password=password;
        this.userID=userID;
    }


    public String getUsername() {
        return username;
    }


    public void setUsername(String username) {
        this.username = username;
    }


    public String getPassword() {
        return password;
    }


    public void setPassword(String password) {
        this.password = password;
    }


    public User getUserID() {
        return userID;
    }


    public void setUserID(User userID) {
        this.userID = userID;
    }


}
