package com.dsa.array.easy;

public class ReverseInGrp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[] = { 1, 2, 3, 4, 5, 6, 7, 8, 9 }, k = 3;
		reverseInGrp(arr, k);
		for (int num : arr) {
			System.out.print(num + " ");
		}

	}

	/**
	 * Reverses elements in groups of size k
	 */
	private static void reverseInGrp(int[] arr, int k) {
		// TODO Auto-generated method stub

		for (int i = 0; i < arr.length; i += k) {
			int start = i;
			int end = Math.min(i + k - 1, arr.length - 1);
			while (start < end) {
				swap(arr, start, end);
				start++;
				end--;
			}
		}

	}

	/**
	 * Swap method (no longer used in corrected logic, but kept if needed)
	 */
	public static void swap(int arr[], int i, int j) {
		int temp = arr[i];
		arr[i] = arr[j];
		arr[j] = temp;
	}
}
