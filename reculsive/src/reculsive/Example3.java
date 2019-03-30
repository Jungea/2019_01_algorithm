package reculsive;

public class Example3 {

	static class Node {
		int value;
		Node next;

		public Node(int value, Node next) {
			this.value = value;
			this.next = next;
		}

		// Àç±Í
		public void printAll() {
			System.out.print(value + " ");
			if (next != null)
				next.printAll();
		}

		// ¹Ýº¹¹®
		public void printAll2() {
			Node temp = this;
			while (temp != null) {
				System.out.print(temp.value + " ");
				temp = temp.next;
			}
		}
	}

	public static void main(String[] args) {
		Node root = null;
		for (int i = 1; i <= 10; ++i)
			root = new Node(i, root);

		root.printAll2();
	}

}
