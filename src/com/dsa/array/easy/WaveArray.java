package com.dsa.array.easy;

import java.util.Arrays;

/**
 * @author naveen05k (naveenkumar D)
 * 
 *         Given an array of integers, sort the array into a wave-like array and
 *         return it. An array arr[0], arr[1], arr[2], ... is a wave if:
 * 
 *         arr[0] >= arr[1] <= arr[2] >= arr[3] <= arr[4] >= arr[5] ...
 * 
 *         You may assume the input array is always valid, no empty array will
 *         be given.
 *
 */
public class WaveArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[] = { 1, 2, 3, 4, 5 };
		solution(arr);
		System.out.print(Arrays.toString(arr));
	}

	/**
	 * @param arr
	 * 
	 *            1. Sort the array
	 * 
	 *            2. Swap adjacent elements in pairs
	 * 
	 *            3. Return the modified array
	 */
	private static void solution(int arr[]) {

		Arrays.sort(arr);
		for (int i = 0; i < arr.length - 1; i += 2) {
			swap(arr, i, i + 1);
		}

	}

	public static void swap(int[] arr, int i, int j) {
		int temp = arr[i];
		arr[i] = arr[j];
		arr[j] = temp;
	}

}
