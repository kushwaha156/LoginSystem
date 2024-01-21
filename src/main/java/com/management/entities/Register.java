package com.management.entities;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
public class Register {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int primarykey;
	
	private String username;
	private String email;
	private String password;
	private String userrole;
	
	
	public Register() {
		super();
		// TODO Auto-generated constructor stub
	}


	public Register(int primarykey, String username, String email, String password, String userrole) {
		super();
		this.primarykey = primarykey;
		this.username = username;
		this.email = email;
		this.password = password;
		this.userrole = userrole;
	}


	public int getPrimarykey() {
		return primarykey;
	}


	public void setPrimarykey(int primarykey) {
		this.primarykey = primarykey;
	}


	public String getUsername() {
		return username;
	}


	public void setUsername(String username) {
		this.username = username;
	}


	public String getEmail() {
		return email;
	}


	public void setEmail(String email) {
		this.email = email;
	}


	public String getPassword() {
		return password;
	}


	public void setPassword(String password) {
		this.password = password;
	}


	public String getUserrole() {
		return userrole;
	}


	public void setUserrole(String userrole) {
		this.userrole = userrole;
	}


	@Override
	public String toString() {
		return "Register [primarykey=" + primarykey + ", username=" + username + ", email=" + email + ", password="
				+ password + ", userrole=" + userrole + "]";
	}
	
	
	
	
}
