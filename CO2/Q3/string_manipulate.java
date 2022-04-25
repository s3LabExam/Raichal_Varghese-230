import java.util.*;
public class string_manipulate {
	public static void main(String [] args) {
		String text = "Programming";
		char a1=text.charAt(0);
		int n1 = text.length();
		
		System.out.println("Character at 0:"+a1);
		System.out.println("Length:"+n1);
		System.out.println(text.replace('P','T'));
		System.out.println(text.toUpperCase());
		System.out.println(text.toLowerCase());
		
	}
}
