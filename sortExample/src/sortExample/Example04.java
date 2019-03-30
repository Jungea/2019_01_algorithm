package sortExample;

import java.util.Arrays;

public class Example04 {

	static void sort(char[] a) {
		Arrays.sort(a);
	}

	public static void main(String[] args) {
		char[] a = "hello world!".toCharArray();
		sort(a);
		System.out.println(Arrays.toString(a));
	}

}
