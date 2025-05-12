package com.dsa.array.medium;

import java.util.Arrays;

/*
 * @author: Naveenkumar
 * @date: 2024-12-05
 * @description: Given an integer array nums, return an array answer such that answer[i] is equal to the product of all the elements of nums except nums[i].
 * Example 1: Input: nums = [1,2,3,4] Output: [24,12,8,6]
 * Example 2: Input: nums = [-1,1,0,-3,3] Output: [0,0,9,0,0]
 * time complexity: O(n) space complexity: O(n)
 * complexity explanation: The time complexity is O(n) because we are iterating through the array once, and the space complexity is O(n) because we are using an additional array to store the left and right products.
 * 
 */
public class MaxProExceptSelf {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(Arrays.toString(solutionV1(new int[] { 1, 2, 3, 4 })));
	}

	/*
	 * Given an integer array nums, return an array answer such that answer[i] is
	 * equal to the product of all the elements of nums except nums[i].
	 */
	public static int[] solution(int[] num) {
		int left[] = new int[num.length];
		int right[] = new int[num.length];
		int result[] = new int[num.length];

		int leftPro = 1;
		for (int i = 0; i < num.length; i++) {
			left[i] = leftPro;
			leftPro *= num[i];
		}

		int rightPro = 1;
		for (int i = num.length - 1; i >= 0; i--) {
			right[i] = rightPro;
			rightPro *= num[i];
		}

		for (int i = 0; i < num.length; i++) {
			result[i] = left[i] * right[i];
		}

		return result;
	}

	public static int[] solutionV1(int[] num) {
		int result[] = new int[num.length];
		// 1. Initialize the result array with 1
		result[0] = 1;
		// 2. Calculate the left product for each element
		for (int i = 1; i < num.length; i++) {
			result[i] = result[i - 1] * num[i - 1];
		}

		// 3. Calculate the right product for each element
		int right = 1;
		for (int i = num.length - 1; i >= 0; i--) {
			result[i] *= right;
			right *= num[i];
		}

		return result;
	}

}
