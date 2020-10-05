/**
 * 
 */
package com.java.simple;

import java.util.Scanner;

/**
 * @author aruna
 *
 */
public class EvenOrOdd {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		int num = new Scanner(System.in).nextInt();
		System.out.println("Enter the integer to check even or odd "+num);
		if(num%2==0) {
			System.out.println(num+ "is an even");
		}else {
			System.out.println(num+ "is an odd");
		}
	}

}
