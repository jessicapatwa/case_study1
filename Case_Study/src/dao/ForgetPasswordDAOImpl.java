package dao;

import pojo.User;

public class ForgetPasswordDAOImpl implements ForgetPasswordDAO{
	
	boolean status;

	@Override
	public boolean checkID(User ref) {
		

		
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
	public boolean checkSecurity(User ref) {
	
	
		
		if(ref.getSecurityColor().equals("black"))
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
	public boolean checkPassword(User ref) {
	
		
		
		if(ref.getUserPassword().equals(ref.getRetypePassword()))
		{
			status = true;
		}
		else
			
		{
			status = false;
		}
		
		return status;
	}

	

	

}