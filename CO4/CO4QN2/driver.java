package CO4QN2;

import CO4QN2.operation.*;
import java.util.*;
public class driver {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the first NUmber");
		int a = sc.nextInt();
		System.out.println("Enter the second NUmber");
		int b = sc.nextInt();
		add obj1 = new add();
		obj1.cal(a,b);
		subtract obj2 = new subtract();
		obj2.cal(a,b);
		multiply obj3 = new multiply();
		obj3.cal(a,b);
		divide obj4 = new divide();
		obj4.cal(a,b);
		
	}
}
