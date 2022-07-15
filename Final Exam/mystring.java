package MCA30string;

import java.util.*;

public class mystring {
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Input a String : ");
		
		String str;
		str = sc.next();
		
		System.out.println("The Length of the String is : "+ str.length());

		System.out.println("The character at index 5 is : "+str.charAt(5));
		
		System.out.println("Does the String contain `tion` ?:"+str.contains("tion"));
		
		System.out.println("To Uppercase  :"+str.toUpperCase());
		
		System.out.println("To Lowercase :"+str.toLowerCase());
		
		String str1 = "exam ";
		
		System.out.println("Is String1 and String2 Same[Comapare Strings] :"+str.equals(str1));
		
		System.out.println("Concatenated Strings : "+str1.concat(str));
		
		System.out.println("The index of character n in the String : "+str.indexOf("n"));
		
		System.out.println("Is The String Empty ?"+str.isEmpty());
		
		System.out.println("Replace all `t` with `s` : "+str.replace("t","s"));
		
		System.out.println("The substring of the string str [2,5] is : "+str.substring(2, 5));
		
		
	}
}
