import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int numLength = Integer.parseInt(scan.nextLine());
		String num = scan.nextLine();

		Stack stack = new Stack();
		
		for (int i = 0; i < numLength; i++)
			stack.push(num.charAt(i));
		
		int cnt = 0;
		String resStr = "";
		while (!stack.isEmpty()) {
			resStr = stack.pop() + resStr;
			if (cnt%3 == 2 && stack.size() != 0)
				resStr = "," + resStr;
			cnt++;
		}
		System.out.println(resStr);
		
		scan.close();
	}
}

class Stack {

	private Object[] stack;
	private int arrayLengthUnit = 100; //배열 생성단위
	private int top;
	
	public Stack() {
		super();
		this.stack = new Object[arrayLengthUnit];
		this.top = -1;
	}

	public void push(Object newElement) {
		if (top%arrayLengthUnit == arrayLengthUnit-1) {
			Object[] newStack = new Object[top+arrayLengthUnit+1];
			System.arraycopy(stack, 0, newStack, 0, top+1);
			stack = newStack;
			
			stack[++top] = newElement;
		}
		else {
			stack[++top] = newElement;
		}
	}
	
	public Object pop() {
		if (top == -1)
			throw new IndexOutOfBoundsException();
		
		Object result = stack[top--];
		stack[top+1] = null;
		
		if (top%arrayLengthUnit == arrayLengthUnit-1) {
			Object[] newStack = new Object[top+1];
			System.arraycopy(stack, 0, newStack, 0, top+1);
			stack = newStack;
		}
		
		return result;
	}
	
	public Object peek() {
		return stack[top];
	}
	
	public Object[] cloneCurStackArray(boolean fitToSize) {
		if (fitToSize) {
			Object[] newStackArray = new Object[top+1];
			System.arraycopy(stack, 0, newStackArray, 0, top);
			return newStackArray;
		}
		else {
			Object[] newStackArray = new Object[stack.length];
			System.arraycopy(stack, 0, newStackArray, 0, top);
			return newStackArray;
		}
	}
	
	public int size() {
		return top+1;
	}
	
	public boolean isEmpty() {
		return top==-1?true:false;
	}

	public void setArrayLengthUnit(int arrayLengthUnit) {
		this.arrayLengthUnit = arrayLengthUnit;
	}
}