package com.dsa.dp.easy;
// Compare this snippet from src/com/dsa/array/medium/NumSubarrayProductLessThanK.java:

/*
 * @author naveenkumar
 * @date 2024-15-05
 * @description : 
 * Fibonacci series is a series of numbers in which each number is the sum of the two preceding ones, usually starting with 0 and 1. The Fibonacci sequence is defined by the recurrence relation:
 * F(n) = F(n-1) + F(n-2)
 * The first two numbers in the Fibonacci sequence are 0 and 1, so:
 * F(0) = 0
 * F(1) = 1
 * F(2) = F(1) + F(0) = 1
 * F(3) = F(2) + F(1) = 2
 * F(4) = F(3) + F(2) = 3
 * F(5) = F(4) + F(3) = 5
 * F(6) = F(5) + F(4) = 8
 * F(7) = F(6) + F(5) = 13
 * F(8) = F(7) + F(6) = 21
 */
public class FibonacciSeries {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n = 5; // Print first 10 Fibonacci numbers
		int[] fib = solution(n);

		System.out.print("Fibonacci Series: ");
		for (int num : fib) {
			System.out.print(num + " ");
		}
	}

	/*
	 * Time Complexity: O(n) - The loop runs n times. Space Complexity: O(n) - The
	 * dp array stores n Fibonacci numbers.
	 */
	static int[] solution(int n) {
		int dp[] = new int[n + 1];

		if (n == 0 || n == 1) {
			return new int[] { 0 };
		}
		dp[0] = 0;
		dp[1] = 1;

		for (int i = 2; i < n + 1; i++) {
			dp[i] = dp[i - 1] + dp[i - 2];
		}

		return dp;

	}

}
