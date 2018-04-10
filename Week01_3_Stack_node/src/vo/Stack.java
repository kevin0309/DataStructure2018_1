package vo;

public class Stack {

	private StackNode top;
	private StackNode startNode;
	
	public Stack() {
		super();
		startNode = new StackNode(null);
		startNode.setIndex(-1);
		top = startNode;
	}

	public void push(Object newElement) {
		StackNode newStack = new StackNode(newElement);
		top.setChildLink(newStack);
		newStack.setParentLink(top);
		newStack.setIndex(top.getIndex()+1);
		top = newStack;
	}
	
	public Object pop() {
		if (top.getIndex() == -1)
			throw new IndexOutOfBoundsException();
		
		Object result = top.getValue();

		StackNode parent = top.getParentLink();
		if (parent != null) {
			parent.setChildLink(null);
			top = parent;
		}
		
		return result;
	}
	
	public Object peek() {
		return top.getValue();
	}
	
	public int size() {
		return top.getIndex()+1;
	}
	
	public boolean isEmpty() {
		return top==startNode?true:false;
	}
}
