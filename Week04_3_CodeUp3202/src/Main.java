import java.util.ArrayList;
import java.util.Scanner;

class BinaryTreeNode {
	private BinaryTreeNode parent;
	private BinaryTreeNode leftNode;
	private BinaryTreeNode rightNode;
	private char value;
	
	public BinaryTreeNode(BinaryTreeNode parent, BinaryTreeNode leftNode, BinaryTreeNode rightNode, char value) {
		super();
		this.parent = parent;
		this.leftNode = leftNode;
		this.rightNode = rightNode;
		this.value = value;
	}

	public BinaryTreeNode getParent() {
		return parent;
	}

	public void setParent(BinaryTreeNode parent) {
		this.parent = parent;
	}

	public BinaryTreeNode getLeftNode() {
		return leftNode;
	}

	public void setChild1(BinaryTreeNode child1) {
		this.leftNode = child1;
	}

	public BinaryTreeNode getRightNode() {
		return rightNode;
	}

	public void setChild2(BinaryTreeNode child2) {
		this.rightNode = child2;
	}

	public char getValue() {
		return value;
	}

	public void setValue(char value) {
		this.value = value;
	}

	public boolean isFull() {
		if (leftNode != null && rightNode != null)
			return true;
		else
			return false;
	}
	
	public boolean isEmpty() {
		if (leftNode == null && rightNode == null)
			return true;
		else
			return false;
	}
	
	public void insertChildNode(BinaryTreeNode node) {
		if (leftNode == null)
			leftNode = node;
		else if (rightNode == null)
			rightNode = node;
	}
}

class BinaryTreeLevel {
	private int level;
	private int maxNodeCnt;
	private ArrayList<BinaryTreeNode> nodeArr;
	
	public BinaryTreeLevel(int level) {
		super();
		this.level = level;
		this.maxNodeCnt = (int)Math.pow(2, level-1);
		this.nodeArr = new ArrayList<>();
	}

	public int getLevel() {
		return level;
	}

	public ArrayList<BinaryTreeNode> getNodeArr() {
		return nodeArr;
	}

	public int getMaxNodeCnt() {
		return maxNodeCnt;
	}
	
	public boolean isFull() {
		if (nodeArr.size() == maxNodeCnt)
			return true;
		else 
			return false;
	}
	
	public void insertNode(BinaryTreeNode node) {
		if (!isFull())
			nodeArr.add(node);
	}
}

class BinaryTreeSet {
	private BinaryTreeNode root;
	private ArrayList<BinaryTreeLevel> nodes;

	public BinaryTreeSet(BinaryTreeNode root) {
		super();
		this.root = root;
		this.nodes = new ArrayList<>();
		nodes.add(new BinaryTreeLevel(1));
		nodes.get(0).insertNode(root);
	}

	public BinaryTreeNode getRoot() {
		return root;
	}
	
	public void insert(char value) {
		BinaryTreeLevel latestLevel = nodes.get(nodes.size()-1);
		if (latestLevel.isFull()) {
			nodes.add(new BinaryTreeLevel(nodes.size()+1));
			BinaryTreeNode newNode = new BinaryTreeNode(nodes.get(nodes.size()-2).getNodeArr().get(0), null, null, value);
			nodes.get(nodes.size()-1).insertNode(newNode);
			nodes.get(nodes.size()-2).getNodeArr().get(0).insertChildNode(newNode);
		}
		else {
			BinaryTreeLevel upperLevel = nodes.get(nodes.size()-2);
			BinaryTreeLevel curLevel = nodes.get(nodes.size()-1);
			BinaryTreeNode newNode = new BinaryTreeNode(upperLevel.getNodeArr().get((int)(curLevel.getNodeArr().size()/2)), null, null, value);
			newNode.getParent().insertChildNode(newNode);
			latestLevel.insertNode(newNode);
		}
	}
	
	public void inOrderTraversal() {
		inOrderTraversalProg(root);
	}
	
	private void inOrderTraversalProg(BinaryTreeNode node) {
		if (node != null) {
			inOrderTraversalProg(node.getLeftNode());
			System.out.print(node.getValue());
			inOrderTraversalProg(node.getRightNode());
		}
	}
	
	public void preOrderTraversal() {
		preOrderTraversalProg(root);
	}
	
	private void preOrderTraversalProg(BinaryTreeNode node) {
		if (node != null) {
			System.out.print(node.getValue());
			preOrderTraversalProg(node.getLeftNode());
			preOrderTraversalProg(node.getRightNode());
		}
	}
	
	public void postOrderTraversal() {
		postOrderTraversalProg(root);
	}
	
	private void postOrderTraversalProg(BinaryTreeNode node) {
		if (node != null) {
			postOrderTraversalProg(node.getLeftNode());
			postOrderTraversalProg(node.getRightNode());
			System.out.print(node.getValue());
		}
	}
}

public class Main {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String input = scan.nextLine();
		
		BinaryTreeNode rootNode = new BinaryTreeNode(null, null, null, input.charAt(0));
		BinaryTreeSet tree = new BinaryTreeSet(rootNode);
		for (int i = 1; i < input.length(); i++)
			tree.insert(input.charAt(i));
		tree.preOrderTraversal();
	}
}
