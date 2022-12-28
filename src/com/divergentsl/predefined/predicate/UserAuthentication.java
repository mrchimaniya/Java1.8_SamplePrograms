package com.divergentsl.predefined.predicate;

import java.util.function.Predicate;

class User{
	private String username;
	private String password;
	
	User(String username,String password){
		this.username=username;
		this.password=password;
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

public class UserAuthentication {
	public static void main(String[] args) {
        Predicate<User> check= user->user.getUsername().equals("Aayush") && user.getPassword().equals("123");
        User user1=new User("Aayush","123");
        if(check.test(user1))
        	System.out.println(user1.getUsername()+" Is Valid User");
        else
        	System.out.println(user1.getUsername()+" Is Invalid User");
        
        User user2=new User("Ram","123");
        if(check.test(user2))
        	System.out.println(user2.getUsername()+" Is Valid User");
        else
        	System.out.println(user2.getUsername()+" Is Invalid User");
	}
}
