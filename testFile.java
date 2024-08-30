package bruh;

import java.util.*;


public class testFile {

	public static void main(String[] args) {
		/*
		 * Test Script – leave statements w/ outputs in place
		 * 
		 * Create an empty Stack Output whether the Stack is empty Add 20 random
		 * integers (0-100) Output whether the Stack is empty Output the last value
		 * added Remove and output the last value added Output whether the Stack is
		 * empty Remove and output the last 18 values added Output whether the Stack is
		 * empty Remove and output the last value added Output the last value added
		 * (will produce an error unless you write around this) Output whether the Stack
		 * is empty
		 */
		Stack_11<Integer> stackObj = new Stack_11<Integer>();
		System.out.println(stackObj.isEmpty());
		///////////
		System.out.print("array: ");
		for (int i = 0; i < 20; i++) {
			int val = (int)(Math.random()*101);
			stackObj.push(val);
			System.out.print(val + " ");
			
			
		}
		System.out.println();
		System.out.println(stackObj.search(0));//tests extra search thing
		System.out.println(stackObj.isEmpty());
		System.out.println(stackObj.peek());
		System.out.println(stackObj.pop());
		System.out.println(stackObj.isEmpty());
		for (int i = 0; i < 18; i++) {
			System.out.println(stackObj.pop());
		}
		System.out.println(stackObj.isEmpty());
		System.out.println(stackObj.pop());
		System.out.println(stackObj.peek());
		System.out.println(stackObj.isEmpty());
		
		
	}

}
