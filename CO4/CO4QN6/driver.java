package CO4QN6;

import java.util.*;

public class driver {
	public static  void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter limit1:");
		int x = sc.nextInt();
		System.out.println("Enter limit2:");
		int y = sc.nextInt();
		Runnable r  = new fibo(x,y);
		Thread obj1 = new Thread(r);
		obj1.start();
		Runnable p  = new even(x,y);
		Thread obj2 = new Thread(p);
		obj2.start();
	}
}
