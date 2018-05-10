import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		String input = scan.nextLine();
		//String input = "6 5";
		
		String[] inputNumStr = input.split(" ");
		int height = Integer.parseInt(inputNumStr[0]);
		int width = Integer.parseInt(inputNumStr[1]);
		
		int[][] res = new int[height][width];
		
		int firstH = Math.round(height/2);
		int firstW = Math.round(width/2);
		
		for (int i = 1; i < width*height+1; i++) {
			try {
				res[firstH][firstW] = i;
			} catch (ArrayIndexOutOfBoundsException e) {
				System.out.println(i+" "+firstH+" "+firstW);
				break;
			}
		}
		/*res[firstH][firstW] = 1;
		res[firstH][++firstW] = 2;
		res[--firstH][firstW] = 3;
		res[firstH][--firstW] = 4;
		res[firstH][--firstW] = 5;
		res[++firstH][firstW] = 6;
		res[++firstH][firstW] = 7;
		res[firstH][++firstW] = 8;
		res[firstH][++firstW] = 9;
		res[firstH][++firstW] = 10;
		res[--firstH][firstW] = 11;
		res[--firstH][firstW] = 12;
		res[--firstH][firstW] = 13;*/
		
		for (int i = 0; i < height; i++) {
			for (int j = 0; j < width; j++) {
				System.out.printf("%3d ", res[i][j]);
			}
			System.out.println();
		}
	}

}
