/**
 * 
 */
package com.java.simple;

/**
 * @author aruna
 *
 */
public class PassByValueEx {

	/**
	 * @param args
	 */
	int eyes;

	protected String S1 = "HumanBeing";

	public static void main(String[] args) {

		PassByValueEx obj = new PassByValueEx();
		obj.eyes = 2;
		System.out.println(obj.eyes);
		int a = 4;
		System.out.println("Value of a is " + a);
		changeOrigin(a);
		System.out.println("Value of a after changeOrigin method is " + a);
	}

	private static void changeOrigin(int aCopy) {
		// TODO Auto-generated method stub
		System.out.println("Before changing value " + aCopy);
		aCopy = 15;
		System.out.println("copy value changed " + aCopy);
	}

}
