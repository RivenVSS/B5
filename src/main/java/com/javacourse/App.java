package com.javacourse;

import com.javacourse.stack.LinkedStack;

public class App {
	public static void main(String[] args) {
		LinkedStack<Integer> stack = new LinkedStack<Integer>();
		stack.push(1);
		stack.push(2);
		stack.push(3);
		stack.push(10);
		stack.push(0);
		stack.push(2);
		stack.push(null);
		stack.push(null);
		stack.push(null);
		stack.push(0);
		System.out.println("Test pop: " + stack.pop());
		System.out.println("Test peek: " + stack.peek());
		System.out.println("Max: " + stack.max());
		System.out.println("Min: " + stack.min());
	}
}
