package com.irakozeMaurice.accesstypegoodsoln;

public class Test {

	public static void main(String[] args) {

		ClosedCurve[] objects = { new Square(3), new Circle(3) };
		// compute areas
		for (ClosedCurve cc : objects) {
			System.out.println("The area of this " + cc.getClass().getSimpleName() + " is " + cc.computeArea());

		}

	}

}