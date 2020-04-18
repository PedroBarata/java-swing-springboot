package com.example.springbootswing.demo;

import javax.swing.JFrame;

import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.example.springbootswing.demo.view.LoginView;

@SpringBootApplication
public class DemoApplication extends JFrame {

	private static final long serialVersionUID = 1L;

	/**
	 * Starts the application using LoginView as Initial Frame
	 */
	public static void main(String[] args) {
		new LoginView().setVisible(true);
	}

}
