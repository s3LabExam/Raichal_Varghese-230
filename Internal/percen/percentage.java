package percen;

import java.util.*;

class Myexcep extends Exception{
	Myexcep(String m){
		super(m);
	}
}
class Student{
	String name;
	int Rno,m1,m2,m3;
	Student(String name,int Rno,int m1,int m2,int m3){
		this.name = name;
		this.Rno = Rno;
		this.m1 = m1;
		this.m2 = m2;
		this.m3 = m3;
	}
	void check_result(){
		try{
			if(((m1+m2+m3)/3)<40){
				throw new Myexcep(name+" :Failed");
			}
			else{
				System.out.println(name+": Pass");
			}
		}catch(Myexcep e){
			System.out.println(e.getMessage());
		}
	}
}
public class percentage {
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter n : ");
		int n, Rno,m1,m2,m3;
		String name;
		n = sc.nextInt();
		Student s[] = new Student[n];
		
		for(int i=0;i<n;i++){
			Scanner sc1 = new Scanner(System.in);
			System.out.println("enter Name");
			name = sc.next();
			System.out.println("enter Rno");
			Rno = sc.nextInt();
			System.out.println("enter m1");
			m1 = sc.nextInt();
			System.out.println("enter m2");
			m2 = sc.nextInt();
			System.out.println("enter m3");
			m3 = sc.nextInt();
			System.out.println("-----------");
			s[i] = new Student(name,Rno,m1,m2,m3);
			
		}
		for(int i=0;i<n;i++){
			s[i].check_result();
		}
	}
}
