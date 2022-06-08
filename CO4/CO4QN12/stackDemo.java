package CO4QN12;

import java.util.*;

public class stackDemo {
	public static void main(String args[]) {
		Stack<Integer> mystack = new Stack<Integer>();
		mystack.add(20);
		mystack.add(30);
		mystack.add(40);
		mystack.add(50);
		System.out.println("Mystack : "+mystack);
		// remove an object from the Stack when the position is passed as parameter
		mystack.remove(1);
		System.out.println("\nMystack after removing element at index 1 : "+mystack);
	}
	
	
}
