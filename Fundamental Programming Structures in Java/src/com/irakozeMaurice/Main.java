package com.irakozeMaurice;

import java.util.Arrays;
import java.util.Scanner;

/*
 * Main class to test the results
 * 
 * */
public class Main {

	public static void main(String[] args) {

		/*
		 * 1.DATA TYPES
		 * ---------- 
		 * */
		
		// Primitive data types ( int, short, long, byte, float, double, char, boolean )
		
		// storage requirements
		
		// byte - 1 byte
		// short - 2 bytes
		// int - 4 bytes
		// long - 8 bytes
		// float - 4 bytes
		// double - 8 bytes
		
		float x = 2.3456F;
		float y = 5.4193F;
		double x1 = 2.3456;
		double y1 = 5.4193;
		
		// the result will not be the same for type float and double
		System.out.println("Float result: " + x * y);
		System.out.println("Double result: " + x1 * y1);
		
		// it is never safe to test whether two floating point numbers are equal
		System.out.println(2 + 3 == 5);
		double a = 0.7;
		double b = 0.9;
		double c = a + 0.1;
		double d = b - 0.1;
		System.out.println(c == d);		
		
		// The char type
		char ch = 'A';
		System.out.println(ch);
		// Escape characters
		// \b –backspace
		// \t –tab
		// \n –newline
		// \" –double quote
		// \' –single quote
		// \\-backslash
		char doublequote = '\"';
		System.out.println(doublequote);
		char backslash = '\\';
		System.out.println(backslash);
		
		// Variables
		
		// Variables in Java are declared and initialized to
		// provide room in RAM for the data that is to be stored.
		// must have a data type
		
		int sum;
		sum = 0;
		// or
		int sum2 = 30;
		
		// Reading console input (using the Scanner class of java)
		
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter your name:");
		System.out.println("Your name: " + sc.nextLine());
		System.out.print("Enter your age:");
		System.out.println("Your age: " + sc.nextInt());
		// close the Scanner object
		sc.close();
		
		// Conversions between numeric types
		
		System.out.println("\t\tConversions between numeric types");
		System.out.println("\t\t---------------------------------");
		System.out.println(" \t\t\t char");
		System.out.println(" \t\t\t   |");
		System.out.println(" \t\t\t   |");
		System.out.println(" \t\t\t   v");
		System.out.print(" byte ----> short ----->");
		System.out.println("  int -------> long,double");
		System.out.println(" \t\t\t   |\t\t|");
		System.out.println(" \t\t\t   |\t\t|");
		System.out.println(" \t\t\t   v\t\tv");
		System.out.println(" \t\t\t float ----> double");
		
		
		// conversion from a bigger type to a smaller type can be forced by CASTING
		
		double doubleValue = 12.4;
		int intValue = (int) doubleValue;	// intValue equals 12
		System.out.println(intValue);

		
		// Operators in java
		
		// standard binary operators ( '+', '-' , '*' , '/' , '%',)
		
		// increment/decrement operators
		int k = 1;
		k++; //new value of k is 2 (postfix form)
		++k; //new value of k is 3 (prefix form)
		
		// relational and boolean operators
		// Relational:== (equals), != (not equals), < (less than), <= (less than or equal to),
		// > (greater than), >= (greater than or equal to)
		// Logical: && (logical and), || (logical or)
		
		// Ternary: condition ?expression1 :expression2
		// evaluates to expression1 if condition is true, expression2 otherwise
		
		
		// Mathematical Constants And Functions
		
		double pi = Math.PI;			// (the number pi –approximately 3.14159)
		//Math.pow(a,x)	// (the number a raised to the power x)
		//Math.sqrt(x) 	// (the square root of x)
		

		// Java Strings
		
		String name = "Robert";
		System.out.println(name);
		
		// String methods
		name.charAt(0);									// returns character at index specified - i.e 'R'
		name.length();									// return the length of this string - i.e 6
		String nickname = name.substring(0,3);			//"Rob"
		String whole = name.substring(0,name.length()); //"Robert"
		String first = name.substring(0,1); 			//"R"
		String empty = name.substring(0,0); 			// ""
		
		
		// Conditional Logic
		
		//if(condition) {
			// statement1;
			// statement2;
			// …
		//}
		
		int marks = 40;
		String result;
		if(marks >= 50) {
			result = "PASS";
		}
		
		// if ... else
		// if(condition) statement1
		// else statement2
		
		if(marks >= 50) {
			result = "PASS";
		}else {
			result = "FAIL";
		}
		
		// repeated “else if”
		
		if(marks >= 90) {
			result = "EXCELLENT";
		}else if(marks >= 50 && marks < 90) {
			result = "PASS";
		}else {
			result = "FAIL";
		}
		
		// Control flow: While loops
		int count = 1;
		while(count <= 10) {
			System.out.println("counting: " + count);
			count++;
		}
		
		// control flow: do while loops
		Scanner sc1 = new Scanner(System.in);
		int value;
		do {
			System.out.println("Enter a positive integer number:");
			value = sc1.nextInt();
		} while(value <= 0);
		sc1.close();
		
		// break statement
		
		int countToFive = 1;
		while(true) {
			System.out.println("counting to five: " + countToFive);
			countToFive++;
			if(countToFive > 5) {
				break;
			}
		}
		
		
		// Control Flow: for Loops
		
		// for(initialization; condition; increment) {
				// statements
		// }
		
		// for( ; ; ) statement
		// means the same as
		// while(true)statement
		
		for (int i = 1; i <= 5; i++) {
			System.out.println("counting to five:" + i);
		}
		
		/*
		 * Ask the user to type in his/her name
		 *  and then output the number of occurrences of the letter 'e' 
		 *  that you find in this name.
		 *  
		 * */
		
		Scanner sc11 = new Scanner(System.in);
		System.out.println("Enter your name:");
		String yourName = sc11.nextLine();
		int counter = 0;
		for (int i = 0; i < yourName.length(); i++) {
			if(yourName.charAt(i) == 'e') {
				counter++;
			}
		}
		sc11.close();
		System.out.println("number of occurences of 'e' in your name is: " + counter);
		
		// Nested for loops
		for (int i = 0; i < 5; i++) {
			for (int j = 0; j <= i; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
		
		// Switch statement
		
		Scanner scanner = new Scanner(System.in);
		int dayOfWeek = scanner.nextInt();
		switch (dayOfWeek) {
		case 1:
			System.out.println("MONDAY");
			break;
		case 2:
			System.out.println("TUESDAY");
			break;
		case 3:
			System.out.println("WEDNESDAY");
			break;
		case 4:
			System.out.println("THURSDAY");
			break;
		case 5:
			System.out.println("FRIDAY");
			break;
		case 6:
			System.out.println("SATURDAY");
			break;
		case 7:
			System.out.println("SUNDAY");
			break;

		default:
			System.out.println("INVALID DAY OF WEEK");
			break;
		}
		scanner.close();
		
		
		// Arrays
		
		// declaration
		int[] arr;
		
		// initialization
		int[] scores = new int[5];
		
		// setting values
		scores[0] = 30;
		
		// retrieving values
		int firstScore = scores[0];
		
		// length of array
		int len = scores.length;	// len is 5
		
		// The for eachLoop
		// for(variable: collection) statement
		
		int[] elements = {4, 5, 12, 25};	// another way of array initialization
		for(int element : elements) {
			System.out.println(element);
		}
		
		// Array Copying and Sorting
		
		// Arrays.copyOf(arr, newLength) // returns new array containing copies of the elements of arr
		// Arrays.sort(arr)				 // sorts elements of arr
		
		int[] smallPrimes= { 7, 11, 5, 2, 3};
		int[] smallPrimesCopy= Arrays.copyOf(smallPrimes, smallPrimes.length);
		
		for (int val : smallPrimesCopy) {
			System.out.print(val + " ");
		}
		System.out.println();
		
		int[] firstThree= Arrays.copyOf(smallPrimes, 3);
		
		for (int val : firstThree) {
			System.out.print(val + " ");
		}
		System.out.println();
		
		//sorting
		Arrays.sort(smallPrimes);
		for (int val : smallPrimes) {
			System.out.print(val + " ");
		}
		System.out.println();
		
		
		// Sorting Strings
		
		String[] names = {"Justice","Jonathan","Jasmine","Jeremy"};
		Arrays.sort(names);		// sorts the array in place
		System.out.println(Arrays.toString(names));
		
		// Efficient way of using strings in java
		
		// Inefficient
        String info = "";
         
        info += "My name is Bob.";
        info += " ";
        info += "I am a builder.";
         
        System.out.println(info);
         
        // More efficient.
        StringBuilder sb = new StringBuilder("");
         
        sb.append("My name is Sue.");
        sb.append(" ");
        sb.append("I am a lion tamer.");
         
        System.out.println(sb.toString());
         
        // The same as above, but nicer ....
         
        StringBuilder s = new StringBuilder();
         
        s.append("My name is Roger.")
        .append(" ")
        .append("I am a skydiver.");
         
        System.out.println(s.toString());
		
		
        // Multidimensional Arrays
        
        // 2D arrays
        
        // declaration
        int[][] twoD;
        
        // initialization
        int[][] twoDspecified= new int[3][5];			// 3 int[] arrays each with 5 elements
        int[][] arr1= new int[3][]; 						// 3 int[] arrays each of unspecified length
		
        //ragged array
        arr1[0] = new int[2];
        arr1[1] = new int[3];
        arr1[2] = new int[5];

        String[][] teams = {
        		
			{"Joe", "Bob", "Frank", "Steve"},
			{"Jon", "Tom", "David", "Ralph"},
			{"Tim", "Bev", "Susan", "Dennis"}
			
        };
		
	    // specifies a 3 x 4 array
		// teams.length is 3
		// teams[i].length is 4 (whenever 0<= i <= 2)
		// teams[1][2] has value "David" (row 1, //column 2, start counting from 0)
        
        // traversing 2D array
        for (int i = 0; i < teams.length; i++) {
			for (int j = 0; j < teams[i].length; j++) {
				System.out.print(teams[i][j] + " ");
			}
			System.out.println();
		}
        
	}
	
}
