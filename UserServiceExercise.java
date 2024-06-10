package com.coderscampus.UserService.Exercise;

public class UserServiceExercise {

	public static User createUser(String[] stringInput) {
		String username = stringInput[0];
		String password = stringInput[1];
		String name = stringInput[2];
		
		User user = new User(username, password, name);
		return user;
	}


    public static String[] parseText(String input) {
        return input.split(",");
    }

    public static void main(String[] args) {
        String[] inputArray = {"Scrumptious321", "Password123", "Patunia"};
        User createdUser = createUser(inputArray);
        System.out.println("Created user: " + createdUser.getUsername() + ", " + 
        createdUser.getPassword() + ", " + createdUser.getName());

        String inputString = "Scrumptious321,Password123,Patunia";
        String[] parsedArray = parseText(inputString);
        System.out.println("Parsed array: " + parsedArray[0] + ", " + parsedArray[1] + ", " + 
        parsedArray[2]);
    }
}
