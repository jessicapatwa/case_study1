package controller;

import java.util.Scanner;

import pojo.User;
import service.LoginService;
import service.LoginServiceImpl;

public class LoginController {
	
	// loose coupling through reference of the interface
	LoginService refLoginService; // LoginService is an interface 
	User refUser;// User is a POJO (Plain Old Java Object)
	
	public void userLoginController() {
		
		userLoginInput();
		
	}
	
	void userLoginInput() {
		Scanner sc = new Scanner(System.in);
		
		 System.out.println();
		// step 1 : ask user ID and Password
		System.out.println("Enter email address : ");
		String userEmail = sc.next();
		
		System.out.println("Enter Password : ");
		String password = sc.next();
		
		// step 2 : create object of User class
		 User refUser = new User();
		
		// step 3 : set values to setter method of User class
		refUser.setUserEmail(userEmail);
		refUser.setUserPassword(password);
		
		// step 4 : create object of  LoginServiceImpl class and refer to its interface
		refLoginService = new LoginServiceImpl(); // we have to create object
		
		// step 5 : call checkStatus method and pass the reference of User class
		refLoginService.checkStatus(refUser);
		
	}

}