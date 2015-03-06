package com.example.login.model;

import com.example.login.entity.User;

public class LoginAlwaysValid implements LoginInterface {

	@Override
	public boolean isValidUser(User user) {
		return true;
	}
}
