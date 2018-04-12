package vo;

public class Stack_First implements Stack {

	private Object[] stack;
	private int length;
	
	public Stack_First() {
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

	@Override
	public Object peek() {
		return stack[length-1];
	}

	@Override
	public boolean isEmpty() {
		return length == 0 ? true : false;
	}
}
