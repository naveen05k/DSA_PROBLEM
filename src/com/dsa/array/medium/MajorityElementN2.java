package com.dsa.array.medium;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/*	
 * @author: Naveenkumar D
 * @date: 2024-11-05
 * @description: This class implements a brute-force algorithm to find the majority n/3 element
 * in an array.
 * The algorithm iterates through the array and counts the occurrences of each element.
 * If an element's count exceeds n/3, it is returned as the majority element.
 * If no majority element is found, -1 is returned.
 * The time complexity of this algorithm is O(n^2) due to the nested loops.
 * This implementation is not optimal for large arrays.
 * The algorithm can be improved using a more efficient approach, such as the Boyer-Moore Voting Algorithm, which has a time complexity of O(n) and a space complexity of O(1).
 *
 */
public class MajorityElementN2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Integer> res = solution(new int[] { 1, 2 });
		System.out.println(res);

	}

	/*
	 * * This function takes an array of integers and finds the majority element
	 * (the * element that appears more than n/3 times) in the array. It uses a
	 * brute-force * approach with a time complexity of O(n^2).
	 * 
	 */
	private static List<Integer> solution(int[] num) {
		int majority = num.length / 3;
		List<Integer> list = new ArrayList<>();
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
					list.add(num[i]);
				}
			}
		}
		// If no majority element is found, return -1
		return list;
	}

	/**
	 * This function takes an array of integers and finds the majority element (the
	 * element that appears more than n/3 times) in the array. It uses a HashMap to
	 * count occurrences of each element.
	 * 
	 * @param num The input array of integers
	 * @return The majority element if found, otherwise -1
	 */
	public static List<Integer> solutionV1(int[] num) {

		HashMap<Integer, Integer> map = new HashMap<>();
		List<Integer> list = new ArrayList<>();
		for (int nums : num) {
			map.put(nums, map.getOrDefault(nums, 0) + 1);
		}

		for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
			if (entry.getValue() > num.length / 3) {
				list.add(entry.getKey());
			}
		}

		return list;
	}
}
