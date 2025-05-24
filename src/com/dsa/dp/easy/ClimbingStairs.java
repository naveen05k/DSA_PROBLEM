package com.dsa.dp.easy;

/*
 * @author naveenkumar
 * @date 2024-15-05
 * @description : 
 * You are climbing a staircase. It takes n steps to reach the top.
 * Each time you can either climb 1 or 2 steps. In how many distinct ways can you climb to the top?
 * 
 * Example 1:
 * Input: n = 2
 * Output: 2
 * Explanation: There are two ways to climb to the top:
 * 1. 1 step + 1 step
 * 2. 2 steps
 * Example 2:
 * Input: n = 3
 * Output: 3
 * Explanation: There are three ways to climb to the top:
 * 1. 1 step + 1 step + 1 step
 * 2. 1 step + 2 steps
 * 3. 2 steps + 1 step
 * 
 */
public class ClimbingStairs {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Result is: " + solutionV1(7));
	}

	/*
	 * Time Complexity: O(n) - The loop runs n times. Space Complexity: O(1) - Only
	 * two variables are used to store the previous two Fibonacci numbers.
	 */
	public static int solutionV1(int n) {
		if (n == 0 || n == 1) {
			return 1;
		}

		int a = 1, b = 1;
		for (int i = 2; i < n + 1; i++) {
			int temp = a + b;
			a = b;
			b = temp;
		}
		return b; // b will be the nth Fibonacci number
	}

	/*
	 * Time Complexity: O(n) - The loop runs n times. Space Complexity: O(n) - The
	 * dp array stores n Fibonacci numbers.
	 */
	public static int solution(int n) {
		// TODO Auto-generated method stub

		int dp[] = new int[n + 1];

		if (n == 0 || n == 1) {
			return 1;
		}

		dp[0] = 1; // 1 way to climb 0 stairs
		dp[1] = 1; // 1 way to climb 1 stairs

		for (int i = 2; i < n + 1; i++) {
			dp[i] = dp[i - 1] + dp[i - 2];
		}

		return dp[n];
	}

}
