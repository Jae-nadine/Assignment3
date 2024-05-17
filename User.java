package com.coderscampus.UserService.Exercise;

public class User {
	private String username;
	private String password;
	private String name;
	
	public User(String username, String password, String name) {
		// TODO Auto-generated constructor stub
		this.username = username;
		this.password = password;
		this.name = name;
	}
	public String getUsername () {
		return username;
	}
	public String getPassword () {
		return password;
	}
	public String getName () {
		return name;
	}
}
