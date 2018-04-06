package vo;

/**
 * codeup 문제
 * 3117
 * 2016
 * 3129
 * 
 * 스택구현해서 깃헙에 올리기
 * @author LG
 *
 */
public class Stack {

	private Object[] stack;
	private int length;
	
	public Stack() {
		super();
		this.stack = new Object[0];
		this.length = 0;
	}

	public void push(Object newElement) {
		Object[] newStack = new Object[length+1];
		System.arraycopy(stack, 0, newStack, 0, length);
		stack = newStack;
		newStack[length++] = newElement;
	}
	
	public Object pop() {
		if (length == 0)
			throw new IndexOutOfBoundsException();
		Object result = stack[--length];
		Object[] newStack = new Object[length];
		System.arraycopy(stack, 0, newStack, 0, length);
		stack = newStack;
		
		return result;
	}
	
	public int size() {
		return length;
	}
}
