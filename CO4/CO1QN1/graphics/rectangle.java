package CO1QN1.graphics;

import java.util.*;

public class rectangle implements area_calc {
	int l,b;
	@Override
	public void area() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the length:");
		l= sc.nextInt();
		System.out.println("Enter the breadth:");
		b = sc.nextInt();
		System.out.println("Area of the rectangle : "+l*b);
	}
}
