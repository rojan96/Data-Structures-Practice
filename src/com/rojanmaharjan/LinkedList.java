package com.rojanmaharjan;

public class LinkedList {
	private class Node {
		private int value;
		private Node next;

		public Node(int value) {
			this.value = value;
		}
	}

	private Node first;
	private Node last;

	private boolean isEmpty() {
		return first == null;
	}

	public void addFirst(int number) {
		Node node = new Node(number);
		if (!isEmpty()) {
			node.next = first;
			first = node;
		} else {
			first = node;
			last = node;
		}

	}

	public void addLast(int number) {
		Node node = new Node(number);

		if (!isEmpty()) {
			last.next = node;
			last = node;
		} else {
			last = node;
			first = node;
		}
		node.next = null;
	}

	public void deleteFirst() {
		if (first != null) {
			Node node = first.next;
			first.next = null;
			first = node;
		}
	}

	public void deleteLast() {
		Node node = first;
		Node previous = null;
		while (node != null) {
			if (node.next != null) {
				previous = node;
				node = node.next;
			} else {
				last = previous;
				previous.next = null;
				break;
			}
		}
	}

	public boolean contains(int number) {
		return indexOf(number) != -1;
	}

	public int indexOf(int number) {
		Node node = first;
		int index = 0;
		while (node != null) {
			if (node.value == number) {
				return index;
			}
			index++;
			node = node.next;
		}
		return -1;
	}

	public void print() {
		Node node = first;
		while (node != null) {
			System.out.println(node.value);
			node = node.next;
		}
	}
}
