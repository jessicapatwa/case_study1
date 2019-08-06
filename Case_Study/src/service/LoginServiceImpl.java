package service;




import java.util.Scanner;

import AtmApplication.AtmApplication;
import controller.LoginController;
import dao.LoginDAO;
import dao.LoginDAOImpl;
import pojo.User;

public class LoginServiceImpl implements LoginService{

	LoginDAO refLoginDAO;
	LoginController refLoginController;
	User refUser;
	@Override
	public void checkStatus(User ref) {
		refLoginDAO = new LoginDAOImpl();
		if(refLoginDAO.loginValidate(ref)==true) {
			System.out.println("Login Successful!!");
			bankMenu();
			
				
		}
		else {
			System.out.println("Invalid Email or Password..");
			refLoginController.userLoginController(); 
		}
		
	}
	
	
	int balance;
	int transaction;
	public void bankMenu()
	{
		Scanner sc = new Scanner(System.in);
	
		System.out.println("Type 1: Check available Balance");
		System.out.println("Type 2: Deposit Amount");
		System.out.println("Type 3: Withdraw Amount");
		System.out.println();
		int choice1;
	
		
		System.out.print("Enter your choice: ");
		choice1 = sc.nextInt();
		
		//switch case 
		switch(choice1)
		{
		case 1:
		{
			System.out.println("Balance: " +balance);
			System.out.println();
			tocontinue();
			break;
		}
		case 2:
		{
			refUser = new User();
			
		    System.out.print("Enter amount to deposit: ");
		    int amount = sc.nextInt();
		    
			deposit(amount); 
			tocontinue(); 
			break;
		}
		case 3:
		{

			refUser = new User(); 
			
		    System.out.print("Enter amount to withdraw: ");
		
		    int amount1 = sc.nextInt();
	
		    
			withdraw(amount1); 
		    tocontinue(); 
			break;
		}
		default:
		{
			System.out.println("choice not available");
			tocontinue(); 
			break;
		}
		}
		
		
		
	}
	
	public void deposit(int amount)
	{
		if(amount > 0)
		{
			balance = balance + amount;  
			transaction = amount;        
			System.out.println(transaction + " " + "dollars deposited successfully !!" );
			System.out.println();
		}
		else {
			System.out.println("Amount cannot be negative..Re-enter Amount");
			Scanner sc = new Scanner(System.in);
			amount = sc.nextInt();
			deposit(amount);
			tocontinue();
		}
	}
	
	public void withdraw(int amount)
	{
		if(amount <= balance)
		{
			balance = balance - amount;  
			transaction = amount;   
			System.out.println(transaction + " " + "dollars withdrawn successfully!!");  //math.abs operation returns the absolute integer value
			System.out.println();
			
		}
		else
		{
			System.out.println("Insufficient balance !!");
			System.out.println();
			
		}
	
	
	}
	public void tocontinue()
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("Wish to continue ? (y/n) ");
		String yn = sc.next();
		System.out.println();
		
	
		if(yn.equalsIgnoreCase("yes"))
		{
			bankMenu();   
		}
		else if(yn.equalsIgnoreCase("no"))
		{
			System.out.println("THANKS FOR BANKING WITH US!!");
			System.out.println();
			AtmApplication.main(null);  
		}
		else
		{
			System.out.println("Enter valid input");
			System.out.println();
			tocontinue();  
		}
	}
	
	

}