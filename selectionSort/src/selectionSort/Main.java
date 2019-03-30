package selectionSort;

import java.util.Arrays;

public class Main {
	public static void main(String[] args) {
		int[] a = { 2, 4 };

		System.out.println(Arrays.toString(a));
		swap(a, 0, 1);
		System.out.println(Arrays.toString(a));
		System.out.println();

		int[] a1 = { 17, 14, 11, 19 };
		int[] a2 = { -17, -14, -11, -19 };

		int minIndex = findMin(a1);
		System.out.println(a1[minIndex]);

		minIndex = findMin(a2);
		System.out.println(a2[minIndex]);
		System.out.println();

		int[] a3 = { 14, 11, 13, 15 };

		for (int i = 0; i < a3.length; ++i) {
			int minIndex1 = findMin(a3, i);
			System.out.println(a3[minIndex1]);
		}
		System.out.println();

		int[] a4 = { 17, 14, 11, 19, 13, 15, 18, 12, 16, 20 };
		selectionSort(a4);
		System.out.println(Arrays.toString(a4));

	}

	public static void selectionSort(int[] a) {
		for (int i = 0; i < a.length - 1; i++)
			swap(a, i, findMin(a, i));
	}

	public static void rSelectionSort(int[] a) {
		for (int i = a.length - 1; i > 0; i--) {
			int index = 0;
			for (int j = 1; j <= i; j++)
				if (a[index] < a[j])
					index = j;
			swap(a, index, i);
		}
	}

	// 배열 a에서 i 위치와 j 위치의 값을 서로 바꾼다
	public static void swap(int[] a, int i, int j) {
		int temp = a[i];
		a[i] = a[j];
		a[j] = temp;
	}

	// 배열 a에서 가장 작은 값의 위치(index)를 리턴한다.
	public static int findMin(int[] a) {
		int index = 0;
		for (int i = 1; i < a.length; i++)
			if (a[index] > a[i])
				index = i;

		return index;
	}

	// 배열 a의 start 위치부터 끝까지에서 가장 작은 값의 위치(index)를 리턴한다.
	public static int findMin(int[] a, int start) {
		int index = start;
		for (int i = start + 1; i < a.length; i++)
			if (a[index] > a[i])
				index = i;

		return index;
	}

}
