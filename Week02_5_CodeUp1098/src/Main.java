import java.util.Scanner;

class Stick {
	private int length;
	private boolean isVertical;
	private int x;
	private int y;
	
	public Stick(int length, boolean isVertical, int x, int y) {
		super();
		this.length = length;
		this.isVertical = isVertical;
		this.x = x-1;
		this.y = y-1;
	}

	public int getLength() {
		return length;
	}

	public boolean isVertical() {
		return isVertical;
	}

	public int getX() {
		return x;
	}

	public int getY() {
		return y;
	}
}

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		String boardSizeStr = scan.nextLine();
		String[] tempStrArr = boardSizeStr.split(" ");
		int boardHeight = Integer.parseInt(tempStrArr[0]);
		int boardWidth = Integer.parseInt(tempStrArr[1]);
		int[][] board = new int[boardHeight][boardWidth];
		
		int stickCnt = scan.nextInt();
		scan.skip("[\\r\\n]+");
		Stick[] sticks = new Stick[stickCnt];
		
		for (int i = 0; i < stickCnt; i++) {
			String tempStr = scan.nextLine();
			String[] tempStrArr2 = tempStr.split(" ");
			sticks[i] = new Stick(Integer.parseInt(tempStrArr2[0]), tempStrArr2[1].equals("1")?true:false, Integer.parseInt(tempStrArr2[3]), Integer.parseInt(tempStrArr2[2]));
			Stick stick = sticks[i];
			for (int j = 0; j < stick.getLength(); j++) {
				if (stick.isVertical())
					board[stick.getY()+j][stick.getX()] = 1;
				else
					board[stick.getY()][stick.getX()+j] = 1;
			}
		}
		
		for (int i = 0; i < board.length; i++) {
			for (int j = 0; j < board[i].length; j++) {
				System.out.print(board[i][j]+" ");
			}
			System.out.println();
		}
		/*
		 * 	5 5
			3
			2 0 1 1
			3 1 2 3
			4 1 2 5
			
			1 1 0 0 0 
			0 0 1 0 1 
			0 0 1 0 1 
			0 0 1 0 1 
			0 0 0 0 1
		 */
	}

}
