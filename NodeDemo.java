
public class NodeDemo {
	public static void main(String[] args) {
		Node<String> firstNode = new Node<String>("Dune");
		Node<String> secondNode = new Node<String>("Animal Farm");

		firstNode.setLink(secondNode);
		
		Node<String> thirdNode = new Node<String>("Brave New World");
		
		secondNode.setLink(thirdNode);
		
		//create a while loop which starts at the firstNode and loops through
		//the chain of nodes printing out the value stored in each node
		//without creating an int variable  
		Node<String> currentNode = firstNode; //create a reference currentNode to 
		//refer to the object that firstNode is referring
		while(currentNode != null) {
			System.out.println(currentNode.getData());
			currentNode = currentNode.getLink(); //move this reference to the next node in the chain
		}
		
	}

}
