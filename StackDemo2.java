       import java.util.Scanner;
public class StackDemo2 {
	public static void main(String[] args) {
		Scanner keyboard = new Scanner(System.in);
		StackInterface<Book> bookStack = new ArrayBasedStack<Book>(2);
		
		ArrayBasedStack<Integer> integerStack = new ArrayBasedStack<Integer>(2); //wrapper class 
		ArrayBasedStack<Boolean> booleanStack = new ArrayBasedStack<Boolean>(5);
		int option;
		
		do {
			System.out.println("Press 1 to push an item to the top of the stack");
			System.out.println("Press 2 to pop an item from the top of the stack");
			System.out.println("Press 3 to peek at the item at the top of the stack");
			System.out.println("Press 4 to end the program");
			option = keyboard.nextInt();
			keyboard.nextLine(); //go to the next line
			
			if(option == 1) {
				System.out.println("What book do you want to push onto the stack?");
				String newName = keyboard.nextLine();
				
				System.out.println("What is the name of the author?");
				String newAuthor = keyboard.nextLine();
				
				Book currentBook = new Book(newName,newAuthor); 
				
				try {
					bookStack.push(currentBook);
				}
				catch(StackFullException e) {
					System.out.println(e.getMessage());
				}
			}
			else if(option == 2) {
				try {
					bookStack.pop();
				}
				catch(StackEmptyException e) {
					System.out.println(e.getMessage());
				}
			}
			else if(option == 3) {
				System.out.println("Top: " + bookStack.peek());
			}
			else if(option == 4) {
				System.out.println("Thank you for using the program!");
			}
			else {
				System.out.println("Error! Invalid option! Try again!");
			}
		}while(option != 4);

	}

}
