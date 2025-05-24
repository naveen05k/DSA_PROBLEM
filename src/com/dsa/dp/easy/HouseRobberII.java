package com.dsa.dp.easy;

/*
 * House Robber II
 * Problem Statement: leetcode 213 House Robber II This is a variation of the House Robber problem where the houses are arranged in a circle.
 * You cannot rob the first and last house at the same time.
 * You need to find the maximum amount of money you can rob without alerting the police.
 * The problem can be solved using dynamic programming.
 * The idea is to break the problem into two cases:
 * 1. Rob from house 0 to house n-2 (excluding the last house)
 * 2. Rob from house 1 to house n-1 (excluding the first house)
 * The final answer will be the maximum of the two cases.
 * The time complexity of this solution is O(n) and the space complexity is O(1).
 * The space complexity can be reduced to O(1) by using two variables to keep track of the maximum amount of money that can be robbed from the previous two houses.
 * The function uses dynamic programming to calculate the maximum amount of money that can be robbed from the given range of houses.
 * It takes the array of house values and the start and end indices of the range as input and returns the maximum amount of money that can be robbed from that range.
 * The function uses two variables prev1 and prev2 to keep track of the maximum amount of money that can be robbed from the previous two houses.
 */
public class HouseRobberII {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] nums = { 2, 3, 2 };
		System.out.println(rob(nums)); // Output: 3

	}

	// This function calculates the maximum amount of money that can be robbed from
	// a circular array of houses
	// It takes an array of house values as input and returns the maximum amount of
	// money that can be robbed
	public static int rob(int[] nums) {
		int n = nums.length;
		if (n == 0)
			return 0;
		if (n == 1)
			return nums[0];
		if (n == 2)
			return Math.max(nums[0], nums[1]);
		// Case 1: Rob from 0 to n-2
		int case1 = rob(nums, 0, n - 2);

		// Case 2: Rob from 1 to n-1
		int case2 = rob(nums, 1, n - 1);

		return Math.max(case1, case2);

	}

	// Helper function to calculate the maximum amount of money that can be robbed
	// from a linear array of houses
	// This function uses dynamic programming to calculate the maximum amount of
	// money
	// that can be robbed from the given range of houses
	// It takes the array of house values and the start and end indices of the range
	// as input and returns the maximum amount of money that can be robbed
	// from that range
	// The function uses two variables prev1 and prev2 to keep track of the maximum
	// amount of money that can be robbed from the previous two houses
	// It iterates through the range of houses and calculates the maximum amount of
	// money that can be robbed from the current house by taking the maximum of
	public static int rob(int[] nums, int start, int end) {
		int prev1 = 0;
		int prev2 = 0;
		for (int i = start; i <= end; i++) {
			int temp = Math.max(prev1, prev2 + nums[i]);
			prev2 = prev1;
			prev1 = temp;
		}

		return prev1;
	}
}
