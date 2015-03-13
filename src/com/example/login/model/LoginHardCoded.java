package com.example.login.model;

import com.example.login.entity.User;

public class LoginHardCoded implements LoginInterface {

	@Override
	public boolean isValidUser(User user) {
		if(user.getUser().equals("teste") && user.getPass().equals("pass123")) {
			return true;
		}
		return false;
	}
}
