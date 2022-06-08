package CO4QN11;

import java.util.*;
public class linklist {
	public static void main(String args[]) {
		LinkedList<String> linkli = new LinkedList<String>();
		linkli.add("LinkedList");
		linkli.add("is");
		linkli.add("a");
		linkli.add("Collection");
		linkli.add("in");
		linkli.add("Java");
		for(String ele:linkli)
			System.out.print(ele+" ");
		//remove all elements in linkedlist
		linkli.clear();
		System.out.println("\nLinkedList after clearing all :"+linkli);
	}
}
