package array;

public class Example2 {

	static void print(int[] a) {
		for (int i : a)
			System.out.printf("%d ", i);
	}

	static void remove(int[] a, int index) {
		for (int i = index; i < a.length - 1; i++)
			a[i] = a[i + 1];

		a[a.length - 1] = 0;
	}

	static void remove2(int[] a, int index) {
		if (index == a.length - 1) {
			a[a.length - 1] = 0;
			return;
		}
		a[index] = a[index + 1];
		remove2(a, index + 1);
	}

	public static void main(String[] args) {
		int[] a = new int[10];
		for (int i = 0; i < a.length; ++i)
			a[i] = i;

		remove2(a, 5);

		print(a);

	}

}
