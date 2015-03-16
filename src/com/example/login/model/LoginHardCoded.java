package com.example.login.model;

import com.example.login.entity.User;

public class LoginHardCoded implements LoginInterface {

	@Override
	public boolean isValidUser(User user) {
		if(user.getUser().equals("user1") && user.getPass().equals("pass1")) {
			return true;
		}
		else if(user.getUser().equals("user2") && user.getPass().equals("pass2")) {
			return true;
		}
		else if(user.getUser().equals("user3") && user.getPass().equals("pass3")) {
			return true;
		}
		return false;
	}
}
