package com.sample.string;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class SumPair {
	public static void main(String args[]) { 
		
/*		Random Integer array : [11, 8, 5, 6, 3, 5, 4, 13, 1]
				Sum : 11
				pair of numbers from an array whose sum equals 11
				(6, 5) 
				(3, 8) */
		prettyPrint(getRandomArray(9), 11); 
/*		Random Integer array : [4, 0, 8, 2, 8, 6, 5, 13, 3, 7]
				Sum : 12
				pair of numbers from an array whose sum equals 12
				(8, 4) 
				(8, 4) 
				(7, 5) */
		prettyPrint(getRandomArray(10), 12); 
		}

	public static void printPairsUsingSet(int[] numbers, int n) {
		if (numbers.length < 2) {
			return;
		}
		Set<Integer> set = new HashSet<>(numbers.length);
		for (int value : numbers) {
			int target = n - value; 
			// if target number is not in set then add 
			if(!set.contains(target)){
			 set.add(value); 
			 }
			else { 
				System.out.printf("(%d, %d) %n", value, target); 
				} 
			}
	 }
	
	public static void prettyPrint(int[] random, int k){
		 System.out.println("Random Integer array : " + Arrays.toString(random));
		 System.out.println("Sum : " + k); 
		 System.out.println("pair of numbers from an array whose sum equals " + k);
		 printPairsUsingSet(random, k); 
		 } 
	public static int[] getRandomArray(int length){ 
		int[] randoms = new int[length]; 
		for(int i=0; i<length; i++){ 
		randoms[i] = (int) (Math.random()*15); 
		} 
		return randoms; 
		}


}
