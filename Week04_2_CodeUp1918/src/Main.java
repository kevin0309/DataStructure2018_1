import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		
		콜라츠(n);
	}
	
	private static int 콜라츠(int n) {
		System.out.println(n);
		if (n == 1)
			return n;
		else if (n%2 == 0)
			return 콜라츠(n/2);
		else
			return 콜라츠(3*n+1);
		
	}
}
