package service;
import pojo.User;
public interface ForgetPasswordService {

		public void verifyID(User ref);  

		public void verifySecurity(User ref); 

		public void verifyPassword(User ref); 

	 
		
	}
