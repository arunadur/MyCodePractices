package com.java.datastructure;

import java.util.Vector;

public class VectorDemo {

	public static void main(String[] args) {

		Vector<Integer> vector = new Vector<Integer>();
		System.out.println("Capacity of vector initial " + vector.capacity());
		for (int i = 0; i < 10; i++) {
			vector.addElement(i);
		}
		System.out.println("Capacity of vector after for loop " + vector.capacity());
		vector.addElement(28);
		System.out.println("Capacity of vector after adding element " + vector.capacity());
		System.out.println(vector);

	}

}
