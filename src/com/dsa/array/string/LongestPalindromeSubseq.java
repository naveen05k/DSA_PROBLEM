package com.dsa.array.string;

/*
 * @author: Naveenkumar 
 * @date: 24-05-2025
 * Longest Palindromic Subsequence (LPS) is a classic problem in dynamic programming.
 * It involves finding the longest subsequence of a given string that is also a palindrome.
 * A subsequence is a sequence that can be derived from another sequence by deleting some or no elements without changing the order of the remaining elements.
 * A palindrome is a word, phrase, number, or other sequence of characters which reads the same backward as forward.
 * The problem can be solved using recursion or dynamic programming techniques such as memoization or tabulation.
 * The recursive approach explores all possible subsequences, while the dynamic programming approach builds a table to store results of subproblems to avoid redundant calculations.
 * The time complexity of the recursive approach is O(2^n), where n is the length of the string, while the dynamic programming approach has a time complexity of O(n^2) and a space complexity of O(n^2) for the table used to store results.
 */
public class LongestPalindromeSubseq {

	public static void main(String[] args) {
		System.out.println("LPS Recursive " + recursive("bbabcbcab"));
		System.out.println("LPS Recursive " + tabulationMethod("bbabcbcab"));
	}

	/**
	 * Longest Palindromic Subsequence
	 * 
	 * A subsequence is a sequence that can be derived from another sequence by
	 * deleting some or no elements without changing the order of the remaining
	 * elements.
	 * 
	 * A palindrome is a word, phrase, number, or other sequence of characters which
	 * reads the same backward as forward.
	 * 
	 * @param s
	 * @return
	 */
	private static int tabulationMethod(String s) {
		// TODO Auto-generated method stub
		int n = s.length();
		int dp[][] = new int[n][n];

		for (int i = 0; i < n; i++) {
			dp[i][i] = 1;
		}

		for (int len = 2; len <= n; len++) {
			for (int start = 0; start <= n - len; start++) {
				int end = start + len - 1;
				if (s.charAt(start) == s.charAt(end)) {
					dp[start][end] = 2 + dp[start + 1][end - 1];
				} else {
					dp[start][end] = Math.max(dp[start + 1][end], dp[start][end - 1]);
				}
			}
		}

		return dp[0][n - 1];
	}

	/**
	 * Recursive approach to find the longest palindromic subsequence.
	 * 
	 * This method checks characters from both ends of the string and counts them if
	 * they match, otherwise it explores both possibilities of excluding one
	 * character at a time.
	 * 
	 * @param s The input string.
	 * @return The length of the longest palindromic subsequence.
	 */
	public static int recursive(String s) {
		int m = s.length();
		return recursiveHelper(s, 0, m - 1);
	}

	private static int recursiveHelper(String s, int m, int n) {

		if (m > n) {
			return 0;
		}

		if (m == n) {
			return 1;
		}
		if (s.charAt(m) == s.charAt(n)) {
			return 2 + recursiveHelper(s, m + 1, n - 1);
		}

		return Math.max(recursiveHelper(s, m + 1, n), recursiveHelper(s, m, n - 1));

	}

}
