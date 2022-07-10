/**
 * UnBoundedStackInterface is a child interface of StackInterface
 * which means that it inherits all public method headings listed in the
 * StackInterface
 * 
 *
 * @param <T> T is type parameter that will receive its value from a type argument
 */
public interface UnBoundedStackInterface<T> extends StackInterface<T> {
	//override methods defined in StackInterface
	/**
	 * Push adds an item to the top of the stack
	 * @param item will be added to the top of the stack
	 */
	public void push(T item);
	
	//additional methods can be added to a child interface,
	//but we are not adding any by choice
}
