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
 * The longest palindromic subsequence is the longest sequence that can be formed from the string by deleting some characters without changing the order of the remaining characters, and it reads the same forwards and backwards.
 * For example, for the string "bbabcbcab", the longest palindromic subsequence is "babcbab", which has a length of 7.
 * The minimum number of insertions required to make "bbabcbcab" a palindrome is:
 * * Minimum Insertions = Length of "bbabcbcab" - Length of LPS
 */
public class MinInsertionsToMakeStringPalindrome {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s = "geeks";

		System.out.println("recursive -> " + recursive(s, 0, s.length() - 1));
		System.out.println("tabulation -> " + tabulationMethod(s));

	}
	/*
	 * * To make a string palindrome, we can insert characters at the beginning or the
	 * end of the string. The minimum number of insertions required to make a
	 * string palindrome can be found by calculating the length of the longest
	 * palindromic subsequence (LPS) of the string. The formula is:
	 * * Minimum Insertions = Length of the string - Length of LPS
	 * * The longest palindromic subsequence is the longest sequence that can be
	 * formed from the string by deleting some characters without changing the
	 * order of the remaining characters, and it reads the same forwards and
	 * backwards.
	 * * For example, for the string "geeks", the longest palindromic subsequence is
	 * "geeg", which has a length of 4. Therefore, the minimum number of
	 * insertions required to make "geeks" a palindrome is:
	 * 	 * Minimum Insertions = Length of "geeks" - Length of LPS
	 * 	 * Minimum Insertions = 5 - 4 = 1
	 */

	private static int tabulationMethod(String s) {

		int n = s.length();
		int dp[][] = new int[n][n];

//		for (int i = 0; i < n; i++) {
//			dp[i][i] = 1; // A single character is already a palindrome
//		}

		for (int len = 2; len <= n; len++) {
			for (int start = 0; start <= n - len; start++) {
				int end = start + len - 1;

				if (s.charAt(start) == s.charAt(end)) {
					dp[start][end] = dp[start + 1][end - 1];
				} else {
					dp[start][end] = Math.min(dp[start + 1][end], dp[start][end - 1]) + 1;

				}
			}
		}

		return dp[0][n - 1];
	}

	/* 
	 * Recursive approach to find the minimum number of insertions required to make a string palindrome.
	 * This method checks characters from both ends of the string and counts insertions if they do not match, otherwise it explores both possibilities of excluding one character at a time.
	 * * @param s The input string.
	 * * @param start The starting index of the substring.
	 * * @param end The ending index of the substring.
	 * * @return The minimum number of insertions required to make the substring a palindrome.
	 * * This method uses recursion to explore all possible subsequences of the string and counts the minimum insertions needed to make it a palindrome.
	 * * The base case checks if the start index is greater than or equal to the end index, in which case it returns 0 as no insertions are needed.
	 * * If the characters at the start and end indices match, it recursively checks the substring excluding those characters.
	 */
	private static int recursive(String s, int start, int end) {

		if (start >= end) {
			return 0;
		}
		if (s.charAt(end) == s.charAt(start)) {
			return recursive(s, start + 1, end - 1);
		}

		return Math.min(recursive(s, start + 1, end), recursive(s, start, end - 1)) + 1;
	}

}
