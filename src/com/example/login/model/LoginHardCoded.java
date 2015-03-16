package com.example.login.model;

import com.example.login.entity.User;

public class LoginHardCoded implements LoginInterface {

	@Override
	public boolean isValidUser(User user) {
		if(user.getUser().equals("user11") && user.getPass().equals("pass11")) {
			return true;
		}
		else if(user.getUser().equals("user22") && user.getPass().equals("pass22")) {
			return true;
		}
		else if(user.getUser().equals("user33") && user.getPass().equals("pass33")) {
			return true;
		}
		return false;
	}
}
