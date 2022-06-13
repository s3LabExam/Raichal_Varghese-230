package student;

import java.util.*;

class Student{
	String id,name,branch;
	Student(String id,String name,String branch){
		this.id = id;
		this.name = name;
		this.branch =branch;
	}
	void display_data(){
		System.out.println("--------------");
		System.out.println("ID : "+ id);
		System.out.println("Name : "+name);
		System.out.println("Branch : "+branch);
	}
}

public class studlist {
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter n : ");
		int n;
		String id,name,branch;
		n = sc.nextInt();
		//Student s[] = new Student[n];
		//ArrayList<String>l =  new ArrayList<>();
	
		ArrayList<Student> stud = new ArrayList<Student>(n);
		for(int i=0;i<n;i++){
			Scanner sc1 = new Scanner(System.in);
			System.out.println("enter id");
			id = sc.next();
			System.out.println("enter name");
			name = sc.next();
			System.out.println("enter branch");
			branch = sc.next();
			stud.add(new Student(id,name,branch));
		}
		for(Student i : stud){
			i.display_data();
		}
	}
}

