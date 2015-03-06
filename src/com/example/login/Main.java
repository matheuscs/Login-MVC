package com.example.login;

import com.example.login.controller.ControllerImpl;
import com.example.login.model.LoginHardCoded;
import com.example.login.model.LoginAlwaysValid;
import com.example.login.model.LoginInterface;
import com.example.login.view.ViewConsole;
import com.example.login.view.ViewInterface;
import com.example.login.view.ViewSwing;

@SuppressWarnings("unused")
public class Main {
	public static void main(String[] args) {
		ViewInterface view = new ViewConsole();
		//ViewInterface view = new ViewSwing();
		LoginInterface model = new LoginHardCoded();
		//LoginInterface model = new LoginAlwaysValid();
		new ControllerImpl(view, model);
	}
}
