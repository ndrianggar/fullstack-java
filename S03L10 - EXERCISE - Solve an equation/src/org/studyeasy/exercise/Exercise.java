package org.studyeasy.exercise;

public class Exercise {

	public static void main(String[] args) {
		// (a+b)square = ((a*a) + 2*(a*b) + b*b);
		

		int a = 25;
		float b = 42.159f;
		double value = (double)(a*a + 2*(a*b) + b*b);
//		int value = int(a*a + 2*(a*b) + b*b);
		System.out.println("Value of the equation is "+ value);
	}

}
