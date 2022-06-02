package CO1QN1.graphics;

import java.util.*;

public class triangle implements area_calc {
	int b,h;
	@Override
	public void area() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Input height of the triangle : ");
        h = sc.nextInt();
        System.out.println("Input breadth of triangle : ");
        b = sc.nextInt();
        String area = Double.toString((h*b)/2f);
        System.out.println("Area of the triangle is : "+area);
	}
}
