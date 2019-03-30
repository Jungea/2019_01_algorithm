package reculsive;

public class Example6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] a = { 1, 2, 3, 4, 5, 6, 7, 8, 9 };
		print(a, 0);

	}

	static void print(int[] a, int index) {
		if (index >= a.length)
			return;
		System.out.println(a[index]);
		print(a, index + 1);
	}
}
