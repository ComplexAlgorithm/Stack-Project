
public class NodeBasedStack<T> extends Object implements UnBoundedStackInterface<T> {
	//instance variables
	private Node<T> top; //reference to an object of the Node class, aggregation
	
	//default constructor
	public NodeBasedStack() {
		super();
		top = null;
	}
	
	@Override
	public void pop() throws StackEmptyException {
		// TODO Auto-generated method stub
		if(top == null) {
			throw new StackEmptyException("Pop attempted on an empty stack!");
		}
		else {
			top = top.getLink(); 
		}
	}

	@Override
	public String peek() {
		// TODO Auto-generated method stub
		String topItem;
		if(top == null) {
			topItem = "Stack is Empty!";
		}
		else {
			topItem = top.getData().toString();
		}
		return topItem;
	}

	@Override
	public void push(T item) {
		// TODO Auto-generated method stub
		Node<T> currentNode = new Node<T>(item);
		if(top == null) {
			top = currentNode;
		}
		else {
			currentNode.setLink(top);
			top = currentNode;
		}
	}

}
