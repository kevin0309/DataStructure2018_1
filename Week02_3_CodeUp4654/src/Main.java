import java.util.Arrays;
import java.util.NoSuchElementException;
import java.util.Scanner;
import java.util.StringTokenizer;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		int numberOfTower = scan.nextInt();
		Scanner scan2 = new Scanner(System.in);
		String towerHeightListPlainStr = scan2.nextLine().trim();
		/*int numberOfTower = 5;
		String towerHeightListPlainStr = "6 9 5 7 4";*/
		
		StringTokenizer towerHeightListStr = new StringTokenizer(towerHeightListPlainStr," ");
		long[] towerHeightList = new long[numberOfTower];
		for (int i = 0; i < numberOfTower; i++) {
			try {
				int newint = Integer.parseInt(towerHeightListStr.nextToken());
				towerHeightList[i] = newint;
			} catch (Exception e) {
				throw new RuntimeException("i : "+i+", length : "+towerHeightListStr.countTokens());
			}
		}
		
		int[] result = new int[numberOfTower];
		for (int i = 1; i < numberOfTower; i++) {
			for (int j = i-1; j > -1; j--) {
				if (towerHeightList[i] <= towerHeightList[j]) {
					result[i] = j+1;
					break;
				}
			}
		}
		
		for (int res : result) {
			System.out.print(res+" ");
		}
	}

}
