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

		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the integer to check even or odd ");
		int num = scan.nextInt();
		if(num%2==0) {
			System.out.println(num+ " is an even");
		}else {
			System.out.println(num+ " is an odd");
		}
	}

}
