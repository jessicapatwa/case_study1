package dao;

import pojo.User;

public class LoginDAOImpl implements LoginDAO {

	boolean status;
	
	// connect with the DB here....
	
	@Override
	public boolean loginValidate(User ref) {
		
		if (ref.getUserEmail().equals("opt@gmail.com") && ref.getUserPassword().equals("xyz123")) {
			status = true;
		} else {
			status = false;
		}

		return status;
	}

}