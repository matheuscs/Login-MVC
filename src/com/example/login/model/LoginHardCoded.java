package com.example.login.model;

import com.example.login.entity.User;

public class LoginHardCoded implements LoginInterface {

	@Override
	public boolean isValidUser(User user) {
		if(user.getUser().equals("user111") && user.getPass().equals("pass111")) {
			return true;
		}
		else if(user.getUser().equals("user222") && user.getPass().equals("pass222")) {
			return true;
		}
		return false;
	}
}
