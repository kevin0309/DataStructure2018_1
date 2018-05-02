package vo;

public class CircularQueue {

	private Object[] queue;
	private int top;
	private int bottom;
	
	/**
	 * (0) 1 2 3 4 1 2 3 4
	 */
	public CircularQueue() {
		super();
		this.queue = new Object[5];
		this.top = 0;
		this.bottom = 0;
	}
	
	public void put(Object newElement) {
		if (top == 4)
			top = 1;
		if (queue[top+1] == null)
			queue[++top] = newElement;
		else
			throw new IndexOutOfBoundsException();
	}
	
	public Object get() {
		if (this.isEmpty())
			throw new IndexOutOfBoundsException();
		
		if (bottom == 4)
			bottom = 1;
		Object result = queue[bottom++];
		queue[bottom-1] = null;
		
		return result;
	}
	
	public Object peek() {
		return queue[bottom+1];
	}
	
	public int size() {
		return top - bottom;
	}
	
	public boolean isEmpty() {
		return top == bottom ? true : false;
	}
	
	public boolean isFull() {
		return top+1 == bottom;
	}
}
