import java.util.*;

public class product {
int e=0;
public void get()
{


Scanner sc=new Scanner(System.in);
Scanner dd=new Scanner(System.in);
Scanner ee=new Scanner(System.in);
System.out.println("enter the product code ");
int c= sc.nextInt();

System.out.println("enter the product name ");
String d= dd.nextLine();

System.out.println("enter the product price ");
e= sc.nextInt();
System.out.println("your product number is "+c);
System.out.println("your product name  "+d);
System.out.println("your product price is  "+e);
}



public static void main(String[] args) {



product p1=new product();
product p2=new product();
product p3=new product();

p1.get();
p2.get();
p3.get();


if(p1.e>p2.e && p1.e>p3.e)
{
System.out.println("price of first is larger");
}
else if(p2.e>p3.e)
{
System.out.println("price of second is larger");
}
else
{
System.out.println("price of third  is larger");

}
}
}