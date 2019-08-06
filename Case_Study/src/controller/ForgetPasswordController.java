package controller;


import java.util.Scanner;

import AtmApplication.AtmApplication;
import pojo.User;
import service.ForgetPasswordService;
import service.ForgetPasswordServiceImpl;

public class ForgetPasswordController {

	static User refUser;   
	static ForgetPasswordService refForgetPasswordService; 

	public void userForgetPasswordController() 
	{
		
		
		refForgetPasswordService = new ForgetPasswordServiceImpl();  
		refUser =  new User();
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter your Email: ");
		String email = sc.next();
		refUser.setUserEmail(email);   
		
		refForgetPasswordService.verifyID(refUser);  
		
	
		
	}
	
	public void userInputSecurity()
	{
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter Security key: ");
		String color = sc.next();
		refUser.setSecurityColor(color);  
		
		
		refForgetPasswordService.verifySecurity(refUser);  
		System.out.println();
		
		
	
		
	}
	
	public void userSetNewPassword()
	{
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter new password: ");
		String password = sc.next();
		refUser.setUserPassword(password); 
	    userRetypePassword();
	
	}
	
	public void userRetypePassword()
	{
		
		Scanner sc = new Scanner(System.in);
		
	    System.out.print("Re-type password: ");
		String newPassword = sc.next();
		refUser.setRetypePassword(newPassword);   
	
        
        refForgetPasswordService.verifyPassword(refUser);  
        
	}
	
	public void userInputSecurityKey()
	{
      
        Scanner sc = new Scanner(System.in);
        System.out.print("What is your favourite colour ? ");
 		String color = sc.next();
 		refUser.setSecurityColor(color); 
 		System.out.println(refUser.getSecurityColor() + " " + "is your security key, if you forget your password" );
 		
        System.out.println();
  		
  	    System.out.println("New Password has been set !!");
  		System.out.println();
 		AtmApplication.main(null);   
 		
	}
}