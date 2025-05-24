package com.dsa.array.string;
/*
 * @author: Naveenkumar
 * @date: 2025-23-05
 * @description: Edit Distance is a classic problem in computer science that involves finding the minimum number of operations required to convert one string into another.
 * The operations allowed are insertion, deletion, and substitution of a character.
 * The problem can be solved using dynamic programming, where we create a 2D array to store the minimum number of operations required to convert substrings of the two strings.
 */
public class EditDistance {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String word1 = "horse", word2 = "ros";
		System.out.println("Minimum operations required: " + minDistance(word1, word2));
		// Output: 3

	}
/*
 * 1. The problem is to find the minimum number of operations required to convert one string into another.
 * 2. The operations allowed are insertion, deletion, and substitution of a character.
 * 3. The problem can be solved using dynamic programming.
 * 4. We can create a 2D array to store the minimum number of operations required to convert substrings of the two strings.
 * 5. The time complexity is O(m*n), where m and n are the lengths of the two strings.
 * 6. The space complexity is also O(m*n) due to the 2D array used to store the results.
 * 7. The approach involves filling the 2D array based on the following rules:
 * 
 */
	public static int minDistance(String word1, String word2) {
		int m = word1.length();
		int n = word2.length();
		int dp[][] = new int[m + 1][n + 1];

		for (int i = 0; i <= m; i++) {
			dp[i][0] = i;
		}
		for (int j = 0; j <= n; j++) {
			dp[0][j] = j;
		}

		for (int i = 1; i <= m; i++) {
			for (int j = 1; j <= n; j++) {
				if (word1.charAt(i - 1) == word2.charAt(j - 1)) {
					dp[i][j] = dp[i - 1][j - 1];
				} else {
					dp[i][j] = 1 + Math.min(dp[i][j - 1], Math.min(dp[i - 1][j - 1], dp[i - 1][j]));
				}
			}
		}
		return dp[m][n];

	}

}
