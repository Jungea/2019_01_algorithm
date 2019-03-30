package bubbleSort;

import java.util.Arrays;

public class Main {
	public static void main(String[] args) {
		int[] a4 = { 17, 14, 11, 19, 13, 15, 18, 12, 16, 20 };
		bubbleSort(a4);
		betterBubbleSort(a4);
		System.out.println(Arrays.toString(a4));
	}

	public static void bubbleSort(int[] a) {
		for (int i = a.length - 1; i > 0; i--) {
			for (int j = 0; j < i; j++) {
				if (a[j] > a[j + 1])
					swap(a, j, j + 1);
			}
		}
	}

	public static void betterBubbleSort(int[] a) {
		for (int i = a.length - 1; i > 0; i--) {
			boolean check = true;
			for (int j = 0; j < i; j++) {
				System.out.println(j);
				if (a[j] > a[j + 1]) {
					swap(a, j, j + 1);
					check = false;
				}
			}
			if (check)
				return;
		}
	}

	// 배열 a에서 i 위치와 j 위치의 값을 서로 바꾼다
	public static void swap(int[] a, int i, int j) {
		int temp = a[i];
		a[i] = a[j];
		a[j] = temp;
	}
}
