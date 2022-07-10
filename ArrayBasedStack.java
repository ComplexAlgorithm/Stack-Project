/**
 * ArrayBasedStack implements StackInterface using an array to
 * store the items in the stack 
 * 
 *
 */
public class ArrayBasedStack<T> extends Object implements StackInterface<T> {
	//instance variables
	private int top; //keeps track of the top of the stack
	private T [] stack; //this array holds the items in the stack, reference to an array of T where T is filled in with a type argument
	
	/**
	 * Default constructor that calls constructor of the parent class (Object)
	 * and sets top to -1 to represent an empty stack and 
	 * creates an array of Strings of size 5
	 */
	public ArrayBasedStack() {
		super(); //calls the constructor of parent class (Object)
		top = -1; //represents the stack is empty
		stack = (T[])new Object[5]; //create an array and have stack refer to it
	}
	
	/**
	 * Overloaded constructor that calls the constructor of the parent class (Object)
	 * and sets top to -1 to represent an empty stack and
	 * creates an array of the size equal to parameter size if size > 0 
	 * else creates an array of size 5
	 * @param size specifies the size of the array
	 */
	public ArrayBasedStack(int size) {
		super();
		top = -1;
		if(size > 0) {
			stack = (T[])new Object[size];
		}
		else {
			stack = (T[])new Object[5];
		}
	}
	
	@Override
	public void push(T item) throws StackFullException {
		// TODO Auto-generated method stub
		if(top < stack.length - 1) { //there is room for one additional item
			top++;
			stack[top] = item;
		}
		else {
			throw new StackFullException("The stack is full!");
		}
	}

	@Override
	public void pop() throws StackEmptyException {
		// TODO Auto-generated method stub
		if(top > -1) {
			stack[top] = null; //remove the item at the top of the stack
			top--;
		}
		else {
			throw new StackEmptyException("The stack is empty!");
		}
	}

	@Override
	public String peek() {
		// TODO Auto-generated method stub
		String topItem;
		if(top > -1) {
			topItem = stack[top].toString(); //calls the toString method on the object 
		}
		else {
			topItem = "Stack is Empty";
		}
		return topItem;
	}

}
