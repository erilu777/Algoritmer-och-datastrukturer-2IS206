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
    
	public static void main(String[] args) {
		int[] arr = {8, 3, 1, 7, 0, 10, 2};
		quickSort(arr, 0, arr.length - 1);
		System.out.println(Arrays.toString(arr));
}
}

