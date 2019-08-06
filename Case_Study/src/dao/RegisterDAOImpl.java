package dao;

import pojo.User;

public class RegisterDAOImpl implements RegisterDAO {
	boolean status;
	@Override

	public boolean verifyEmail(User ref) {
		
		
		
		if(ref.getUserEmail().equals("opt@gmail.com"))
		{
			status = true;
		}
		
		 else
		 { 
			 status = false; 
		 }
	
		return status;

	}

	@Override
	public boolean verifyPassword(User ref) {
		
		if(ref.getUserPassword().equals(ref.getRetypePassword()))
		{
			status = true;
		}
		else
		{
			status =false;
		}
		
		return status;
	
	}
}