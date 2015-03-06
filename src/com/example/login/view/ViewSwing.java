package com.example.login.view;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.JButton;

import com.example.login.controller.ControllerInterface;
import com.example.login.entity.User;

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

import net.miginfocom.swing.MigLayout;

public class ViewSwing extends JFrame implements ViewInterface {

	private static final long serialVersionUID = 1L;
	
	private ControllerInterface controller;
	private User user;
	
	private JPanel contentPane;
	private JTextField txtUser;
	private JTextField txtPass;
		
	public ViewSwing() {
		setResizable(false);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 261, 125);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(new MigLayout("", "[50px,grow 1][177px]", "[20px][20px][23px]"));
		
		JLabel lblNewLabel = new JLabel("User:");
		contentPane.add(lblNewLabel, "cell 0 0,alignx right,aligny center");
		
		txtUser = new JTextField();
		contentPane.add(txtUser, "cell 1 0,growx,aligny top");
		txtUser.setColumns(10);
		
		JLabel lblNewLabel_1 = new JLabel("Password:");
		contentPane.add(lblNewLabel_1, "cell 0 1,alignx left,aligny center");
		
		txtPass = new JTextField();
		contentPane.add(txtPass, "cell 1 1,growx,aligny top");
		txtPass.setColumns(10);
		
		JButton btnNewButton = new JButton("Login");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				controller.login();
			}
		});
		contentPane.add(btnNewButton, "cell 1 2,growx,aligny top");
	}
	
	@Override
	public void setController(ControllerInterface controller) {
		this.controller = controller;
	}
	
	@Override
	public void start() {
		this.setVisible(true);
	}
	
	@Override
	public void readCredentials() {
		user = new User(txtUser.getText(), txtPass.getText());
	}
	
	@Override
	public User getUser() {
		return user;
	}
	
	@Override
	public void welcome(String msg) {
		JOptionPane.showMessageDialog(null, msg, "Welcome", JOptionPane.INFORMATION_MESSAGE);		
	}

	@Override
	public void kickOff(String msg) {
		JOptionPane.showMessageDialog(null, msg, "Error", JOptionPane.ERROR_MESSAGE);		
	}
}
