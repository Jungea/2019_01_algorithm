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

	// �迭 a���� i ��ġ�� j ��ġ�� ���� ���� �ٲ۴�
	public static void swap(String[] a, int i, int j) {
		String temp = a[i];
		a[i] = a[j];
		a[j] = temp;
	}

	// �迭 a�� start ��ġ���� ���������� ���� ���� ���� ��ġ(index)�� �����Ѵ�.
	public static int findMin(String[] a, int start) {
		int index = start;
		for (int i = start + 1; i < a.length; i++)
			if (a[index].compareTo(a[i]) > 0)
				index = i;

		return index;
	}

}