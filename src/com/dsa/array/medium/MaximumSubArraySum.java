package com.dsa.array.medium;

/*
 * @author: Naveenkumar D
 * @date: 2024-11-05
 * 	* @description: This class implements a brute-force algorithm to find the maximum subarray sum.
 * * The algorithm iterates through the array and calculates the sum of all possible subarrays.
 * * If the sum of a subarray is greater than the current maximum, it updates the maximum.
 * * * The time complexity of this algorithm is O(n^2) due to the nested loops.
 * * This implementation is not optimal for large arrays.
 * * The algorithm can be improved using a more efficient approach, such as Kadane's algorithm, which has a time complexity of O(n).
 * 
 */
public class MaximumSubArraySum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int res = solution(new int[] { -2, 1, -3, 4, -1, 2, 1, -5, 4 });
		System.out.println(res);
	}

	/**
	 * This function takes an array of integers and finds the maximum subarray sum
	 * using Kadane's algorithm. It iterates through the array, maintaining a
	 * running sum and updating the maximum sum found so far. If the running sum
	 * becomes negative, it resets it to zero.
	 * 
	 * @param num The input array of integers
	 * @return The maximum subarray sum
	 */
	private static int solution(int[] num) {
		// TODO Auto-generated method stub
		int max = Integer.MIN_VALUE;

		int sum = 0;

		for (int i = 0; i < num.length; i++) {
			sum += num[i];

			max = Math.max(max, sum);
			if (sum < 0) {
				sum = 0;
			}

		}
		return max;

	}

}
