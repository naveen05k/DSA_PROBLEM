package com.dsa.array.medium;

import java.util.Arrays;

/**
 * @author: Naveenkumar D
 * @date: 2024-11-05
 * @description: This class implements the next permutation algorithm, which
 *               generates The NextPermutation class provides a method to find
 *               the next lexicographical permutation of a given array of
 *               integers. It modifies the input array in place to represent the
 *               next permutation.
 * 
 *               The algorithm works by first finding the rightmost pair of
 *               elements where the first element is less than the second. This
 *               is called the pivot. Then, it finds the smallest element to the
 *               right of the pivot that is larger than the pivot and swaps
 *               them. Finally, it reverses the subarray to the right of the
 *               pivot to get the next permutation.
 */
public class NextPermutation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int nums[] = { 4, 3, 2, 1 };
		System.out.println("Original: " + Arrays.toString(nums));
		nextPermutation(nums);
		System.out.println("Next Permutation: " + Arrays.toString(nums));

	}

	/**
	 * This function takes an array of integers and generates the next
	 * lexicographical permutation of the array. It modifies the input array in
	 * place to represent the next permutation.
	 * 
	 * @param nums The input array of integers
	 */
	public static void nextPermutation(int[] nums) {

		int n = nums.length;
		int pivot = -1;
		for (int i = n - 2; i >= 0; i--) {
			if (nums[i] < nums[i + 1]) {
				pivot = i;
				break;
			}

		}

		/*
		 * If the pivot is -1, it means the array is in descending order, so we reverse
		 * the entire array to get the smallest permutation.
		 */
		if (pivot == -1) {
			reverse(nums, 0, n - 1);
			return;
		}

		for (int i = n - 1; i > pivot; i--) {
			if (nums[i] > nums[pivot]) {
				swap(nums, i, pivot);
				break;
			}
		}

		// Reverse the subarray from pivot + 1 to the end of the array
		reverse(nums, pivot + 1, n - 1);

	}

	/**
	 * This function takes an array of integers and generates the next
	 * lexicographical permutation of the array. It modifies the input array in
	 * place to represent the next permutation.
	 * 
	 * @param nums  The input array of integers
	 * @param start The starting index of the subarray to be reversed
	 * @param end   The ending index of the subarray to be reversed
	 */

	public static void reverse(int[] nums, int start, int end) {
		while (start < end) {
			swap(nums, start, end);
			start++;
			end--;
		}
	}

	/**
	 * This function takes an array of integers and generates the next
	 * lexicographical permutation of the array. It modifies the input array in
	 * place to represent the next permutation.
	 * 
	 * @param nums The input array of integers
	 */

	public static void swap(int[] nums, int i, int j) {
		int temp = nums[i];
		nums[i] = nums[j];
		nums[j] = temp;
	}

}
