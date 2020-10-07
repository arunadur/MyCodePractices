package com.java.simple;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class RemoveDupStream {

	public static void main(String[] args) {

		ArrayList<Integer> aList = new ArrayList<Integer>(Arrays.asList(1, 5, 8, 9, 6, 3, 4, 2, 5, 3, 9, 6, 8, 4));
		System.out.println("Arraylist befor removing duplicate list " + aList);
		List<Integer> newList = aList.stream().distinct().collect(Collectors.toList());
		System.out.println("Arraylist after removing duplicate list " + newList);

	}

}
