package dao;

import pojo.User;

public interface RegisterDAO {

	boolean verifyEmail(User ref);
	boolean verifyPassword(User ref);
	
}