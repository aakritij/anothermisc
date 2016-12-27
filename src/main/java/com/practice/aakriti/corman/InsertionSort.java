package com.practice.aakriti.corman;

public class InsertionSort {

	public void sort(Integer[] myArray) {
		Integer key = null;
		for (int j = 1; j < myArray.length; j++) {
			key = myArray[j];
			int i = j - 1;
			while (i > 0 && myArray[i] > key) {
				myArray[i + 1] = myArray[i];
				i--;
			}
			myArray[i + 1] = key;
		}
	}
}
