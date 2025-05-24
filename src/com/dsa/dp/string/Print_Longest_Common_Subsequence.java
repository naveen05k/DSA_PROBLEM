package com.dsa.dp.string;

public class Print_Longest_Common_Subsequence {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s1 = "abcde";
		String s2 = "ace";
		String result = printLcs(s1, s2);
		System.out.println("LCS is: " + result);
	}

	private static String printLcs(String s1, String s2) {
		// TODO Auto-generated method stub
		int m = s1.length();
		int n = s2.length();

		int[][] dp = new int[m + 1][n + 1];

		// Step 1: Fill the DP table
		for (int i = 1; i <= m; i++) {
			for (int j = 1; j <= n; j++) {
				if (s1.charAt(i - 1) == s2.charAt(j - 1)) {
					dp[i][j] = 1 + dp[i - 1][j - 1];
				} else {
					dp[i][j] = Math.max(dp[i - 1][j], dp[i][j - 1]);
				}
			}
		}

		// Step 2: Backtrack to find the LCS characters
		int index = dp[m][n];
		char[] lcs = new char[index]; // Array to store LCS
		int i = m, j = n;

		while (i > 0 && j > 0) {
			// If current characters match, include it in LCS
			if (s1.charAt(i - 1) == s2.charAt(j - 1)) {
				lcs[index - 1] = s1.charAt(i - 1); // Store the character
				i--;
				j--;
				index--; // Move to the next character in LCS
			} else if (dp[i - 1][j] > dp[i][j - 1]) {
				i--; // Move up in the DP table
			} else {
				j--; // Move left in the DP table
			}
		}
		return new String(lcs); // Convert char array to string
	}

}
