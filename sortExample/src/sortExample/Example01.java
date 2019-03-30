package sortExample;

import java.util.Arrays;

public class Example01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String[] a = { "zero", "one", "two", "three", "four", "five", "six", "seven" };

		selectionSort(a);
		System.out.println(Arrays.toString(a));

	}

	public static void selectionSort(String[] a) {
		for (int i = 0; i < a.length - 1; i++)
			swap(a, i, findMin(a, i));
	}

	// 배열 a에서 i 위치와 j 위치의 값을 서로 바꾼다
	public static void swap(String[] a, int i, int j) {
		String temp = a[i];
		a[i] = a[j];
		a[j] = temp;
	}

	// 배열 a의 start 위치부터 끝까지에서 가장 작은 값의 위치(index)를 리턴한다.
	public static int findMin(String[] a, int start) {
		int index = start;
		for (int i = start + 1; i < a.length; i++)
			if (a[index].compareTo(a[i]) > 0)
				index = i;

		return index;
	}

}