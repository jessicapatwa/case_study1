package dao;

import pojo.User;

public interface ForgetPasswordDAO {
	
	boolean checkID(User ref);  
	boolean checkSecurity(User ref); 
	boolean checkPassword(User ref);  
}