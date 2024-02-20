package Uppgifter;

import java.util.HashMap;

public class UppgifterV7 {

	/**
	  * Calculate how many values that occur only once. If n contains
	  * { 1, 2, 3, 2, 1 } the method will return 1 since it is only
	  * one value (3) that occur only once in the array.
	  *
	  * @param n the array with values
	  * @return the number of values in the array that occur only once
	  */
	 public static int numberOfUniqueValues(int[] a) {
		 
		 HashMap<Integer, Integer> valueCounts = new HashMap<>();
		 
		 //Hashmap to store frequency of value in array
		 for(int value : a) {
			 valueCounts.put(value, valueCounts.getOrDefault(value, 0) + 1);
		 }
		 
		 //Count number of values with frequency of 1
		 int uniqueValueCount = 0;
		 for(int valueCount : valueCounts.values()) {
			 if(valueCount == 1) {
				 uniqueValueCount++;
			 }
		 }
		 
		 return uniqueValueCount;
	 }
	 
	 /**
	  * Finds the most frequent number in array 'a'. If 'a' contains [ 2, 4, 2, 4, 4 ]
	  * 4 will be returned since it appears 3 times while 2 appears only 2 times. If
	  * multiple numbers appear the maximum number of times, any of those will be returned.
	  *
	  * @param a unsorted array with numbers
	  * @return the most frequent number in the array
	  */
	 public static int findMostFrequentNumber(int[] a) {
		 
		 HashMap<Integer, Integer> valueCounts = new HashMap<>();
		 
		 //Store frequency of value in array
		 for(int value : a) {
			 valueCounts.put(value, valueCounts.getOrDefault(value, 0) + 1);
		 }
		 
		 //Get value with highest frequency
		 
		 
		 return -1;
	 }

	 
	 public static void main(String[] args) {
		 
		 int[] intList = {2, 4, 2, 4, 4};
		 System.out.println(findMostFrequentNumber(intList));
		
	}
}
