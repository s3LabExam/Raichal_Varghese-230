package CO4QN16;

import java.util.*;

public class compareHash {
	public static void main(String args[]) {
		HashSet<Integer> hash1 = new HashSet<>();
		hash1.add(1);
		hash1.add(3);
		hash1.add(2);
		hash1.add(4);
		hash1.add(5);
		HashSet<Integer> hash2 = new HashSet<>();
		hash2.add(2);
		hash2.add(3);
		hash2.add(1);
		hash2.add(5);
		hash2.add(4);
		System.out.println("Are the two HashSets equal ? "+hash1.equals(hash2));
	}
}
