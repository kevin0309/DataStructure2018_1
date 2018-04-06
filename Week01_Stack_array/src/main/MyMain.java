package main;

import vo.Stack;

public class MyMain {

	public static void main(String[] args) {
		Stack stack = new Stack();

		for (int i = 0; i < 200; i++) {
			stack.push("dummy"+i);
			System.out.println("push dummy"+i);
		}

		System.out.println(stack.size());
		
		for (int i = 0; i < 200; i++) {
			System.out.println("pop : "+stack.pop());
		}
	}
}
