package main;

import vo.Queue;

public class MyMain {

	public static void main(String[] args) {
		Queue queue = new Queue();

		for (int i = 0; i < 200; i++) {
			queue.put("dummy"+i);
			System.out.println("push dummy"+i);
		}

		System.out.println(queue.size());
		
		for (int i = 0; i < 200; i++) {
			System.out.println("pop : "+queue.get());
		}
	}
}
