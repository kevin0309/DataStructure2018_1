package vo;

public class QueueNode {

	private Object value;
	private QueueNode childLink;
	private QueueNode parentLink;
	

	public QueueNode(Object value) {
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

	public QueueNode getChildLink() {
		return childLink;
	}

	public void setChildLink(QueueNode childLink) {
		this.childLink = childLink;
	}

	public QueueNode getParentLink() {
		return parentLink;
	}

	public void setParentLink(QueueNode parentLink) {
		this.parentLink = parentLink;
	}
	
	
}
