/**
 * 
 */
package com.java.simple;

/**
 * @author aruna
 *
 */
public class PassByReferenceEx {

	/**
	 * @param args
	 */
	int eyes;
	protected String s1="HumanBeing";
	public static void main(String[] args) {

		PassByReferenceEx obj = new PassByReferenceEx();
		obj.eyes=2;
		System.out.println(obj.eyes);
		System.out.println("Before passing reference 'eyes' value is "+obj.eyes);
		changeOrigin(obj);
		System.out.println("After changeOrigin method "+obj.eyes);
	}
	public static void changeOrigin(PassByReferenceEx objCopy) {
		System.out.println("Before changing origin.. "+objCopy.eyes);
		objCopy.eyes=3;
		System.out.println("After changing origin.. " +objCopy.eyes);
	}
}
