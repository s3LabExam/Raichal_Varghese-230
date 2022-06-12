package CO4QN9;

import java.util.*;


public class bubblesortGeneric<T extends Comparable<? super T>> {
	void bubbleSort(T[] array) {
		int n = array.length;
        while (n > 0)
        {
            int lastModifiedIndex = 0;
            for (int currentIndex = 1; currentIndex < n; currentIndex++)
            {
                if (array[currentIndex - 1].compareTo(array[currentIndex]) > 0)
                {
                    T temp = array[currentIndex - 1];
                    array[currentIndex - 1] = array[currentIndex];
                    array[currentIndex] = temp;
                    lastModifiedIndex = currentIndex;
                }
            }
            n = lastModifiedIndex;
        }
    }
	public static void main(String args[]) {
		Integer[] arr = {10,2,3,4,8,6,9};
		bubblesortGeneric<Integer> bubble1 = new bubblesortGeneric<Integer>();
		bubble1.bubbleSort(arr);
		System.out.println(java.util.Arrays.toString(arr));
		
		
		String[] arr2 = {"Andree", "Leana", "Faviola", "Loyce", "Quincy", "Milo", "Jamila", "Toccara", "Nelda"};
		bubblesortGeneric<String> bubble2 = new bubblesortGeneric<String>();
		bubble2.bubbleSort(arr2);
		System.out.println(java.util.Arrays.toString(arr2));
	}
}
