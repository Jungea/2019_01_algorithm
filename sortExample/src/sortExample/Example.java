package sortExample;

import java.util.Arrays;

public class Example {

	static void swap(int[] a, int i, int j) {
		int temp = a[i];
		a[i] = a[j];
		a[j] = temp;
	}

	static int findMax(int[] a, int end) {
		int index = end;

		for (int i = end; i >= 0; i--) {
			if (a[i] > a[index])
				index = i;
		}

		return index;
	}

	// selection sort>>최대값으로 구현
	static void selectionSort(int[] a) {
		for (int i = a.length - 1; i > 0; i--) {
			int maxIndex = findMax(a, i);
			swap(a, i, maxIndex);
		}
	}

	public static void main(String[] args) {
		int[] a = { 17, 14, 11, 19, 13, 15, 18, 12, 16, 20 };

		selectionSort(a);
		System.out.println(Arrays.toString(a));
	}

}