package com.dsa.array.easy;

public class RotateArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[] = { 1, 2, 3, 4, 5 };
		rotateArray(arr, 2);
		for (int num : arr) {
			System.out.print(num + " ");
		}
	}

	public static void rotateArray(int[] nums, int k) {
		int n = nums.length;
		k = k % n;

		reverse(nums, 0, n - 1); // 5 4 3 2 1
		reverse(nums, 0, k - 1);// 4 5 3 2 1
		reverse(nums, k, n - 1);//
	}

	public static void reverse(int arr[], int i, int j) {
		while (i < j) {
			int temp = arr[i];
			arr[i++] = arr[j];
			arr[j--] = temp;
		}
	}

	public static void rotateArrayV1(int arr[], int k) {

		for (int j = 0; j < k; j++) {
			int last = arr[0];
			for (int i = 0; i < arr.length - 1; i++) {
				arr[i] = arr[i + 1];
			}

			arr[arr.length - 1] = last;
		}
	}

}
