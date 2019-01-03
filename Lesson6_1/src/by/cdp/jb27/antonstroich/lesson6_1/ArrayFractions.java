package by.cdp.jb27.antonstroich.lesson6_1;

public class ArrayFractions {
	public static void main(String[] args) {
		int k = 4;
		Fraction[] arrayFraction = new Fraction[k];
	    ArrayFractions.fillArrayFractions(arrayFraction);
		ArrayFractions.printArrayFractions(arrayFraction);
	}

	public static void fillArrayFractions(Fraction[] arrayFraction) {
		
		for (int i = 0; i < arrayFraction.length; i++) {
			System.out.println("arrayFraction[" + i + "] ");
			arrayFraction[i] = new Fraction();
			arrayFraction[i].setNumerator();
			arrayFraction[i].setDenominator();
		}
	}

	public static void printArrayFractions(Fraction[] arrayFraction) {
		for (int i = 0; i < arrayFraction.length; i++) {
			System.out.println("arrayFraction[" + i + "] = " + arrayFraction[i].getNumerator() + "/"
					+ arrayFraction[i].getDenominator());
		}
	}
}
