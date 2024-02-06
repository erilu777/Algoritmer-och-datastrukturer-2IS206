package Uppgifter;

import java.util.*;

public class Uppg3{

	/**
	 * Returns a reversed copy of the provided list. If 'list'
	 * contains { 0, 1, 2, 3 } the method will return a copy
	 * containing { 3, 2, 1, 0 }.
	 *
	 * @param list the list we want to create a reverse copy from
	 * @return a reversed copy
	 */
	public static LinkedList<Integer> reverseCopy(LinkedList<Integer> list) {

		LinkedList<Integer> reverseList = new LinkedList<>();
		
		for(int i : list) {
			reverseList.addFirst(i);
		}
		
		return reverseList;
		}
		
	/**
	 * Returns true if there are matching parenthesis. If the String
	 * contains "((A + B) + (B + A))" the method will return true since
	 * there are matching end parenthesis for all start parenthesis.
	 * If the String contains "(A + B) + (B + A))" or "(A + B) + B + A)"
	 * the method will return false since there are not matching end
	 * parenthesis for all start parenthesis.
	 *
	 * @param s the String to check
	 * @return true if String has matching parenthesis
	 */
	public static boolean hasMatchingParenthesis(String s) {
		
		Stack<Character> helpStack = new Stack<>();
		
		for(char c : s.toCharArray()) {
			if(c == '(') {
				helpStack.add(c);
			}else if(c == ')'){
				if(helpStack.isEmpty() || helpStack.peek() != '(') {
					return false;
				}else {
					helpStack.pop();
				}
			}
		}
		return helpStack.isEmpty();
	}

	
	
	public static void main(String[] args) {
		LinkedList<Integer> numList = new LinkedList<>();
		numList.add(1);
		numList.add(2);
		numList.add(7);
		System.out.println(reverseCopy(numList));
	}
	
}
