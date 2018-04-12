package main;

import java.util.Date;

import vo.Stack;
import vo.Stack_Array;
import vo.Stack_First;
import vo.Stack_Node;

public class MyMain {
	
	private static int processCnt = 200000;

	public static void main(String[] args) {
		Stack firstStack = new Stack_First();
		Stack arrayStack = new Stack_Array();
		Stack nodeStack = new Stack_Node();

		System.out.println(process(firstStack));
		System.out.println(process(arrayStack));
		System.out.println(process(nodeStack));
		/*
		 * 200000회 시행했을떄 시간
		 * 28424
		 * 297
		 * 23
		 */
	}
	
	private static long process(Stack stack) {
		Date start = new Date();
		
		for (int i = 0; i < processCnt; i++)
			stack.push("dummy"+i);

		for (int i = 0; i < processCnt; i++)
			stack.pop();
			
		Date end = new Date();
		
		return end.getTime() - start.getTime();
	}
}
