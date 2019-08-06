package controller;

import java.util.Scanner;

import pojo.User;
import service.LoginService;
import service.RegServiceImpl;
import service.RegisterService;

public class RegisterController {


	  Scanner sc = new Scanner(System.in);
	static RegisterService refRegisterService = new RegServiceImpl(); 
	 static User refUser = new User();                  
	     
	
	 public void userRegisterController()
	 {
		 userInputEmail();      
	 }
	 
	public void userInputEmail()
	{
		
		
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter email address: ");
		String email = sc.next();
		refUser.setUserEmail(email);    
        refRegisterService.checkEmail(refUser);  
        System.out.println();
		
	}
	
	public void userInputPassword()
	{
		 
		
		System.out.print("Enter Password: ");
	    String password = sc.next();
		refUser.setUserPassword(password);  
		userInputReTypePassword();   
	}	
	
	
	
	public void userInputReTypePassword()
	{
	
		Scanner sc = new Scanner(System.in);
	    System.out.print("Re-type password: ");
		String retypePassword = sc.next();
		refUser.setRetypePassword(retypePassword);  
	    refRegisterService.checkPassword(refUser);  
 		
    }

	public void userInputSecurityColor()
	{
		
		Scanner sc = new Scanner(System.in);
		System.out.print("What is your favourite color? ");
 		String color = sc.next();
 		refUser.setSecurityColor(color);   
 		refRegisterService.SecurityKey(refUser);  
	}
}