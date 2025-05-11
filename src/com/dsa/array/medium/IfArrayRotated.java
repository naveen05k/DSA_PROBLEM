package com.dsa.array.medium;

/*
 * @author: Naveenkumar D
 * @date: 2024-11-05
 * @description: This class implements a brute-force algorithm to check if an array is rotated.
 * The algorithm iterates through the array and counts the number of times the current element is less than the next element.
 * If the count is more than 1, it returns false, indicating that the array is not rotated.
 * If the count is 1 or less, it returns true, indicating that the array is rotated.
 * The time complexity of this algorithm is O(n) due to the single loop iterating through the array.
 * This implementation is not optimal for large arrays.
 * The algorithm can be improved using a more efficient approach, such as binary search, which has a time complexity of O(log n).
 * 
 */
public class IfArrayRotated {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(check(new int[] { 1, 2, 3, 4, 5 }));
	}

	/**
	 * This function checks if an array is rotated or not. It iterates through the
	 * array and counts the number of times the current element is less than the
	 * next element. If the count is more than 1, it returns false, indicating that
	 * the array is not rotated.
	 * 
	 * @param nums The input array of integers
	 * @return true if the array is rotated, false otherwise
	 */
	public static boolean check(int[] nums) {
		int n = nums.length;
		int count = 0;
		for (int i = 0; i < nums.length; i++) {
			if (nums[i] > nums[(i + 1) % n]) {
				count++;
			}
		}
		if (count > 1) {
			return false;
		} else {
			return true;
		}
	}
}
