package vo;

public interface Stack {

	public void push(Object newElement);
	public Object pop();
	public Object peek();
	public int size();
	public boolean isEmpty();
}
