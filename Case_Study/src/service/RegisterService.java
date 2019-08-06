package service;

import pojo.User;

public interface RegisterService {

	void checkPassword(User refUser);

	void checkEmail(User refUser);

	void SecurityKey(User refUser);

	
	

}