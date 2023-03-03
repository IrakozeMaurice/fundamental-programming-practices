package com.irakozeMaurice;

import javax.swing.JOptionPane;

/*
 * Main class to start the application
 * 
 * */
public class App {

	public static void main(String[] args) {

		hello();
		
	}

	// displays Hello world in a dialog box
	public static String hello() {
		
		JOptionPane.showMessageDialog(null,"Hello world!");

		return "ok";
	}
	
	// calculates the sum of elements of an array
	public static int calculateSum(int[] arr) {
		int sum = 0;
		for (int i = 0; i < arr.length; i++) {
			sum += arr[i];
		}
		return sum;
	}
}
