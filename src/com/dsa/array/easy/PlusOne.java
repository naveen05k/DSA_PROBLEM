package com.dsa.array.easy;

import java.util.Arrays;

public class PlusOne {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[] = { 3, 4, 5 };
		int res[] = solution(arr);
		System.out.print(Arrays.toString(res));
	}

	private static int[] solution(int[] arr) {
		for (int i = arr.length - 1; i >= 0; i--) {
			arr[i]++;// 4
			System.out.println(arr[i]);
			if (arr[i] < 10) {
				return arr;
			} else {
				arr[i] = 0;
			}
		}
		int res[] = new int[arr.length + 1];
		res[0] = 1;
		return res;
	}

}
