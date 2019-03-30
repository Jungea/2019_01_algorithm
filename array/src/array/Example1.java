package array;

public class Example1 {

	static void print(int[] a) {
		for (int i : a)
			System.out.printf("%d ", i);
	}

	static void insert(int[] a, int index, int value) {
		for (int i = a.length - 1; i > index; i--)
			a[i] = a[i - 1];
		a[index] = value;
	}

	static void insert2(int[] a, int index, int value) {
		reculInsert(a, index, a.length - 1);
		a[index] = value;
	}

	static void reculInsert(int[] a, int index, int i) {
		if (i > index)
			return;
		a[i] = a[i - 1];
	}

	static void insert3(int[] a, int index, int value) {
		if (index >= a.length)
			return; // ���ȣ�� ���� ���� ����
		insert(a, index + 1, a[index]); // ���� �ܰ� �۾� ���ȣ��
		a[index] = value; // ���� �ܰ� �۾� ����
	}

	public static void main(String[] args) {
		int[] a = new int[10];
		for (int i = 0; i < a.length; ++i)
			a[i] = i;

		insert3(a, 5, -99);

		print(a);
	}

}
