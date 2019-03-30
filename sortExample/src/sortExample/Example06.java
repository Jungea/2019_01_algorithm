package sortExample;

import java.util.Arrays;

public class Example06 {
	static void sort(char[] a) {
		int count = 0;
		for (int i = 0; i < a.length; i++) {
			if (a[i] == '0')
				count++;
		}
		Arrays.fill(a, 0, count, '0');
		Arrays.fill(a, count, a.length, '1');
	}

	public static void main(String[] args) {
		char[] a = "010101110101".toCharArray();
		sort(a);
		System.out.println(Arrays.toString(a));
	}

}
