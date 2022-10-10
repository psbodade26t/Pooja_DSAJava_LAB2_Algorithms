package com.LAB_2ALGO.traveller;

public class BubbleSortImplementation {
	public void bubbleSort(int notes[]) {
		for (int i = 0; i < notes.length; i++) {
			for (int j = 0; j < notes.length - i - 1; j++)
				if (notes[j] < notes[j + 1]) {
					int temp = notes[j];
					notes[j] = notes[j + 1];
					notes[j + 1] = temp;
				}
		}
	}

}
