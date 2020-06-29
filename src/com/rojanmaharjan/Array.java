package com.rojanmaharjan;

import java.util.Collections;

public class Array {
	
	int [] array;
	int count = 0;
	Array(int length){
		array = new int [length];
	}
	
	public void insert(int number) {
		array[count++] = number;
	}
	
	public void removeAt(int index) {
		for(int i = index; i-1<array.length; i++) {
			array[i+1] = array[i];
		}
	}
	
	public void print() {
		for (int i=0; i<array.length; i++) {
			System.out.println(array[i]);
		}
	}
	
	public int indexOf(int number) {
		for (int i = 0; i<array.length; i++) {
			if (array[i]==number)
				return i;
		}
		return -1;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Array numbers = new Array(3);
		numbers.insert(4);
		numbers.insert(5);
		numbers.insert(6);
		numbers.insert(7);
		numbers.print();
		
	}
	

}
