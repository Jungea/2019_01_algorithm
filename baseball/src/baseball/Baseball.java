/*
 * �ۼ���: ������
 * �ۼ���: 2019.04.02.
 * �߱����� �ۼ�
 */

package baseball;

import java.util.Random;
import java.util.Scanner;

public class Baseball {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);

		String com; // ��ǻ�Ͱ� ������ ����
		String my; // �Է��� ����
		int bCount; // ��
		int sCount; // ��Ʈ����ũ
		String result; // ��� ���
		int opt; // ���ο� ���� ���� ���� ����

		do { // ��ü ���� �ݺ�
			com = makeCom();
			System.out.println(com);

			do { // �� ������ �ݺ�
				bCount = 0;
				sCount = 0;
				result = "";

				System.out.print("���ڸ� �Է�: ");
				my = scan.next();

				for (int i = 0; i < com.length(); i++) {
					if (my.charAt(i) == com.charAt(i)) // ��Ʈ����ũ �Ǵ�
						sCount++;
					else if (contains(com, my.charAt(i))) // �� �Ǵ�
						bCount++;
				}

				// ���� ��� ���ڿ� �����
				if (sCount == 3)
					result += "����";

				else {
					if (sCount == 0 && bCount == 0)
						result += "�ƿ�";

					else {
						if (sCount > 0)
							result += (sCount + "��Ʈ����ũ ");
						if (bCount > 0)
							result += (bCount + "��");
					}
				}
				System.out.println(result);

			} while (sCount != 3); // ����=��Ʈ����ũ3���� �� ���� ����

			System.out.print("������ ����Ͻðڽ��ϱ�? (1=���, 0=����): ");
			opt = scan.nextInt();
		} while (opt != 0); // �߱����� ����

		System.out.println("����!");
	}

	public static String makeCom() { // ��ǻ�Ͱ� ���� ���� ����
		Random random = new Random();
		String com = "";
		int value;
		char vChar;
		while (com.length() != 3) {
			value = random.nextInt(10);
			vChar = Integer.toString(value).charAt(0);
			if (!contains(com, vChar))
				com += vChar;
		}

		return com;

	}

	public static boolean contains(String s, char c) { // �ش� ���ڿ��� ���� ���� ����
		for (int i = 0; i < s.length(); i++)
			if (s.charAt(i) == c)
				return true;

		return false;
	}

}
