package vo;

public class CircularQueue {

	private Object[] queue;
	private int arrayLengthUnit = 100;
	private int top;
	private int bottom;
	
	public CircularQueue() {
		super();
		this.queue = new Object[arrayLengthUnit];
		this.top = -1;
		this.bottom = -1;
	}
	
	public void put(Object newElement) {
		if (top%arrayLengthUnit == arrayLengthUnit-1) {
			Object[] newQueue = new Object[top+arrayLengthUnit+1];
			System.arraycopy(queue, 0, newQueue, 0, top+1);
			queue = newQueue;
			
			queue[++top] = newElement;
		}
		else {
			queue[++top] = newElement;
		}
	}
	
	public Object get() {
		if (this.isEmpty())
			throw new IndexOutOfBoundsException();
		
		Object result = queue[++bottom];
		queue[bottom-1] = null;
		
		//배열이 비면 초기화..
		if (this.isEmpty()) {
			this.queue = new Object[arrayLengthUnit];
			this.top = -1;
			this.bottom = -1;
		}
		
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

	public void setArrayLengthUnit(int arrayLengthUnit) {
		this.arrayLengthUnit = arrayLengthUnit;
	}
}
