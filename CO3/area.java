import java.util.*;
class Calculate{
    void area_shape(int a,int b){
        System.out.println("The Area of Rectangle "+ a*b);
    }
    void area_shape(int r){
        System.out.println("The Area of Circle "+3.14*r*r);
    }
    void area_shape(int i,int j,int k){
        System.out.println("The Area of Cuboid "+i*j*k);
    }

}
public class area {
    public static void main(String [] args){
    int a,b,r,i,j,k;
    Scanner s=new Scanner(System.in);
    Calculate obj1 = new Calculate();
    Calculate obj2 = new Calculate();
    Calculate obj3 = new Calculate();
    System.out.println("Enter len a of sqr");
    a=s.nextInt();
    System.out.println("Enter breadth b of sqr");
    b=s.nextInt();
    obj1.area_shape(a,b);
    System.out.println("Enter radius of circle");
    r=s.nextInt();
    obj2.area_shape(r);
    System.out.println("Enter leng of cuboid");
    i=s.nextInt();
    System.out.println("Enter breadth of cuboid");
    j=s.nextInt();
    System.out.println("Enter height of cuboid");
    k=s.nextInt();
    obj3.area_shape(i,j,k);
    }

}
