package com.dsa.array.medium;

import java.util.HashMap;
import java.util.Map;

/*
 * @author: Naveenkumar D
 * @date: 2024-11-05
 * @description: This class implements a brute-force algorithm to find the majority n/2 element 
 * in an array.
 * The algorithm iterates through the array and counts the occurrences of each element.
 * If an element's count exceeds n/2, it is returned as the majority element.
 * If no majority element is found, -1 is returned.
 * The time complexity of this algorithm is O(n^2) due to the nested loops.
 * This implementation is not optimal for large arrays.
 * The algorithm can be improved using a more efficient approach, such as the Boyer-Moore Voting Algorithm, which has a time complexity of O(n) and a space complexity of O(1).
 * 
 */
public class MajorityElementN1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int res = solutionV1(new int[] { 2, 2, 1, 1, 1, 2, 2 });
		System.out.println(res);
	}

	/**
	 * This function takes an array of integers and finds the majority element (the
	 * element that appears more than n/2 times) in the array. It uses a brute-force
	 * approach with a time complexity of O(n^2).
	 * 
	 * @param num The input array of integers
	 * @return The majority element if found, otherwise -1
	 */
	public static int solution(int[] num) {
		int majority = num.length / 2;
		// Iterate through the array to count occurrences of each element
		for (int i = 0; i < num.length; i++) {
			int count = 0;
			// Count occurrences of num[i]
			for (int j = i; j < num.length; j++) {

				if (num[i] == num[j]) {
					count++;
				}
				// If count exceeds majority, return num[i]
				if (count > majority) {
					return num[i];
				}
			}
		}
		// If no majority element is found, return -1
		return -1;
	}

	public static int solutionV1(int[] num) {

		HashMap<Integer, Integer> map = new HashMap<>();

		for (int nums : num) {
			map.put(nums, map.getOrDefault(nums, 0) + 1);
		}

		for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
			if (entry.getValue() > num.length / 2) {
				return entry.getKey();
			}
		}

		return -1;
	}

}
