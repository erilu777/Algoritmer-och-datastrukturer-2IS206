package Uppgifter;

import java.util.ArrayList;
import java.util.Arrays;

public class UppgifterV8 {

    public static void mergeSort(int[] array, int start, int end) {
        if (start < end) {
            int mid = (start + end) / 2;

            // Sort the first half
            mergeSort(array, start, mid);

            // Sort the second half
            mergeSort(array, mid + 1, end);

            // Merge the two halves
            merge(array, start, mid, end); 
        }
    }

    private static void merge(int[] array, int start, int mid, int end) {
        // Create temporary arrays for the halves
        int[] left = Arrays.copyOfRange(array, start, mid + 1);
        int[] right = Arrays.copyOfRange(array, mid + 1, end + 1);

        int i = 0, j = 0, k = start; // i: left array index, j: right array index 

        // Merge elements from left and right back into the array
        while (i < left.length && j < right.length) {
            if (left[i] <= right[j]) {
                array[k] = left[i];
                i++;
            } else {
                array[k] = right[j];
                j++;
            }
            k++;
        }

        // Add any remaining elements
        while (i < left.length) {
            array[k] = left[i];
            i++;
            k++;
        }
        while (j < right.length) {
            array[k] = right[j];
            j++;
            k++;
        }
    }
	
    public static int[] insertionSort(int[] array) {
    	
    		for(int i = 1; i < array.length; i++) {
    			int currentValue = array[i];
    			
    			int j = i - 1;
    			
    			while(j >= 0 && array[j] > currentValue) {
    				array[j + 1] = array[j];
    				j--;
    			}
    			array[j +  1] = currentValue; 
    		}
    	return array;
    }
    
    
    public static int[] insertSort(int[] arr) {
    	
    	for(int i  = 1; i < arr.length; i++) {
    		int currentValue = arr[i];
    		
    		int j = i - 1;
    		
    		while(j >= 0 && arr[j] > currentValue) {
    			arr[j + 1] = arr[j];
    			j--;
    		}
    		arr[j + 1] = currentValue;
    	}
    	return arr;
    }
    
    public static void quickSort(int[] arr, int lowIndex, int highIndex) {
    	
    	if(lowIndex >= highIndex) {
    		return;
    	}
    	
    	int pivot = arr[highIndex];
    	
    	int leftPointer = lowIndex;
    	int rightPointer = highIndex;
    	
    	while (leftPointer < rightPointer) {
    		
    		while(arr[leftPointer] <= pivot && leftPointer < rightPointer) {
    			leftPointer++;
    		}
    		
    		while(arr[rightPointer] >= pivot && leftPointer < rightPointer) {
    			rightPointer--;	
    		}
    		
    		swap(arr, leftPointer, rightPointer);
    	}
    	swap(arr, leftPointer, highIndex);
    	
    	quickSort(arr, lowIndex, leftPointer - 1);
    	quickSort(arr, leftPointer + 1, highIndex);
    }
    
    private static void swap(int[] arr, int index1, int index2) {
    	int temp = arr[index1];
    	arr[index1] = arr[index2];
    	arr[index2] = temp;
    }
    
    /**
     * Return index of first occurrence of value t in array n or -1
     * if the value of t is not present in the array. If n contains
     * { 3, 4, 6, 1, 4 } and t is 4, the method will return 1.
     *
     * @param n the unsorted array we want to search
     * @param t the value we want to search for
     * @return index of the first occurrence of t or -1 if the value is not present
     */
   public static int findFirst(int[] n, int find) {
	   
	   for(int i = 0; i < n.length; i++) {
		   if(n[i] == find) {
			   return i;
		   }   
	   }
	   return -1;
   }
    
   /**
    * Find the second-largest value in array n.
    *
    * @param n the array we want to search in
    * @return the second-largest value in the array
    */
   public static int findSecondLargestValue(int[] a){
	   
	   int max_index = 0;
	   
	   for(int i = 1; i < a.length; i++) {
		   if(a[i] > a[max_index]) {
			   max_index = i;
		   }
	   }
	   
	   a[max_index] = Integer.MIN_VALUE;
	   
	   max_index  = 0;
	   
	   for(int i = 1; i < a.length; i++) {
		   if(a[i] > a[max_index]) {
			   max_index = i;
		   }
	   }
	   
	   return max_index;
   }
   
    
	public static void main(String[] args) {
		int[] arr = {8, 3, 1, 7, 0, 10, 2};
		System.out.println(findSecondLargestValue(arr));
}
}

