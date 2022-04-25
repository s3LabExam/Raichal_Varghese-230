import java.util.Scanner;

public class Employee {
	int Enum;
	String Ename;
	double Esalary;
	
	void getdetails()
	{
		Scanner s1=new Scanner(System.in);
		System.out.println("Enter employee number: ");
		Enum=s1.nextInt();
		Scanner s2=new Scanner(System.in);
		System.out.println("Enter employee name: ");
		Ename=s2.nextLine();
		Scanner s3=new Scanner(System.in);
		System.out.println("Enter employee salary: ");
		Esalary=s3.nextDouble();
	}
	void display()
	{
		System.out.println("Employee number: "+Enum);
		System.out.println("Employee name: "+Ename);
		System.out.println("Salary: "+Esalary);
		
	}
	public static void main(String args[])
	{
		int n;
		Scanner s4=new Scanner(System.in);
		System.out.println("Enter the no of employees: ");
		n=s4.nextInt();
		Employee e[]=new Employee[n];
		
		for(int i=0;i<n;i++)
		{
			e[i]=new Employee();
			e[i].getdetails();
		}
		System.out.println("The employee details are:");
		for(int i=0;i<n;i++)
		{
			e[i].display();
		}
		
		int no,flag=0;
		Scanner s5=new Scanner(System.in);
		System.out.println("Enter employee no to display details: ");
		no=s5.nextInt();
		
		for(int i=0;i<n;i++)
		{
			if(no==e[i].Enum)
			{
				e[i].display();
				flag=1;
				break;
			}
		}
		if(flag==0)
		{
			System.out.println("No such employee");
		}
	}
	
}