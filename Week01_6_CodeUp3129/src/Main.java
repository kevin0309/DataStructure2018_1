import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		String question = scan.nextLine();
		
		boolean det = true;
		int openCnt = 0;
		for (int i = 0; i < question.length(); i++)
			if (question.charAt(i) == '(')
				openCnt++;
			else
				if (openCnt != 0)
					openCnt--;
				else {
					det = false;
					break;
				}
		
		if (det && openCnt == 0)
			System.out.println("good");
		else
			System.out.println("bad");
	}

}