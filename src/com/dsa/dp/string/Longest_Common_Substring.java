package com.dsa.dp.string;
/*
 * @author: Naveenkumar
 * @date: 2025-23-05
 * @description: Longest Common Substring (LCS) is a classic problem in computer science and bioinformatics.
 * It involves finding the longest substring that is common to two sequences.
 * A substring is a contiguous sequence of characters within a string.
 * The LCS problem has applications in various fields, including text comparison, DNA sequence analysis, and version control systems.
 * There are several approaches to solve the LCS problem, including recursive, tabulation, and memoization methods.
 * The recursive approach is straightforward but inefficient for large strings due to its exponential time complexity.
 * The tabulation approach is more efficient and uses a 2D array to store the lengths of common substrings.
 */
public class Longest_Common_Substring {

	public static void main(String[] args) {
		String s1 = "abcde", s2 = "abfce";
		System.out.println("LCS (Tabulation) = " + lcsTabulation(s1, s2));
	}
/*
 *  1. Longest Common Substring 
 *  2. The longest common substring problem is a variation of the longest common subsequence problem.
 *  3. The difference is that in the longest common substring problem, we are looking for the longest contiguous substring that appears in both strings.
 *  4. This means that the characters in the substring must appear in the same order and be adjacent to each other.
 *  5. The longest common substring problem can be solved using dynamic programming.
 *  6. The idea is to create a 2D array to store the lengths of common substrings.
 *  7. We fill this array iteratively, starting from the base case where one of the strings is empty.
 *  8. The time complexity of this approach is O(m*n), where m and n are the lengths of the two strings.
 *  9. The space complexity is also O(m*n) due to the 2D array used to store the lengths of common substrings.
 *  10. The longest common substring can be found by keeping track of the maximum length found during the filling of the array.
 *  11. The longest common substring can be obtained by backtracking through the array.
 *  12. The longest common substring is the substring that appears in both strings and has the maximum length.
 *  13. The longest common substring can be used in various applications, such as DNA sequence analysis, text comparison, and plagiarism detection.
 * 
 */
	
	private static int lcsTabulation(String s1, String s2) {
		// TODO Auto-generated method stub
		int n = s1.length();
		int m = s2.length();
		int[][] dp = new int[m + 1][n + 1];
		int maxLen = 0;
		for (int i = 1; i <= m; i++) {
			for (int j = 1; j <= n; j++) {
				if (s1.charAt(j - 1) == s2.charAt(i - 1)) {
					dp[i][j] = 1 + dp[i - 1][j - 1];
					maxLen = Math.max(maxLen, dp[i][j]);
				} else {
					dp[i][j] = 0;
				}
			}
		}
		return maxLen;
	}

}
