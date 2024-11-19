package Buoi2;
// dếm số lần xuât hiện từng phần tử của mảng và in ra phần từ có số lần xuất hiệ nhiều nhất
//		 nếu có 2 ptu có số lần ngang nhau thì in ra phần tử có giá trị nhỏ hơn

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Bai1 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		// Input the array
		System.out.print("Enter the number of elements in the array: ");
		int n = sc.nextInt();
		int[] arr = new int[n];

		System.out.println("Enter the elements of the array:");
		for (int i = 0; i < n; i++) {
			arr[i] = sc.nextInt();
		}

		// Count frequencies using a HashMap
		HashMap<Integer, Integer> frequencyMap = new HashMap<>();
		for (int num : arr) {
			frequencyMap.put(num, frequencyMap.getOrDefault(num, 0) + 1);
		}

		// Find the element with the highest frequency
		int maxFrequency = 0;
		int result = Integer.MAX_VALUE;

		for (Map.Entry<Integer, Integer> entry : frequencyMap.entrySet()) {
			int value = entry.getKey();
			int frequency = entry.getValue();

			if (frequency > maxFrequency || (frequency == maxFrequency && value < result)) {
				maxFrequency = frequency;
				result = value;
			}
		}

		// Output the result
		System.out.println("Element with the highest frequency: " + result);
		System.out.println("Frequency: " + maxFrequency);
	}
}
