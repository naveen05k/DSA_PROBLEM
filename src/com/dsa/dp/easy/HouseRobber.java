package com.dsa.dp.easy;

/*
 * @author naveenkumar
 * @date 2025-15-05
 * @description : This is a classic dynamic programming problem. The problem is to find the maximum amount of money you can rob tonight without alerting the police.
 * 	
 */
public class HouseRobber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Solution is: " + solution(new int[] { 2, 7, 9, 3, 1 }));
	}
	/*
	 * Time Complexity: O(n) - The loop runs n times. Space Complexity: O(n) - The
	 * dp array stores n Fibonacci numbers.
	 */

	private static int solution(int[] num) {
		// TODO Auto-generated method stub
		if (num.length == 0) {
			return 0;
		}
		if (num.length == 1) {
			return num[0];
		}

		int dp[] = new int[num.length];
		dp[0] = num[0]; // First house
		dp[1] = Math.max(num[0], num[1]); // Max of first two houses
		for (int i = 2; i < num.length; i++) {
			dp[i] = Math.max(dp[i - 1], dp[i - 2] + num[i]);
		}

		return dp[num.length - 1];
	}

}
