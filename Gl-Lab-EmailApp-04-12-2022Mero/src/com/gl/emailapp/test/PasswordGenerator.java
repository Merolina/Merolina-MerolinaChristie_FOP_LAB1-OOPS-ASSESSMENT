package com.gl.emailapp.test;

import java.util.Random;

public class PasswordGenerator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int length = 8;
		String pass = password(length);
		System.out.println(pass);
	}

	static String password(int length) {
		System.out.println("Generating password using random() : ");
		System.out.print("Your new password is : ");
		String capChars = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
		String smallChars = "abcdefghijklmnopqrstuvwxyz";
		String numbers = "0123456789";
		String symbols = "!@#$%^&*()<>:[]+-_=";
		String values = capChars + smallChars + numbers + symbols;
		
		Random random = new Random();
		char[] password = new char[8];
		for (int i = 0; i < length; i++) {
			int randomNumber = random.nextInt(values.length());
			password[i] = values.charAt(randomNumber);
		}
		return new String(password);
	}

}
