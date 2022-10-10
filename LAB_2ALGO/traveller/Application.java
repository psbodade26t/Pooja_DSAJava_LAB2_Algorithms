package com.LAB_2ALGO.traveller;

import java.util.Scanner;
import com.LAB_2ALGO.traveller.BubbleSortImplementation;
import com.LAB_2ALGO.traveller.NoteCountApplication;

public class Application {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the size of currency denominations");
		int size = sc.nextInt();
		int notes[] = new int[size];
		System.out.println("enter the currency denominations value ");
		for (int i = 0; i < size; i++) {
			notes[i] = sc.nextInt();
		}
		BubbleSortImplementation bb = new BubbleSortImplementation();
		bb.bubbleSort(notes);
		System.out.println("enter the amount you want to pay");
		int amount = sc.nextInt();
		NoteCountApplication ncs = new NoteCountApplication();
		ncs.notesCounter(notes, amount);

	}

}
