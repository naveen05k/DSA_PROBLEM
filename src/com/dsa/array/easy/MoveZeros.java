package com.dsa.array.easy;

public class MoveZeros {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = { 1, 2, 0, 4, 3, 0, 5, 0 };
		pushZeroAtEnd(arr);

		for (int num : arr) {
			System.out.print(num + " ");
		}
	}

	/**
	 * Moves all zeros in the array to the end while maintaining the order of
	 * non-zero elements. This version contains a logic bug and is corrected below.
	 */
	private static void pushZeroAtEnd(int[] arr) {
		int start = 0;
		int end = arr.length;
		while (start <= end) {
			if (arr[start] == 0) {
				swap(arr, start, end);
				start++;
			}
			start++;
			end--;
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
