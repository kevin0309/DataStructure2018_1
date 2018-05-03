import java.util.Date;
import java.util.Scanner;
import java.util.StringTokenizer;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Date start = new Date();
		/*Scanner scan = new Scanner(System.in);
		int numberOfTower = scan.nextInt();
		Scanner scan2 = new Scanner(System.in);
		String towerHeightListPlainStr = scan2.nextLine().trim();*/
		String towerHeightListPlainStr = "1 2 5 7 4 4 1 2 5 12 12 12 13";
		//String towerHeightListPlainStr = Dummy.data;
		
		/*StringTokenizer st = new StringTokenizer(towerHeightListPlainStr, " ");
		int len = st.countTokens();
		System.out.println("len : " + len);
		int[] towerHeightList = new int[len];
		for (int i = 0; i < len; i++)
			towerHeightList[i] = Integer.parseInt(st.nextToken());

		String result = "0 ";
		int max = towerHeightList[0];
		int maxIndex = 0;
		for (int i = 1; i < len; i++) {
			if (max == towerHeightList[i]) {
				result += "0 ";
				max = towerHeightList[i];
				maxIndex = i+1;
			}
			else if (max <= towerHeightList[i]) {
				result += maxIndex+" ";
				max = towerHeightList[i];
				maxIndex = i+1;
			}
			else if (towerHeightList[i] <= towerHeightList[i-1]) {
				max = towerHeightList[i-1];
				maxIndex = i;
				result += maxIndex+" ";
			}
			else {
				result += maxIndex+" ";
			}
		}
		
		System.out.println(result);*/
		
		//-----------------------------------------------------------------------------------------------------//
		
		String[] st = towerHeightListPlainStr.split(" "); 
		int[] towerHeightList = new int[st.length];
		towerHeightList[0] = Integer.parseInt(st[0]);
		String result = "";
		for (int i = 1; i < st.length; i++) {
			towerHeightList[i] = Integer.parseInt(st[i]);
			for (int j = i-1; j > -1; j--) {
				if (towerHeightList[i] <= towerHeightList[j]) {
					result += j+1+" ";
					break;
				}
				if (j == 0)
					result += "0 ";
			}
		}
		//0 0 0 4 5 6 6 4 0 10 11 0 
		System.out.println(result);
		
		
		Date end = new Date();
		
		System.out.println("수행에 걸린 시간 : " + (end.getTime() - start.getTime()));
	}

}
