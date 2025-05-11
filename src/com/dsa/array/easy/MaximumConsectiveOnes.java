package com.dsa.array.easy;

/**
 * 
 * To find the maximum number of consecutive 1s (or 0s) in a binary array, you
 * can use a simple linear scan with a counter. Here's a clean and efficient
 * Java implementation for both 1s and 0s:
 * 
 * 
 */
public class MaximumConsectiveOnes {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = { 1, 1, 0, 0, 1, 0, 1, 0, 1, 1, 1, 1 };
		int res = maxConsecutiveCount(arr);
		System.out.println("Result " + res);
	}

	private static int maxConsecutiveCount(int[] arr) {
		int max = 0;
		int count = 0;
		for (int i = 1; i < arr.length; i++) {
			if (arr[i] == arr[i - 1]) {
				count++;
			} else {
				count = 1;
			}
			max = Math.max(max, count);
		}
		return Math.max(max, count);
	}

}
