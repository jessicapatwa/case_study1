package service;
import controller.ForgetPasswordController;
import dao.ForgetPasswordDAO;
import dao.ForgetPasswordDAOImpl;
import pojo.User;


public class ForgetPasswordServiceImpl implements ForgetPasswordService {
	
	

		ForgetPasswordDAO refForgetPasswordDAO = new ForgetPasswordDAOImpl(); 
		ForgetPasswordController refForgetPasswordController = new ForgetPasswordController(); 
		User refUser = new User();  
		
		@Override
		public void verifyID(User ref) {
			
			
			
			if(refForgetPasswordDAO.checkID(ref)==true)
			{
			
				refForgetPasswordController.userInputSecurity();
			}
			else
			{
				System.out.println("Invalid userID !!");
				System.out.println();
				refForgetPasswordController.userForgetPasswordController();
			}
		}

		@Override
		public void verifySecurity(User ref) {
		
			
			
			if(refForgetPasswordDAO.checkSecurity(ref)==true)
			{
				refForgetPasswordController.userSetNewPassword();
			}
			else
			{
				System.out.println("Incorrect Security key");
				System.out.println();
				refForgetPasswordController.userInputSecurity(); 
			}
			
			
		}

		@Override
		public void verifyPassword(User ref) {
			// TODO Auto-generated method stub
			
			
			if(refForgetPasswordDAO.checkPassword(ref)==true)
			{
				
				refForgetPasswordController.userInputSecurityKey();
			}
			else
			{
				System.out.println("Password does not match!!");
				System.out.println();
				refForgetPasswordController.userRetypePassword(); 
			}
			
		}
		

	}

	