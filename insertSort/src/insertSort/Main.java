package insertSort;

import java.util.Arrays;

public class Main {
	public static void main(String[] args) {
		int[] a = { 17, 14, 11, 19, 13, 15 };

		insertionSort(a);
		System.out.println(Arrays.toString(a));

	}

	static void insertionSort(int[] a) {
		for (int i = 1; i < a.length; i++) {
			int value = a[i];
			int j = i;
			while (j > 0 && a[j] < a[j - 1]) {
				swap(a, j, j - 1);
				j--;
			}

			a[j] = value;
		}

	}

	public static void swap(int[] a, int i, int j) {
		int temp = a[i];
		a[i] = a[j];
		a[j] = temp;
	}
}
