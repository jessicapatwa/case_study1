package service;

import AtmApplication.AtmApplication;
import controller.RegisterController;
import dao.RegisterDAO;
import dao.RegisterDAOImpl;
import pojo.User;

public class RegServiceImpl implements RegisterService {

	static RegisterController refRegisterController = new RegisterController();
	static RegisterDAO refRegisterDAO = new RegisterDAOImpl();
	static User refUser = new User();
	@Override
	public void checkPassword(User ref) {
		
	   if(refRegisterDAO.verifyPassword(ref) == true) {
		   refRegisterController.userInputSecurityColor();
	   }else {
		   System.out.println("Password doesnt match");
		   System.out.println();
			refRegisterController.userInputReTypePassword();
	   }
		
	}//end of check password

	@Override
	public void checkEmail(User ref) {
		if(refRegisterDAO.verifyEmail(ref) == true) {
			refRegisterController.userInputPassword();
		}else {
			System.out.println("Email exists already!!");
		    System.out.println();
		 refRegisterController.userInputEmail();
		}
		
	}// end of checkEmail
	
@Override
public void SecurityKey(User ref) {
	System.out.println(ref.getSecurityColor()+ " " + "is your security key, if you forget your password" );
	
    System.out.println();
		
	    System.out.println("Registration Successful!");
		System.out.println();
	    AtmApplication.main(null);
}// end of SecurityKey
} 