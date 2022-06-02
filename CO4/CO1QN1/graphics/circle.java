package CO1QN1.graphics;

import java.util.*;

public class circle implements area_calc {
	int r;
	@Override
	public void area() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the radius");
		r= sc.nextInt();
		String area = Double.toString(Math.PI*r*r);
		System.out.println("Area of the circle :"+area);
		sc.close();
	}
}
