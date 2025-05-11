package com.dsa.array.easy;

/**
 * Finds the maximum product of any triplet in the array.
 * 
 */
public class MaxProductTriplet {

	public static void main(String[] args) {

		int[] arr = { 10, 3, 5, 6, 20 };
		int res = maxProduct(arr);
		System.out.println("Result " + res);
	}

	private static int maxProduct(int[] arr) {
		// TODO Auto-generated method stub
		int n = arr.length;
		int max = Integer.MIN_VALUE;
		for (int i = 0; i < n - 2; i++) {

			for (int j = i + 1; j < n - 1; j++) {
				for (int k = j + 1; k < n; k++) {
					max = Math.max(max, arr[i] * arr[j] * arr[k]);
				}
			}
		}

		return max;
	}

}
