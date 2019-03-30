package sortExample;

import java.util.Arrays;
import java.util.Comparator;

public class Example02 {
	public static void main(String[] args) {
		Person[] a = new Person[] { new Person("ȫ�浿", 18), new Person("�Ӳ���", 22), new Person("�̸���", 17),
				new Person("����ġ", 23), new Person("��û", 16), new Person("�����", 38) };
		selectionSort(a, new PersonNameComparator());
		System.out.println(Arrays.toString(a));

	}

	public static void selectionSort(Person[] a, Comparator<Person> comparator) {
		for (int i = 0; i < a.length - 1; i++)
			swap(a, i, findMin(a, i, comparator));
	}

// �迭 a���� i ��ġ�� j ��ġ�� ���� ���� �ٲ۴�
	public static void swap(Person[] a, int i, int j) {
		Person temp = a[i];
		a[i] = a[j];
		a[j] = temp;
	}

// �迭 a�� start ��ġ���� ���������� ���� ���� ���� ��ġ(index)�� �����Ѵ�.
	public static int findMin(Person[] a, int start, Comparator<Person> comparator) {
		int index = start;
		for (int i = start + 1; i < a.length; i++)
			if (comparator.compare(a[index], a[i]) > 0)
				index = i;

		return index;
	}
}

class PersonNameComparator implements Comparator<Person> {
	@Override
	public int compare(Person p1, Person p2) {
		int r = p1.name.compareTo(p2.name);
		// ���� �̸�(name)�� ���Ѵ�.
		if (r != 0)
			return r;

		// �̸��� ���� �ʴٸ�, �̸� �� ����� �����Ѵ�.
		return p1.age - p2.age;
		// �̸��� ���ٸ�, ����(age) �� ����� �����Ѵ�.
	}
}

class Person {
	String name;
	int age;

	public Person(String name, int age) {
		this.name = name;
		this.age = age;
	}

	public String getName() {
		return name;
	}

	public int getAge() {
		return age;
	}

	@Override
	public boolean equals(Object obj) {
		if ((obj instanceof Person) == false)
			return false;
		Person p = (Person) obj;
		return (this.name == null ? p.name == null : this.name.equals(p.name)) && this.age == p.age;
	}

	@Override
	public String toString() {
		return String.format("Person{name=\"%s\", age=%d}", name, age);
	}
}
