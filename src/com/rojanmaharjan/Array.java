package com.rojanmaharjan;

public class Array {

	private int[] array;
	int count = 0;

	public Array(int length) {
		array = new int[length];
	}

	public void insert(int number) {
		resizeIfNecessary();
		array[count] = number;
		count++;
	}

	public void removeAt(int index) {
		if (index < 0 || index > count)
			throw new IllegalArgumentException();
		for (int i = index; i < count; i++)
			array[i] = array[i + 1];
		count--;
	}

	public void print() {
		for (int i = 0; i < count; i++)
			System.out.println(array[i]);
	}

	public int indexOf(int number) {
		for (int i = 0; i < array.length; i++)
			if (array[i] == number)
				return i;
		return -1;
	}

	public int max() {
		int max = array[0];
		for (int i = 1; i < count; i++) {
			if (array[i] > max) {
				max = array[i];
			}
		}
		return max;
	}

	public void resizeIfNecessary() {
		if (count == array.length) {
			int[] newArray = new int[count * 2];
			for (int i = 0; i < count; i++) {
				newArray[i] = array[i];
			}
			array = newArray;
		}
	}
}
