package com.manav.currencydenominator;

import java.util.Scanner;

public class CurrencyCountApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		System.out.println("Enter the size of the currency denomination: ");
		int size = in.nextInt();
		int arr[] = new int[size];
		System.out.println("Enter the currency denominations value: ");
		for(int i =0;i<size;i++) {
			arr[i] = in.nextInt();
		}

		MergeSortImpl ms = new MergeSortImpl();
		ms.sort(arr, 0, size-1);
		System.out.println("Enter the amount you want to pay: ");
		int amount = in.nextInt();
		NotesCounter nc = new NotesCounter();
		nc.notesCountImplementation(arr, amount);

	}

}
