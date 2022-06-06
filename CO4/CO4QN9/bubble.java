package CO4QN9;

import java.util.*;

public class bubble {
	void bubbleSort(int arr[]){
		int len = arr.length;
		for(int i=0;i<len;i++){
			for(int j=0;j<len-i-1;j++){
				if(arr[j]>arr[j+1]){
					int temp = arr[j];
					arr[j] = arr[j+1];
					arr[j+1] = temp;
				}
			}
		}
	}
	void display(int arr[]){
		int len = arr.length;
		System.out.println("The Sorted elements of the array are : ");
		for(int i=0;i<len;i++){
			System.out.print(arr[i]+" ");
		}
	}
	public static void main(String args[]){
		System.out.println("Enter the number of elements in the array : ");
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int arr[] = new int[n];
		System.out.println("Enter the elements of the array");
		for(int i=0;i<n;i++){
			arr[i] = sc.nextInt();
		}
		bubble obj1 = new bubble();
		obj1.bubbleSort(arr);
		obj1.display(arr);
		
	}
}
