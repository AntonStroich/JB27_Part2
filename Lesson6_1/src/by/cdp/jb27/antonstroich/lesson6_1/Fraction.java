package by.cdp.jb27.antonstroich.lesson6_1;

import java.util.Scanner;

public class Fraction {
	private int numerator;
	private int denominator;

	public int getNumerator() {
		return numerator;
	}

	public int getDenominator() {
		return denominator;
	}

	public void setNumerator() {
		Scanner sc = new Scanner(System.in);
		System.out.print("Please provide a value of the numerator: ");
		while (!sc.hasNextInt()) {
			System.out.print("Please provide a value of the numerator: ");
			sc.next();
		}
		this.numerator = sc.nextInt();
	}

	public void setDenominator() {
		Scanner sc = new Scanner(System.in);
		do {
			System.out.print("Please provide a value of the denominator (natural number): ");
			while (!sc.hasNextInt()) {
				System.out.print("Please provide a value of the denominator (natural number): ");
				sc.next();
			}
			this.denominator = sc.nextInt();
		} while (this.denominator <= 0);
	}

}
