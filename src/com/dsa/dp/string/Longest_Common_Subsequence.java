package com.dsa.dp.string;

/*
 * @author: Naveenkumar
 * @date: 2025-23-05
 * @description: Longest Common Subsequence (LCS) is a classic problem in computer science and bioinformatics.
 * It involves finding the longest subsequence that is common to two sequences.
 * A subsequence is a sequence that can be derived from another sequence by deleting some elements without changing the order of the remaining elements.
 * The LCS problem has applications in various fields, including text comparison, DNA sequence analysis, and version control systems.
 * There are several approaches to solve the LCS problem, including recursive, tabulation, and memoization methods.
 * The recursive approach is straightforward but inefficient for large strings due to its exponential time complexity.
 * The tabulation approach is more efficient and uses a 2D array to store the lengths of common subsequences.
 */
public class Longest_Common_Subsequence {

	public static void main(String[] args) {

		String s1 = "abcde", s2 = "ace";
		System.out.println("LCS length: " + recursive(s1, s2, s1.length() - 1, s2.length() - 1));
		System.out.println("LCS length: " + tabulation(s1, s2));
	}

	/*
	 * * 1. Recursive approach 2. The recursive approach is a straightforward way to
	 * solve the LCS problem. 3. It involves checking if the last characters of both
	 * strings match. 4. If they do, we add 1 to the result of the LCS of the
	 * remaining characters. 5. If they don't match, we take the maximum of the LCS
	 * of the two strings with one character removed from either string. 6. This
	 * process continues recursively until we reach the base case where one of the
	 * strings is empty. 7. The time complexity of this approach is O(2^n), where n
	 * is the length of the longer string. 8. This is because we are exploring all
	 * possible combinations of characters in both strings. 9. The space complexity
	 * is O(n) due to the recursion stack. 10. This approach is not efficient for
	 * large strings, but it is easy to understand and implement.
	 * 
	 */
	private static int recursive(String s1, String s2, int start, int end) {

		if (start < 0 || end < 0) {
			return 0;
		}
		if (s1.charAt(start) == s2.charAt(end)) {
			return 1 + recursive(s1, s2, start - 1, end - 1);
		}
		return Math.max(recursive(s1, s2, start - 1, end), recursive(s1, s2, start, end - 1));
	}

	/*
	 * 1. Tabulation approach
	 * 2. The tabulation approach is a bottom-up dynamic programming technique.
	 * 3. It involves creating a 2D array to store the LCS lengths of all possible pairs of prefixes of the two strings. 
	 * 4. We fill this array iteratively, starting from the base case where one of the strings is empty. 
	 * 5. The time complexity of this approach is O(m*n), where m and n are the lengths of the two strings. 
	 * 6. The space complexity is also O(m*n) due to the 2D array used to store the LCS lengths.
	 */
	private static int tabulation(String s1, String s2) {
		// TODO Auto-generated method stub

		int n = s1.length();
		int m = s2.length();
		int[][] dp = new int[m + 1][n + 1];

		for (int i = 1; i <= m; i++) {
			for (int j = 1; j <= n; j++) {

				if (s1.charAt(j - 1) == s2.charAt(i - 1)) {
					dp[i][j] = 1 + dp[i - 1][j - 1];
				} else {
					dp[i][j] = Math.max(dp[i - 1][j], dp[i][j - 1]);
				}
			}
		}

		return dp[m][n];
	}

}
