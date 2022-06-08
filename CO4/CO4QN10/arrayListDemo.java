package CO4QN10;
import java.util.*;

public class arrayListDemo {
	public static void main(String args[]) {
		int n = 5;
		//Declaring 
		ArrayList<String> arrli = new ArrayList<String>(n);
		//Adding new elements
		arrli.add("Java");
		arrli.add("is");
		arrli.add("a");
		arrli.add("Programming");
		arrli.add("language");
		//Display
		System.out.println(arrli);
		//Remove element at index 1
		arrli.remove(1);
		System.out.println(arrli);
		//Remove an element
		arrli.remove("a");
		System.out.println(arrli);
		// indexOf
		System.out.println("String Java is at index--"+arrli.indexOf("Java"));
		//add element at an index
		arrli.add(1,"is");
		System.out.println(arrli);
		//printing all the elements
		for(String ele:arrli) {
			System.out.print(ele+" ");
		}
		//Getting element at index 2
		System.out.println("\nElement at index 2--"+arrli.get(2));
		//add an arraylist to another
		ArrayList<String> arrli1 = new ArrayList<String>(n);
		arrli.add("Python");
		arrli.add("C++");
		arrli.addAll(arrli1);
		for(String ele:arrli)
			System.out.print(ele+" ");
	}
}
