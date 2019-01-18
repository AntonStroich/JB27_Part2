package by.cdp.jb27.antonstroich.lesson6_1;

import java.util.Scanner;

public class ArrayFractions {
	public static void main(String[] args) {
		int k = 4;

		Fraction[] arrayFraction = new Fraction[k];

		ArrayFractions.fillArrayFractions(arrayFraction);

		ArrayFractions.printArrayFractions(arrayFraction);
	}

	public static Fraction readFraction() {
		int numerator = ArrayFractions.readNumerator();
		int denominator = ArrayFractions.readDenominator();
		Fraction fraction = new Fraction(numerator, denominator);
		return fraction;
	}

	public static int readNumerator() {
		int numerator;
		Scanner sc = new Scanner(System.in);
		System.out.print("Please provide a value of the numerator (an integer number): ");
		while (!sc.hasNextInt()) {
			System.out.print("Please provide a value of the numerator (an integer number): ");
			sc.next();
		}
		numerator = sc.nextInt();
		return numerator;
	}

	public static int readDenominator() {
		int denominator;
		Scanner sc = new Scanner(System.in);
		do {
			System.out.print("Please provide a value of the denominator (a natural number): ");
			while (!sc.hasNextInt()) {
				System.out.print("Please provide a value of the denominator (a natural number): ");
				sc.next();
			}
			denominator = sc.nextInt();
		} while (denominator <= 0);
		return denominator;
	}

	public static void fillArrayFractions(Fraction[] arrayFraction) {

		for (int i = 0; i < arrayFraction.length; i++) {
			System.out.println("arrayFraction[" + i + "] ");
			arrayFraction[i] = ArrayFractions.readFraction();
		}
	}

	public static void printArrayFractions(Fraction[] arrayFraction) {
		for (int i = 0; i < arrayFraction.length; i++) {
			System.out.println("arrayFraction[" + i + "] = " + arrayFraction[i].getNumerator() + "/"
					+ arrayFraction[i].getDenominator());
		}
	}

}
