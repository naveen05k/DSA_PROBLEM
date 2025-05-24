package com.dsa.array.medium;

public class NumSubarrayProductLessThanK {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num[] = { 10, 5, 2, 6 };
		int k = 100;
		System.out.println(solution(num, k));

	}

	private static int solution(int[] num, int k) {

		int count = 0;
		int pro = 1;
		int start = 0;
		int end = 0;

		while (end < num.length) {
			pro *= num[end];

			while (pro >= k) {
				pro /= num[start];
				start++;
			}
			count += end - start + 1;
			end++;
		}

		return count;
	}

}
