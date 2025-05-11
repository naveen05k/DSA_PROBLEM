package com.dsa.array.easy;

import java.util.Arrays;

/**
 * Rearrange an array in such a way that positive and negative numbers are
 * placed alternatively. If there are extra positive numbers, they should be
 * placed at the end. If there are extra negative numbers, they should be placed
 * at the end.
 * 
 * @author naveen
 * @date 2023-10-05
 * @description Rearrange an array in such a way that positive and negative
 *              numbers are
 *
 */
public class AlternativePositive {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[] = { -1, 2, -3, 4, -5, 6, -7, 8 };
		solution(arr);
		System.out.println("Array after rearranging:" + Arrays.toString(arr));

	}

	/**
	 * Rearranges the array in such a way that positive and negative numbers are
	 * placed alternatively.
	 * 
	 * @param arr the input array
	 */

	/**
	 * time complexity: O(n) extra space: O(1) The function first separates the
	 * negative and positive numbers by swapping them. Then it rearranges the array
	 * by swapping the negative and positive numbers alternatively. If there are
	 * extra positive numbers, they are placed at the end.
	 */
	private static void solution(int[] arr) {
		int n = arr.length;
		int i = -1;

		for (int j = 0; j < n; j++) {
			if (arr[j] < 0) {
				i++;
				swap(arr, i, j);
			}
		}

		int neg = 0, pos = i + 1;

		while (neg < pos && pos < n && arr[neg] < 0) {
			swap(arr, neg, pos);
			neg += 2;
			pos++;
		}

	}

	/**
	 * Swaps the elements at index i and j in the array.
	 * 
	 * @param arr the input array
	 * @param i   the index of the first element
	 * @param j   the index of the second element
	 */
	public static void swap(int arr[], int i, int j) {
		int temp = arr[i];
		arr[i] = arr[j];
		arr[j] = temp;
	}

}
