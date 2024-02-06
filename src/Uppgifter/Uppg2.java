package Uppgifter;

import java.util.*;

public class Uppg2 {

	/**
	 * Find the smallest value in an array. If array n
	 * contains { 3, 1, 0, 6 } the method will return
	 * 0 since it is the smallest value in the array.
	 *
	 * @param n the arrays we want to search
	 * @return the smallest value in the array
	 */
	public static int findSmallest(int[] n) {
		
		int min = n[0];
		
		for(int i = 1; i < n.length; i++) {
			if(n[i] < min) {
				min = n[i];
			}
		}
		
		return min;
		
	}
	
	/**
	 * Finds and returns the index of the largest value in the array.
	 * If a contains { 0, 3, 1, 2 } the method will 1 (index of 3 which
	 * is the largest value in the array).
	 *
	 * @param a the array we want to search in	
	 * @return index of the largest value
	 */
	public static int indexOfLargestValue(int[] a) {
		
		int maxVal = a[0];
		int maxInd = 0;
		
		for(int i = 1; i < a.length; i++) {
			if(a[i] > maxVal) {
				maxInd = i;
				maxVal = a[i];
			}
		}
		return maxInd;
	}
	
	/**
	 * Checks if the array is sorted in descending order (the next 
	 * element has an equal or lower value than the previous). 
	 * If a contains { 9, 5, 3, 1, 1 } the method will return true
	 * but if a contains { 9, 5, 3, 1, 3 } the method will return false.
	 *
	 * @param a an array with values
	 * @return true if the array is sorted in descending order, false otherwise
	 */
	public static boolean isSorted(int[] a) {
		
		for(int i = 1; i < a.length; i++) {
			if(a[i] > a[i-1]) {
				return false;
			}
		}
		return true;
	}
	
	/**
	  * Calculate how many values that occur only once. If n contains
	  * { 1, 2, 3, 2, 1 } the method will return 1 since it is only
	  * one value (3) that occur only once in the array.
	  *
	  * @param n the array with values
	  * @return the number of values in the array that occur only once
	  */
	 public static int numberOfUniqueValues1(int[] n) {
		 
		 int times = 0;
		 
		 for(int i = 0; i < n.length; i++) {
			 boolean single = true;
			 for(int j = 0; j < n.length; j++) {
				 if(n[j] == n[i] && i != j) {
					 single = false;
					 break;
				 }
			 }
			 if(single) {
				 times++;
			 }
		 }
		 return times;
	 }
	 
		/**
	  * Calculate how many values that occur only once. If n contains
	  * { 1, 2, 3, 2, 1 } the method will return 1 since it is only
	  * one value (3) that occur only once in the array.
	  *
	  * @param n the array with values
	  * @return the number of values in the array that occur only once
	  */
	 public static int numberOfUniqueValues2(int[] n) {
		 
		 Map<Integer, Integer> countMap = new HashMap<>();
		 int uniqueCount = 0;
		 
		 for(int value : n) {
			 countMap.put(value, countMap.getOrDefault(value, 0) + 1);
		 }
		 
		 for(int count : countMap.values()) {
			 if(count == 1) {
				 uniqueCount++;
			 }
		 }
		 
		 System.out.println(countMap);
		 
		 return uniqueCount;
		 
	 }
	 
	 /**
	  * Returns index of last occurrence of value 'find' in array 'a' or -1
	  * if the value of 'find' is not present in the array. If 'a' contains
	  * { 3, 4, 6, 1, 4 } and 'find' is 4, the method will return 1.
	  *
	  * @param a the array we want to search
	  * @param find the value we want to search for
	  * @return index of the first occurrence of 'find' or -1 if the value is not present
	  */
	 public int findLast(int[] a, int find) {
		 int lastOcc = -1;
		 
		 for(int i = 0; i < a.length; i++) {
			 if(a[i] == find) {
				 lastOcc = i;
			 }
		 }
		 
		 return lastOcc;
	 }
	 
	 /**
	  * Returns a reversed copy of the provided list. If 'list'
	  * contains { 0, 1, 2, 3 } the method will return a copy
	  * containing { 3, 2, 1, 0 }.
	  *
	  * @param list the list we want to create a reverse copy from
	  * @return a reversed copy
	  */
	 public static LinkedList<Integer> reverseCopy(LinkedList<Integer> list) {
		 LinkedList<Integer> reversedList = new LinkedList<>();
		 
		 for(int i = list.size(); i >= 0; i--) {
			 reversedList.add(list.get(i));
		 }
		 
		 return reversedList;
	 }
	 
	 /**
	  * Returns all two-letter combinations of the provided letters. If letters
	  * contain { A, B, C } the method will return { AB, AC, BA, BC, CA, CB }.
	  * Each letter is combined with all other letters but not with themselves.
	  *
	  * @param letters the letters
	  * @return all two-letter combination of the provided letters
	  */
	 public static LinkedList<String> combine(LinkedList<Character> letters) {
		 
		 LinkedList<String> combinations = new LinkedList<>();
		 
		 for(int i = 0; i < letters.size(); i++) {
			 for(int j = 0; j < letters.size(); j++) {
				 if(i != j) {
					 String toAdd = letters.get(i).toString() + letters.get(j).toString();
					 combinations.add(toAdd);
				 } 
			 }

		 }
		 return combinations;
	 }
	
	public static void main(String[] args) {
				
		int[] lis  = { 54,54,54,23,11};
		
        LinkedList<Character> link = new LinkedList<>();
		
		link.add('A');
		link.add('B');
		link.add('C');

		System.out.println(combine(link));
		
	}
	
}
