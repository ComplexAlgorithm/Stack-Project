
public class StackDemo3 {
	public static void main(String [] args) {
		NodeBasedStack<String> myStack = new NodeBasedStack<String>();
		myStack.push("Dune");
		myStack.push("Brave New World");
		myStack.push("1984");
		
		System.out.println(myStack.peek());
		
		try {
			myStack.pop();
			System.out.println(myStack.peek());
			myStack.pop();
			System.out.println(myStack.peek());
		}
		catch(StackEmptyException e) {
			System.out.println(e.getMessage());
		}
	}
}
