package com.example.login.view;

import com.example.login.controller.ControllerInterface;
import com.example.login.entity.User;

public interface ViewInterface {
	void setController(ControllerInterface controller);
	void start();
	void readCredentials();
	User getUser();
	void welcome(String msg);
	void kickOff(String msg);
}
