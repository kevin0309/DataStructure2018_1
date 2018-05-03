
public class Fibonacci {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		for (int i = 0; i < 30; i++)
			System.out.println(i+" : "+Fibonacci.process(i)+" ");
	}

	
	public static int process(int index) {
		if (index == 0 || index == 1)
			return index;
		else
			return process(index-1) + process(index-2);
	}
}
