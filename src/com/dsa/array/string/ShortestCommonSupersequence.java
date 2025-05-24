package com.dsa.array.string;

public class ShortestCommonSupersequence {
	public static void main(String[] args) {
		String s1 = "abac", s2 = "cab";
		System.out
				.println("shortest Common Subsequence length: " + recursive(s1, s2, s1.length() - 1, s2.length() - 1));
		System.out.println("LCS length: " + tabulation(s1, s2));
	}

	private static String tabulation(String s1, String s2) {
		// TODO Auto-generated method stub
		return null;
	}

	private static int recursive(String s1, String s2, int start, int end) {
		// TODO Auto-generated method stub

		if (start < 0 || end < 0) {
			return 0;
		}

		if (s1.charAt(start) == s2.charAt(end)) {
			return 1 + recursive(s1, s2, start - 1, end - 1);
		}
		return 1+ Math.min(recursive(s1, s2, start - 1, end), recursive(s1, s2, start, end - 1));
	}
}
