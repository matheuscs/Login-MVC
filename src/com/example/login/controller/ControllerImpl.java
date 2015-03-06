package com.example.login.controller;

import com.example.login.model.LoginInterface;
import com.example.login.view.ViewInterface;

public class ControllerImpl implements ControllerInterface {
	private ViewInterface view;
	private LoginInterface model;
	
	public ControllerImpl(ViewInterface view, LoginInterface model) {
		super();
		this.view = view;
		this.model = model;
		view.setController(this);
		view.start();
	}

	@Override
	public void login() {
		view.readCredentials();
		if(model.isValidUser(view.getUser())) {
			view.welcome("Welcome, " + view.getUser().getUser());
		}
		else {
			view.kickOff("Wrong user or password");
		}
	}
}
