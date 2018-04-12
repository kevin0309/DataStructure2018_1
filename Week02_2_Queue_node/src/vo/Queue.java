package vo;

public class Queue {

	private QueueNode top;
	private QueueNode startNode;
	private int queueSize;
	
	public Queue() {
		super();
		startNode = new QueueNode(null);
		top = startNode;
		queueSize = 0;
	}

	public void put(Object newElement) {
		QueueNode newQueue = new QueueNode(newElement);
		top.setChildLink(newQueue);
		newQueue.setParentLink(top);
		top = newQueue;
		queueSize++;
	}
	
	public Object get() {
		if (this.isEmpty())
			throw new IndexOutOfBoundsException();
		
		Object result = startNode.getChildLink().getValue();
		
		if (startNode.getChildLink().getChildLink() != null) {
			startNode.getChildLink().getChildLink().setParentLink(startNode.getChildLink());
			startNode.setChildLink(startNode.getChildLink().getChildLink());
		}
		else {
			startNode.setChildLink(null);
		}
		
		queueSize--;
		
		return result;
	}
	
	public Object peek() {
		return startNode.getChildLink().getValue();
	}
	
	public int size() {
		return queueSize;
	}
	
	public boolean isEmpty() {
		return queueSize==0?true:false;
	}
}
