import java.util.*;

public class search_ele {
	public static void check(int[] arr,int checkval){
		boolean test = false;
		for(int element : arr) {
			if(element == checkval) {
				test= true;
				break;
			}
		}
		System.out.println("Is"+checkval+" Present?"+test);
	}
	public static void main(String [] args) {
		int arr[] = {1,2,3,4,5,6,7,8,9};
		int toCheckValue = 3;
		System.out.println("Array is:"+Arrays.toString(arr));
		check(arr,toCheckValue);
		
	}
}
