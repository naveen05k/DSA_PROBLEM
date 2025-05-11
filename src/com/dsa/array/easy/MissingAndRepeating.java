package com.dsa.array.easy;

/**
 * Find the missing and repeating numbers in an array of size n containing
 * numbers from 1 to n.
 * 
 * @author naveenkumar d
 * @date 2024-11-05
 * @description Find the missing and repeating numbers in an array of size n
 *              containing numbers from 1 to n.
 */
public class MissingAndRepeating {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = { 3, 1, 3 };
		int[] result = findMissingAndRepeating(arr);
		System.out.println("Missing number is: " + result[0]);
		System.out.println("Repeating number is: " + result[1]);
	}

	/**
	 * This function finds the missing and repeating numbers in an array of size n
	 * containing numbers from 1 to n.
	 * 
	 * @param arr the input array
	 * @return an array containing the missing and repeating numbers
	 * 
	 *         The function uses a frequency array to count the occurrences of each
	 *         * number in the input array. It then iterates through the frequency
	 *         array to * find the missing number (frequency 0) and the repeating
	 *         number (frequency * * greater than 1). time complexity: O(n) space
	 *         complexity: O(n)
	 */
	private static int[] findMissingAndRepeating(int[] arr) {
		// TODO Auto-generated method stub
		int freq[] = new int[arr.length + 1];
		for (int i = 0; i < arr.length; i++) {
			freq[arr[i]]++;
		}
		int res[] = new int[2];
		for (int i = 1; i < freq.length; i++) {
			if (freq[i] == 0) {
				res[0] = i;
			}
			if (freq[i] > 1) {
				res[1] = i;
			}
		}
		return res;
	}

}
