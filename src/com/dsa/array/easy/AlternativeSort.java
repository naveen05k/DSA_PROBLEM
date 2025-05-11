package com.dsa.array.easy;

import java.util.Arrays;

/**
 * Rearranges the array in such a way that the largest and smallest elements are
 * placed alternately.
 * 
 * @author naveenkuamr
 * @date 2025-11-05
 * @description Rearranges the array in such a way that the largest and smallest
 *              elements are placed alternately.
 */
public class AlternativeSort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = { 7, 1, 3, 2, 6, 5, 4 };

		solution(arr);
		System.out.println("Alternately rearranged array: " + Arrays.toString(arr));

	}

	/**
	 * Rearranges the array in such a way that the largest and smallest elements are
	 * placed alternately.
	 * 
	 * @param arr the input array time complexity: O(nlogn) space complexity: O(n)
	 */
	private static void solution(int[] arr) {
		// TODO Auto-generated method stub
		Arrays.sort(arr); // 1 2 3 4 5 6 7

		int end = arr.length - 1;
		int start = 0;
		int[] temp = new int[arr.length];

		for (int i = 0; i < arr.length; i++) {
			if (i % 2 == 0) {
				temp[i] = arr[end--];
			} else {
				temp[i] = arr[start++];
			}
		}

		for (int i = 0; i < arr.length; i++) {
			arr[i] = temp[i];
		}
	}

	/**
	 * Swaps two elements in the array.
	 * 
	 * @param arr the input array
	 * @param i   the index of the first element
	 * @param j   the index of the second element
	 */
	public static void swap(int[] arr, int i, int j) {
		int temp = arr[i];
		arr[i] = arr[j];
		arr[j] = temp;
	}
}
