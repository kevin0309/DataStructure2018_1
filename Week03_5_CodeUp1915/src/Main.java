import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		//int n = scan.nextInt();
		System.out.println(fibonacci(50));
	}
	
	private static int fibonacci(int index) {
		if (index == 0 || index == 1)
			return index;
		else
			return fibonacci(index-1) + fibonacci(index-2);
	}
}
