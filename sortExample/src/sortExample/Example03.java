package sortExample;

import java.util.Arrays;
import java.util.Random;

public class Example03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Random random = new Random();
		int[] a = new int[20];
		for (int i = 0; i < a.length; ++i)
			a[i] = random.nextInt(20);

		division(a);
		System.out.println(Arrays.toString(a));
	}

	public static void division(int[] a) {
		int front = 0;
		int end = a.length;

		while (front < end) {
			if (a[front] % 2 == 0)
				front++;
			else
				swap(a, --end, front);
		}
	}

	public static void swap(int[] a, int i, int j) {
		int temp = a[i];
		a[i] = a[j];
		a[j] = temp;
	}

}
