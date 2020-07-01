package com.rojanmaharjan;

public class Main {
	public static void main(String[] args) {
//		Array numbers = new Array(3);
//		numbers.insert(4);
//		numbers.insert(3);
//		numbers.insert(5);
//		numbers.insert(20);
//		numbers.insert(19);
//		numbers.insert(42);
//		numbers.insert(55);
//		numbers.print();
//		System.out.println(numbers.max());

		LinkedList list = new LinkedList();
		list.addFirst(3);
		list.addFirst(5);
		list.addFirst(7);
		list.addLast(20);
		list.addLast(50);
		System.out.println("Initial List:");
		list.print();
//		System.out.println("List after deletions.");
//		list.deleteFirst();
//		list.deleteLast();
//		list.deleteLast();
//		list.deleteLast();
//		list.print();

		int testNum = 20;
		System.out.println("List contains " + testNum + ": " + list.contains(testNum));
		System.out.println("Index of " + testNum + ": " + list.indexOf(testNum));

	}
}
