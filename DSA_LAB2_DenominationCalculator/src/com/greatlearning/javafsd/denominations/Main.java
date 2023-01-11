package com.greatlearning.javafsd.denominations;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {

		System.out.println("Enter the size of currency denominations : ");
		Scanner input = new Scanner(System.in);
		int size = input.nextInt();
		int[] denominations = new int[size];
		System.out.println("Enter the currency denominations value : ");
		for (int i = 0; i < size; i++) {
			denominations[i] = input.nextInt();
		}
		System.out.println("Enter the amount you want to pay : ");
		int amount = input.nextInt();

		DenominationCalculator calculator = new DenominationCalculator(denominations, amount);
		calculator.calculate();

		if (input != null) {
			input.close();
		}

	}
}
