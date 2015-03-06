package com.example.login.view;

import java.util.Scanner;

import com.example.login.controller.ControllerInterface;
import com.example.login.entity.User;

public class ViewConsole implements ViewInterface {
	private ControllerInterface controller;
	private User user;
	
	@Override
	public void setController(ControllerInterface controller) {
		this.controller = controller;
	}

	@Override
	public void start() {
		System.out.println("Hello. Please log in.");
		controller.login();
	}

	@Override
	public void readCredentials() {
		Scanner sc = new Scanner(System.in);
		String user = null, pass = null;
		while(user == null) {
			System.out.println("User: ");
			user = sc.nextLine();
		}
		while(pass == null) {
			System.out.println("Pass: ");
			pass = sc.nextLine();
		}
		sc.close();
		this.user = new User(user, pass);
	}

	@Override
	public User getUser() {
		return user;
	}

	@Override
	public void welcome(String msg) {
		System.out.println(msg + "!");
	}

	@Override
	public void kickOff(String msg) {
		System.out.println("ERROR!\n" + msg);
	}
}
