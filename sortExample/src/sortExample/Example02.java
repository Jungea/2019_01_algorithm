package sortExample;

import java.util.Arrays;
import java.util.Comparator;

public class Example02 {
	public static void main(String[] args) {
		Person[] a = new Person[] { new Person("홍길동", 18), new Person("임꺽정", 22), new Person("이몽룡", 17),
				new Person("전우치", 23), new Person("심청", 16), new Person("연흥부", 38) };
		selectionSort(a, new PersonNameComparator());
		System.out.println(Arrays.toString(a));

	}

	public static void selectionSort(Person[] a, Comparator<Person> comparator) {
		for (int i = 0; i < a.length - 1; i++)
			swap(a, i, findMin(a, i, comparator));
	}

// 배열 a에서 i 위치와 j 위치의 값을 서로 바꾼다
	public static void swap(Person[] a, int i, int j) {
		Person temp = a[i];
		a[i] = a[j];
		a[j] = temp;
	}

// 배열 a의 start 위치부터 끝까지에서 가장 작은 값의 위치(index)를 리턴한다.
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
		// 먼저 이름(name)을 비교한다.
		if (r != 0)
			return r;

		// 이름이 같지 않다면, 이름 비교 결과를 리턴한다.
		return p1.age - p2.age;
		// 이름이 같다면, 나이(age) 비교 결과를 리턴한다.
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
