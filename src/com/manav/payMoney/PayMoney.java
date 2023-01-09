package com.manav.payMoney;

import java.util.Scanner;

public class PayMoney {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the size of Transaction Array: ");
		int Arr_Size = sc.nextInt();
		int Arr[] = new int[Arr_Size];

		System.out.println("Enter the values of Array: ");
		for(int i = 0;i<Arr_Size;i++) {
			Arr[i] = sc.nextInt();
		}

		System.out.println("Enter the total no of targets to be achieved: ");
		int targetNo = sc.nextInt();
		while(targetNo-- != 0) {
			int flag = 0;
			long target;

			System.out.println("Enter the value of the target: ");
			target = sc.nextLong();
			long sum = 0;
			for(int i=0;i<Arr_Size;i++) {
				sum += Arr[i];
				if(sum >= target) {
					System.out.println("Target achieved after "+(i+1)+" transactions");
					System.out.println();
					flag = 1;
					break;
				}
			}
			if(flag == 0) {
				System.out.println("Given target is not achieved.");
			}
		}

	}

}
