package vo;

/**
 * codeup ����
 * 3117
 * 2016
 * 3129
 * 
 * ���ñ����ؼ� ���鿡 �ø���
 * @author LG
 *
 */
public class Stack {

	private Object[] stack;
	private int arrayLengthUnit = 100;
	private int top;
	
	public Stack() {
		super();
		this.stack = new Object[100];
		this.top = -1;
	}

	public void push(Object newElement) {
		if (top%arrayLengthUnit == arrayLengthUnit-1) {
			Object[] newStack = new Object[top+arrayLengthUnit+1];
			System.arraycopy(stack, 0, newStack, 0, top);
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
		
		if (top%arrayLengthUnit == arrayLengthUnit-1) {
			Object[] newStack = new Object[top+1];
			System.arraycopy(stack, 0, newStack, 0, top);
			stack = newStack;
		}
		
		return result;
	}
	
	public Object peak() {
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
}