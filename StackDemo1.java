/**
 * StackDemo1 is used to test ArrayBasedStack to make sure all
 * 3 methods work correctly
 */
import java.util.Scanner;
public class StackDemo1 {
	public static void main(String[] args) {
		ArrayBasedStack<String> bookStack = new ArrayBasedStack<String>();
		try { //try to run this code and if there are no exceptions skip the catch block
			bookStack.pop();
			bookStack.push("Dune");
			bookStack.push("Animal Farm");
			bookStack.push("Brave New World");
		
			String top = bookStack.peek();
			System.out.println("Top: " + top);
		
			bookStack.pop();
		
			top = bookStack.peek();
			System.out.println("Top: " + top);
		
			bookStack.pop();
		
			top = bookStack.peek();
			System.out.println("Top: " + top);
		}
		catch(StackFullException e) { //catch-block parameter, but it is also a reference
			System.out.println(e.getMessage());
		}
		catch(StackEmptyException e2) { //catch-block parameter, but it is also a reference
			System.out.println(e2.getMessage());
		}
	}

}