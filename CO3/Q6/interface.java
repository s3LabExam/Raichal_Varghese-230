// Create an interface having prototypes of functions area() and perimeter(). Create two 
// classes Circle and Rectangle which implements the above interface. Create a menu driven 
// program to find area and perimeter of objects.

import java.util.*;

interface prototype{
    void data();
    void area();
    void perimeter();
}

class Circle implements prototype{
    double pi = 3.14;
    double r;
    Scanner sc = new Scanner(System.in);
    public void data(){
        System.out.println("Enter the radius of the circle :");
        r = sc.nextDouble();
    }
    public void area(){
        System.out.println("The area of the circle is :",pi*r*r);
    }
    public void perimeter(){
        System.out.println("The perimeter of the circle is :",2*pi*r);
    }
}

class Rectangle implements prototype
{
    double l,b;
    Scanner sc = new Scanner(System.in);
    public void data()
    {
        System.out.println("Enter the length of the rectangle:");
        l = sc.nextDouble();
        System.out.println("Enter the breadth of the rectangle:");
        b = sc.nextDouble();
    }
    public void area()
    {
        System.out.println("Perimeter of a rectangle: "+(l*b));
    }
    public void perimeter()
    {
        System.out.println("Perimeter of a rectangle: "+(2*(l+b)));
    }
}

public class interface
{
    public static void main(String[] args) 
    {
        int ch;
        Scanner sc = new Scanner(System.in);
        Circle ob = new Circle();
        Rectangle obj = new Rectangle();
        do
        {
            System.out.println("\n1.Circle\n2.Rectangle\n3.exit");
            System.out.println("Enter your choice:");
            ch = sc.nextInt();
            switch(ch)
            {
                case 1 :ob.data();
                        ob.area();
                        ob.perimeter();
                        break;
                case 2 :obj.data();
                        obj.area();
                        obj.perimeter();
                        break;
                case 3 :System.out.println("Exited...");
                        System.exit(0);
            }
        }while(true);
    }
}


}
