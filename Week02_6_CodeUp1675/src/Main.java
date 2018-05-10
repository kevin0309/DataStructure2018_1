import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		String encodedStr = scan.nextLine();
		String res = "";
		for (int i = 0; i < encodedStr.length(); i++) {
			char temp = encodedStr.charAt(i);
			if (Character.isLetter(temp)) {
				temp = (char)(temp-3);
				if ((int)temp < 97)
					temp = (char)(temp+26);
			}
			res += temp;
		}
		//qhyhu wuxvw euxwxv 97 122
		//암호 - A B C D E F G H I J K L M N O P Q R S T U V W X Y Z
		//평문 - X Y Z A B C D E F G H I J K L M N O P Q R S T U V W 
		System.out.println(res);
	}

}
