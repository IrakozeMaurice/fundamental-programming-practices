package com.irakozeMaurice.inherit;

//access of variables does not use dynamic binding.

public class Sub extends Sup{
	int x = 2;
	
	public static void main(String[] args) {
		Sup s = new Sub();
//		int z = s.x; //doesn't compile

	}
}
