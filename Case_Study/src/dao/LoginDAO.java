package dao;


import pojo.User;

public interface LoginDAO {
	boolean loginValidate(User ref);
}