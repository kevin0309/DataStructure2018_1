/**
 * 1509, 1912, 1915 풀어오기
 * @author LG
 *
 */
public class MyMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		recursiveProcess(200);
	}

	/**
	 * 입력받은 값까지 순차적으로 출력
	 * @param index
	 * @param temp
	 */
	private static void recursiveProcess(int index) {
		if (index  > 1)
			recursiveProcess(index-1);
		System.out.println(index);
	}
}
