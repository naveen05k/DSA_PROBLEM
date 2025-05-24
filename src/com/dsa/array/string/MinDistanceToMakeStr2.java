package com.dsa.array.string;

/*
 * 1. The problem is to find the minimum number of operations required to
 * convert one string into another.
 * 2. The operations allowed are insertion, deletion, and substitution of a
 * character.
 * 3. The problem can be solved using dynamic programming.
 * 4. We can create a 2D array to store the minimum number of operations required
 * to convert substrings of the two strings.
 * 5. The time complexity is O(m*n), where m and n are the lengths of the two
 * strings.
 * 6. The space complexity is also O(m*n) due to the 2D array used to store the
 * results.
 */
public class MinDistanceToMakeStr2 {

	public static void main(String[] args) {
		String s1 = "horse", s2 = "ros";
		System.out.println("Minimum operations required(Recursive): " + recursive(s1, s2));
		System.out.println("Minimum operations required(Tabulation): " + tabulation(s1, s2, s1.length(), s2.length()));
	}

	private static int recursive(String s1, String s2) {
		int m = s1.length();
		int n = s2.length();
		int lcs = lcsrecursive(s1, s2, m - 1, n - 1);

		int minDel = m - lcs;
		int minIns = n - lcs;
		return minDel + minIns;
	}

	private static int lcsrecursive(String s1, String s2, int i, int j) {
		if (i < 0 || j < 0) {
			return 0;
		}
		if (s1.charAt(i) == s2.charAt(j)) {
			return 1 + lcsrecursive(s1, s2, i - 1, j - 1);
		}
		return Math.max(lcsrecursive(s1, s2, i - 1, j), lcsrecursive(s1, s2, i, j - 1));
	}

	private static int tabulation(String s1, String s2, int n, int m) {
		// TODO Auto-generated method stub
		int lcs = lcsTabulation(s1, s2, n, m);
		int minDel = n - lcs;
		int minIns = m - lcs;

		return minDel + minIns;

	}

	private static int lcsTabulation(String s1, String s2, int n, int m) {
		// TODO Auto-generated method stub
		int dp[][] = new int[n + 1][m + 1];
		for (int i = 1; i <= n; i++) {
			for (int j = 1; j <= m; j++) {
				if (s1.charAt(i - 1) == s2.charAt(j - 1)) {
					dp[i][j] = 1 + dp[i - 1][j - 1];
				} else {
					dp[i][j] = Math.max(dp[i][j - 1], dp[i - 1][j]);
				}
			}
		}
		return dp[n][m];
	}
}
