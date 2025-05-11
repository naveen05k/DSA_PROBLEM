package com.dsa.array.easy;

import java.util.Arrays;

public class TopElementsFinder {

	public static void main(String[] args) {
		int[] arr = { 2, 3, 45, 56 };

		printMaxElement(arr);
		printSecondMaxElement(arr);
		printSecondMaxUsingStreams(arr);
		printThirdMaxElement(arr);
	}

	/**
	 * Prints the maximum (largest) element from the array.
	 */
	public static void printMaxElement(int[] arr) {
		int max = Integer.MIN_VALUE;
		for (int num : arr) {
			if (num > max) {
				max = num;
			}
		}
		System.out.println("Maximum Element: " + max);
	}

	/**
	 * Prints the second largest unique element from the array.
	 */
	public static void printSecondMaxElement(int[] arr) {
		int first = Integer.MIN_VALUE;
		int second = Integer.MIN_VALUE;

		for (int num : arr) {
			if (num > first) {
				second = first;
				first = num;
			} else if (num > second && num != first) {
				second = num;
			}
		}

		System.out.println("Second Largest Element: " + second);
	}

	/**
	 * Prints the third largest unique element from the array.
	 */
	public static void printThirdMaxElement(int[] arr) {
		int first = Integer.MIN_VALUE;
		int second = Integer.MIN_VALUE;
		int third = Integer.MIN_VALUE;

		for (int num : arr) {
			if (num > first) {
				third = second;
				second = first;
				first = num;
			} else if (num > second && num != first) {
				third = second;
				second = num;
			} else if (num > third && num != second && num != first) {
				third = num;
			}
		}

		System.out.println("Third Largest Element: " + third);
	}

	/**
	 * Finds and prints the second largest element using Java Streams.
	 */
	public static void printSecondMaxUsingStreams(int[] arr) {
		int secondMax = Arrays.stream(arr).distinct().boxed().sorted((a, b) -> b - a).skip(1).findFirst().orElse(-1);
		System.out.println("Second Largest using Streams: " + secondMax);
	}
}
