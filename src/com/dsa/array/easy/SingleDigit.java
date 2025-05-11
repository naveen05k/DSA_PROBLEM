package com.dsa.array.easy;

/**
 * @author naveen
 * @date 2023-10-05
 * @description Given a number n, find the sum of its digits until the sum
 *              becomes a single digit.
 * 
 *              Example: Input: 5674 Output: 4
 */

public class SingleDigit {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int res = solution(5674);
		System.out.println(res);
	}

	/**
	 * Given a number n, find the sum of its digits until the sum becomes a single
	 * digit.
	 * 
	 * @param n
	 * @return
	 */

	/* time complexity: O(log n) */

	private static int solution(int n) {

		int sum = 0;

		while (n > 0 || sum > 9) {

			if (n == 0) {
				n = sum;
				sum = 0;
			}
			int digit = n % 10;
			sum += digit;
			n = n / 10;
		}

		return sum;
	}

}
