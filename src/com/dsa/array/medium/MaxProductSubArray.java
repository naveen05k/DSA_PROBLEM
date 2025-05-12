package com.dsa.array.medium;

/*
 * @author: Naveenkumar
 * @date: 2024-12-05
 * @description: Given an integer array nums, find the contiguous subarray (containing at least one number) which has the largest product and return that product.
 * Example 1: Input: nums = [2,3,-2,4] Output: 6 Explanation: [2,3] has the largest product 6.
 * Example 2: Input: nums = [-2,0,-1] Output: 0 Explanation: The result cannot be 1, because we should consider the subarray [-2].
 * time complexity: O(n) space complexity: O(1)
 * complexity explanation: The time complexity is O(n) because we are iterating through the array once, and the space complexity is O(1) because we are using a constant amount of space to store the variables left, right, and max.
 */
public class MaxProductSubArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(solution(new int[] { 2, 3, -2, 4 }));

	}

	/*
	 * Given an integer array nums, find the contiguous subarray (containing at
	 * least one number) which has the largest product and return that product.
	 */
	private static int solution(int[] num) {
		int max = Integer.MIN_VALUE;
		int left = 1;
		int right = 1;
		for (int i = 0; i < num.length; i++) {
			left *= num[i];
			right *= num[num.length - 1 - i];
			max = Math.max(max, Math.max(left, right));
			if (left == 0) {
				left = 1;
			}

			if (right == 0) {
				right = 1;
			}
		}

		return max;
	}

}
