package com.LoginRegister.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class Users {
	
	@Id
	private String email;
	private String name;
	private Long mobile;
	private String password;
	
	
	
	public String getEmail() {
		return email;
	}



	public void setEmail(String email) {
		this.email = email;
	}



	public String getName() {
		return name;
	}



	public void setName(String name) {
		this.name = name;
	}



	public Long getMobile() {
		return mobile;
	}



	public void setMobile(Long mobile) {
		this.mobile = mobile;
	}



	public String getPassword() {
		return password;
	}



	public void setPassword(String password) {
		this.password = password;
	}


	

	public Users() {
		super();
	}



	public Users(String email, String name, Long mobile, String password) {
		super();
		this.email = email;
		this.name = name;
		this.mobile = mobile;
		this.password = password;
	}

	
}
