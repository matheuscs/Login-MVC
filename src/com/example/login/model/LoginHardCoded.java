package com.example.login.model;

import com.example.login.entity.User;

public class LoginHardCoded implements LoginInterface {

	@Override
	public boolean isValidUser(User user) {
		if(user.getUser().equals("us1") && user.getPass().equals("p1")) {
			return true;
		}
		else if(user.getUser().equals("us2") && user.getPass().equals("p2")) {
			return true;
		}
		return false;
	}
}
