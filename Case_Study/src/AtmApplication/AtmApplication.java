package AtmApplication;


import java.util.Scanner;

import controller.LoginController;
import controller.RegisterController;
import controller.ForgetPasswordController;

public class AtmApplication {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		
		
		 System.out.println("User Home Page");
		 
	   	 System.out.println("1.Register");        
	   	 
	   	 System.out.println("2.Login");
	   	 
	   	 System.out.println("3.ForgetPassword");
	   	 
	   	 System.out.println("4.Logout");
	   	 
	   	 System.out.println();
	   	
	   	 System.out.print("Enter your choice: ");
	     int choice = sc.nextInt();
	     System.out.println();
	     
	     switch(choice)                 
	   	 {
	   	 
	   	 case 1:
	   	 {
	   		RegisterController refRegisterController = new RegisterController();
	   		refRegisterController.userRegisterController();
	   		break;
	   	 }
	   	  case 2:
	   	 {
	   		LoginController refLoginController = new LoginController();
	   		refLoginController.userLoginController();     
	   		break;
	   	 }
	   	 
	   	case 3:
	   	 {
	   		ForgetPasswordController refForgetPasswordController = new ForgetPasswordController();
	   		refForgetPasswordController.userForgetPasswordController();
	   		     
			 
	   		 break;
	   	 }
	  
	   	 case 4:
	   	 {
	   		System.out.println("Log Out is Successful");
	   		 break;
	   	 }
	   	 default:
	   	 {
	   		 System.out.println("Invalid option...");
	   		 break;
	   	 }
	   	 
	   	 
	   	 
	   	 }
		

	}

}