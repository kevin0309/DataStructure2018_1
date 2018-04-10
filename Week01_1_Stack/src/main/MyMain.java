package main;

import vo.Stack;

public class MyMain {

	public static void main(String[] args) {
		Stack stack = new Stack();

		String dummy1 = "dummy1";
		String dummy2 = "dummy2";
		String dummy3 = "dummy3";
		String dummy4 = "dummy4";
		String dummy5 = "dummy5";
		String dummy6 = "dummy6";
		String dummy7 = "dummy7";
		String dummy8 = "dummy8";
		String dummy9 = "dummy9";

		stack.push(dummy1);
		stack.push(dummy3);
		stack.push(dummy5);
		stack.push(dummy7);
		stack.push(dummy9);
		stack.push(dummy2);
		stack.push(dummy4);
		stack.push(dummy6);
		stack.push(dummy8);

		System.out.println(stack.size());
		System.out.println(stack.pop());
		System.out.println(stack.pop());
		System.out.println(stack.pop());
		System.out.println(stack.pop());
		System.out.println(stack.pop());
		System.out.println(stack.pop());
		System.out.println(stack.pop());
		System.out.println(stack.pop());
		System.out.println(stack.pop());
	}
}
