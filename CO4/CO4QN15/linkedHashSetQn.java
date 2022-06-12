package CO4QN15;

import java.util.*;

public class linkedHashSetQn {
	public static void main(String args[]) {
		LinkedHashSet<String> ln = new LinkedHashSet<>();
		System.out.println("Adding Elements to the linkedHashSet : ");
		ln.add("Java");
		ln.add("Python");
		ln.add("MongoDB");
		for(String i :ln ) {
			System.out.print(i+" ");
		}
		System.out.println("\nRemoving Elements to the linkedHashSet : ");
		ln.remove("Python");
		System.out.println(ln);
		System.out.println("\nTrying to remove C which is not present : "+ln.remove("C"));
		System.out.println("\nChecking if Java  contains :  "+ ln.contains("Java"));
	}
}
