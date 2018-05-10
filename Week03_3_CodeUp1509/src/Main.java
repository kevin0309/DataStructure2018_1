import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		int[][] field = new int[10][10];
		for (int i = 0; i < 10; i++) {
			String[] tempStrArr = scan.nextLine().split(" ");
			for (int j = 0; j < 10; j++)
				field[i][j] = Integer.parseInt(tempStrArr[j]);
		}
		String[] unitStrArr = scan.nextLine().split(" ");
		int[] units = new int[10];
		String[] unitStatus = new String[10];
		for (int i = 0; i < 10; i++)
			units[i] = Integer.parseInt(unitStrArr[i]);
		
		for (int i = 0; i < 10; i++) {
			if (units[i] == 1) {
				unitStatus[i] = i+1+" safe";
				for (int j = 9; j > -1; j--) {
					if (field[j][i] > 0) {
						unitStatus[i] = i+1+" crash";
						break;
					}
					else if (field[j][i] < 0) {
						unitStatus[i] = i+1+" fall";
						break;
					}
				}
				System.out.println(unitStatus[i]);
			}
		}
	}
	/*
	0 0 0 0 0 0 0 0 0 0 
	0 2 0 0 0 0 0 0 0 0 
	0 0 -1 0 0 0 0 0 2 0 
	0 0 0 0 0 0 0 6 0 0 
	0 0 0 0 0 0 0 0 0 0 
	0 0 0 0 0 -4 2 0 0 0 
	0 0 2 0 0 0 0 0 0 0 
	0 0 0 0 3 0 0 0 0 0 
	0 0 0 0 0 0 0 0 0 0 
	0 0 0 0 0 0 0 0 0 0 
	1 1 0 0 1 1 0 1 0 1 
	*/
}
