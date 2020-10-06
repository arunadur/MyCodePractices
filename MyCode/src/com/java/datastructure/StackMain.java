package com.java.datastructure;

public class StackMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		IntStack intStack = new IntStack();
		if(!intStack.isFull()) {
			intStack.push(2);
			intStack.push(4);
			intStack.push(6);
			intStack.push(8);
		}
		System.out.println(intStack.pop());
		System.out.println(intStack.pop());
		System.out.println(intStack.pop());
		System.out.println(intStack.pop());
//		System.out.println(intStack.pop());
	}

}
