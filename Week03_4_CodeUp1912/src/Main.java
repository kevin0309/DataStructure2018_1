import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		System.out.println(factorial(n));
	}
	
	private static int factorial(int n) {
		if (n == 1)
			return n;
		return n*factorial(n-1);
	}
}
