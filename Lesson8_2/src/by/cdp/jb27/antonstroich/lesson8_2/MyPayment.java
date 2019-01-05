package by.cdp.jb27.antonstroich.lesson8_2;

import java.util.ArrayList;

public class MyPayment {

	public static void main(String[] args) {
		Payment newPayment = new Payment();
		MyPayment.createMyPayment(newPayment);
		MyPayment.printMyPayment(newPayment);
		System.out.println("Your payment total cost = " + MyPayment.costMyPayment(newPayment) + "BYN");
	}

	public static void createMyPayment(Payment newPayment) {
		newPayment.add(new Product(12, "Winston", 12.99));
		newPayment.add(new Product(15, "Camel", 22.99));
		newPayment.add(new Product(21, "Pall Mall", 15));
		newPayment.add(new Product(12, "Winston", 12.99));
	}

	public static void printMyPayment(Payment newPayment) {
		ArrayList<Product> printPurchase = newPayment.getPurchase();
		System.out.println("Your Payment details: ");
		for (int i = 0; i < printPurchase.size(); i++) {
			Product newProduct = printPurchase.get(i);
			System.out.println(newProduct);
		}
	}	
	public static double costMyPayment(Payment newPayment) {
		ArrayList<Product> printPurchase = newPayment.getPurchase();
		double sum = 0;
		for (int i = 0; i < printPurchase.size(); i++) {
			Product newProduct = printPurchase.get(i);
			sum = sum + newProduct.getCost();
		}
		return sum;
	}
}
