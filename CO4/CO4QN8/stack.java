package CO4.CO4QN7;

import java.util.*;

class stackdata<T>{
	ArrayList<T> A;
	int top = -1;
	int size;
	stackdata(int size){
		this.size = size;
		this.A = new ArrayList<T>(size);
	}
	
	void push(T X){
		if(top +1 ==size){
			System.out.println("Stack Overflow");
		}
		else{
			top = top+1;
			if(A.size()>top){
				A.set(top,X);
			}
			else{
				A.add(X);
			}
		}
	}
	
	void pop(){
		if(top==-1){
			System.out.println("Stack empty");
		}
		else{
			top--;
		}
	}
	
	public String toString(){
		String Ans = "";
		for(int i=0;i<top;i++){
			Ans+=String.valueOf(A.get(i))+"-> ";
		}
		Ans+=String.valueOf(A.get(top));
		return Ans;
		
		
	}
}
public class stack {
	public static void main(String args[]){
		stackdata<Integer> obj1 = new stackdata<>(5);
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the elements to be pushed : ");
		for(int i=0;i<5;i++){
			obj1.push(sc.nextInt());
		}
		System.out.println("Stack after pushing : "+obj1);
		obj1.pop();
		obj1.pop();
		System.out.println("Stack after pop : "+obj1);
		
	}
}
