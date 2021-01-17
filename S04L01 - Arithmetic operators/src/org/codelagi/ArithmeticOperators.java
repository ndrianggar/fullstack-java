package org.codelagi;

public class ArithmeticOperators {

	public static void main(String[] args) {
		
		int x = 9;
		int l = 8;
		System.out.println(x++); //x++ is called post increment / Increment operators can be prefix
		System.out.println(x);
		System.out.println(++x +" disebabkan nilai 10 + 1 pada proses prefix increment"); // ++x is called pre increment // Increment operators can be postfix
		System.out.println(l--); //x-- is called post decrement / Decrement operators can be prefix
		System.out.println(l);
		System.out.println(--l +" disebabkan nilai 7 - 1 pada proses prefix decrement"); //--x is called pre decrement / Decrement operators can be postfix

	}

}
