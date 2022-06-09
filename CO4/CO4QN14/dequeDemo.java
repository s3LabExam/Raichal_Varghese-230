/*Program to demonstrate the addition and deletion of elements in deque*/
package CO4QN14;

import java.util.*;

public class dequeDemo {
	public static void main(String[] args) {
		Deque<String> deque = new LinkedList<String>();
		deque.addFirst("Java");
		deque.add("is");
		deque.addLast("a");
		deque.addLast("Programming");
		deque.addLast("Language");
		System.out.println(deque);
		deque.removeFirst();
		System.out.println(deque);
	}
}
