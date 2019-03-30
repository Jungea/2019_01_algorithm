package reculsive;

import java.util.Scanner;

public class Example7a {
	static void print1(int n) {
		for (int i = 0; i < n; ++i) {
			for (int j = 0; j <= i; ++j)
				System.out.print("*");
			System.out.println();
		}
	}

	static void print2(int n, int i, int j) {
		if (i == n)
			return;
		if (j < i + 1) {
			System.out.println();
			print2(n, i + 1, 0);
			return;
		}
		System.out.print("*");
		print2(n, i, j + 1);
	}

	public static void main(String[] args) {
		try (Scanner scanner = new Scanner(System.in)) {
			System.out.print("�� ���� �Է��Ͻÿ�: ");
			int n = scanner.nextInt();
			print1(n);
			System.out.println();
			print2(n, 0, 0);
		}
	}

}