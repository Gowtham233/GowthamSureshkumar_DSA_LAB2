package com.greatlearning.javafsd.paymoney;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		try {
			// Getting user inputs for number of transactions
			Scanner input = new Scanner(System.in);
			System.out.println("Enter the size of transaction array : ");
			int transactionArraySize = input.nextInt();
			int[] transactions = new int[transactionArraySize];

			// Getting user inputs for values of transactions
			System.out.println("Enter the values of array :");
			for (int index = 0; index < transactionArraySize; index++) {
				transactions[index] = input.nextInt();
			}

			// Getting user inputs for targets
			System.out.print("Enter the total no of targets that needs to be achieved : ");
			int targetInstanceSize = input.nextInt();

			for (int count = 1; count <= targetInstanceSize; count++) {

				System.out.println();
				System.out.print("Enter the target value : ");
				int dailyTarget = input.nextInt();

				System.out.println("Processing transactions with target value -> " + dailyTarget);

				TargetDeterminator determinator = new TargetDeterminator(transactions, dailyTarget);

				determinator.determine();

			}

			if (input != null) {
				input.close();
			}
		}

		catch (Exception e) {
			System.out.println("Please enter the valid input");
		}
	}
}
