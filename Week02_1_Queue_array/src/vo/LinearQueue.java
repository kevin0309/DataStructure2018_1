package vo;

public class LinearQueue {

	private Object[] queue;
	private int arrayLengthUnit = 100;
	private int top;
	private int bottom;
	
	public LinearQueue() {
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
		if (bottom != 0)
			queue[bottom-1] = null;
		
		//배열이 비었으면 초기화..
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
