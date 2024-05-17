package com.coderscampus.UserService.Exercise;

public class UserApplication {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String[] stringInput = {"Scrumptious321", "Password123", "Patunia"};
		User user = UserServiceExercise.createUser(stringInput);
	
		System.out.println("Username: " + user.getUsername());
		System.out.println("Password: " + user.getPassword());
		System.out.println("Name: " + user.getName());
	}
	

}
