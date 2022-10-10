package com.LAB_2ALGO.Application;

import java.util.Scanner;

public class Driver {
	public static void main(String[] args) {

		Scanner s = new Scanner(System.in);
		System.out.println("Enter the size of transaction array");
		int size = s.nextInt();
		int arr[] = new int[size];
		System.out.println("Enter the values of array");
		//you can enter more arrays than the given values but it will ...
		//...considered values only of given size
		for (int i = 0; i < size; i++)
			arr[i] = s.nextInt();
		System.out.println("Enter the total no. of targets that needs to be achieved");
		int targetNo = s.nextInt();

		while (targetNo-- != 0) {
			int flag = 0;
			long target;
			System.out.println("Enter the values of target");
			target = s.nextInt();
			long sum = 0;

			for (int i = 0; i < size; i++) {
				sum += arr[i];
				if (sum >= target) {
					System.out.println("Target achieved after " + (i + 1) +" transaction");
					//new line after every completion of transactions
					System.out.println("--------------");		
					flag = 1;
					break;
				}
			}
			if (flag == 0) {
				System.out.println("Given target is not achieved");
			}
		}
	}
}
