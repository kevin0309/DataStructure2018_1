package vo;

public class StackNode {

	private Object value;
	private StackNode childLink;
	private StackNode parentLink;
	private int index;
	

	public StackNode(Object value) {
		super();
		this.value = value;
		this.childLink = null;
		this.parentLink = null;
	}

	public Object getValue() {
		return value;
	}

	public void setValue(Object value) {
		this.value = value;
	}

	public StackNode getChildLink() {
		return childLink;
	}

	public void setChildLink(StackNode childLink) {
		this.childLink = childLink;
	}

	public StackNode getParentLink() {
		return parentLink;
	}

	public void setParentLink(StackNode parentLink) {
		this.parentLink = parentLink;
	}

	public int getIndex() {
		return index;
	}

	public void setIndex(int index) {
		this.index = index;
	}
	
	
}
