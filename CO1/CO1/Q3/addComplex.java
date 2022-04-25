import java.util.*;
class complex{
	int real;
	int imagine;
	int result;
	public complex(int n1,int n2){
		this.real=n1;
		this.imagine=n2;
	}
	public void show() {
		System.out.println("Result="+this.real+"+i"+this.imagine);
	}
	public static complex add(complex r1, complex r2){
		complex res= new complex(0,0);
		res.real=r1.real+r2.real;
		res.imagine=r1.imagine+r2.imagine;
		return res;
	}
}
public class addComplex {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the r1");
		int n1=sc.nextInt();
		System.out.println("Enter the im1");
		int n2=sc.nextInt();
		System.out.println("Enter the r2");
		int n3=sc.nextInt();
		System.out.println("Enter the im2");
		int n4=sc.nextInt();
		complex c1=new complex(n1,n2);
		complex c2=new complex(n3,n4);
		complex res = complex.add(c1,c2);
		res.show();
	}
}
