/*
 * �ۼ���: ������
 * �ۼ���: 2018.03.20.
 * 0306 01.�˰��� ����� �м��� ����
 */

package maxScore;

import java.util.Arrays;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		System.out.print("n = ");
		int n = scan.nextInt();

		int[] a = new int[n];
		for (int i = 0; i < n; i++)
			a[i] = scan.nextInt();

		System.out.println(Arrays.toString(a));
		System.out.println(maxScore(a));
		System.out.println(reMaxScore(a, 1, a[0]));

	}

	// n���� �л��� ���������� �ִ밪�� ã����
	// �ݺ���
	public static int maxScore(int[] a) {
		int max = a[0];
		for (int i = 1; i < a.length; i++)
			if (max < a[i])
				max = a[i];

		return max;

	}

	// ��͹�
	public static int reMaxScore(int[] a, int index, int max) {
		if (index < a.length) {
			if (a[index] > max)
				max = a[index];
			max = reMaxScore(a, index + 1, max);
		}
		return max;
	}

}
