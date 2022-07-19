package com.betsol.training.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table
public class User {

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	@Column(name="user_id")
	private Long userID;

	@Column(name="first_name")
	private String first_name;

	@Column(name="last_name")
	private String last_name;

	@Column(name="username")
    private String username;

    @Column(name="password")
    private String password;

	// @OneToOne(cascade = CascadeType.ALL)
    // @JoinColumn(name="userID", referencedColumnName = "userID")
    // private UserCreds userCred;

	public User (){
		
	}

	public User(String first_name,String last_name, Long id, String username, String password) {
		super();
		this.userID = id;
		this.first_name = first_name;
		this.last_name = last_name;
		this.username=username;
        this.password=password;
        
	}

	public String getFirst_name() {
		return first_name;
	}

	public void setFirst_name(String first_name) {
		this.first_name = first_name;
	}

	public String getLast_name() {
		return last_name;
	}

	public void setLast_name(String last_name) {
		this.last_name = last_name;
	}

	public Long getId() {
		return userID;
	}

	public void setId(Long id) {
		this.userID = id;
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

}
