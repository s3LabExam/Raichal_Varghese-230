package CO4QN18;

import java.util.*;

public class convert {
	public static void main(String args[]) {
		Map<Integer,String> hashmap = new HashMap<>();
		hashmap.put(1,"Collections");
		hashmap.put(5,"a");
		hashmap.put(6,"framework");
		hashmap.put(3,"Java");
		hashmap.put(4,"is");
		hashmap.put(2,"in");
		
		
		System.out.println("Iterating hashmap:");
		Set<Integer> keys = hashmap.keySet();
		for(Integer i:keys) {
			System.out.println(i+" : "+hashmap.get(i));
		}
		
		//System.out.println("Hashmap"+hashmap);
		
		
		Map<Integer,String> treemap = new TreeMap<>();
		treemap.putAll(hashmap);
		//System.out.println("Treemap"+treemap);
		
		System.out.println("Iterating converted treemap:");
		Set<Integer> keys1 = treemap.keySet();
		for(Integer i:keys1) {
			System.out.println(i+" : "+treemap.get(i));
		}
		
	}
}
