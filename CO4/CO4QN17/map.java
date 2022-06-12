package CO4QN17;

import java.util.*;

public class map {
	public static void main(String args[]) {
		Map<String,Integer> map = new HashMap<>();
		map.put("Pen",10);
		map.put("Pencil",15);
		map.put("Book",5);
		map.put("Text",2);
		
		//1. print
		for(Map.Entry<String, Integer> e:map.entrySet()) {
			System.out.println(e.getKey()+"  :  "+e.getValue());
		}
		
		//2. print
		//Set<String> Keys = map.keySet();
		//for(String key:Keys) {
		//	System.out.println(key+" : "+map.get(key));
		//}
		
	}
	
	
	
	
}
