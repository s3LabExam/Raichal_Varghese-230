/*Program to demonstrate the creation of queue object using the PriorityQueue class*/
package CO4QN13;

import java.util.*;

public class priorityQ {
	public static void main(String args[]) {
		PriorityQueue<String> queue = new PriorityQueue<String>();
		queue.add("Java");
		queue.add("Program");
		System.out.println(queue);
	}
}
