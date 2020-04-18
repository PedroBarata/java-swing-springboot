package com.example.springbootswing.demo.view;

import javax.swing.JFrame;

public class LoginView extends JFrame {

	/**
	 * 
	 */
	private static final long serialVersionUID = 2223523779326063948L;

	/**
	 * Create the application.
	 */
	public LoginView() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		setBounds(100, 100, 450, 300);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}

}
