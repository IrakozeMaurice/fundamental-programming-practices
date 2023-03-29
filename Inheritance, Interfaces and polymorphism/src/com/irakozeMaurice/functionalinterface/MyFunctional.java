package com.irakozeMaurice.functionalinterface;

// Functional interfaces contain just one method 
// They behave like a function hence the name functional interface

@FunctionalInterface
public interface MyFunctional {
	void myMethod(String t);
	
	//if uncommented, there will be a compiler error
	//int anotherMethod(int x);
}
