package by.cdp.jb27.antonstroich.lesson8_2;

import java.util.ArrayList;

public class MyPayment {

	public static void main(String[] args) {
		Payment newPayment = new Payment();
		newPayment.add(new Product(12, "Chair", 112.99));
		newPayment.add(new Product(15, "Bed", 222.99));
		newPayment.add(new Product(21, "Table", 115));
		newPayment.add(new Product(12, "Chair", 112.99));
		MyPayment.printMyPayment(newPayment);
		MyPayment.costMyPayment(newPayment);
		MyPayment.findMyProduct(newPayment, "Table");
		newPayment.remove(new Product(21, "Table", 115));
		MyPayment.printMyPayment(newPayment);
		MyPayment.costMyPayment(newPayment);
		MyPayment.findMyProduct(newPayment, "Table");

	}

	public static void printMyPayment(Payment newPayment) {
		ArrayList<Product> printPurchase = newPayment.getPurchase();
		System.out.println("Your Payment details: ");
		for (int i = 0; i < printPurchase.size(); i++) {
			Product newProduct = printPurchase.get(i);
			System.out.println(newProduct);
		}
	}

	public static void costMyPayment(Payment newPayment) {
		ArrayList<Product> calculateCostPurchase = newPayment.getPurchase();
		double sum = 0;
		for (int i = 0; i < calculateCostPurchase.size(); i++) {
			Product newProduct = calculateCostPurchase.get(i);
			sum = sum + newProduct.getCost();
		}
		System.out.println("Your payment total cost = " + sum + " BYN");
	}

	public static void findMyProduct(Payment newPayment, String name) {
			Product selectedProduct = newPayment.findByName(name);
			if (selectedProduct == null) {
				System.out.println("There is no a " + name +  " in the purchase" );
			}
			else { 
				System.out.println("There is a " + name +  " in the purchase" );
			}
		}
		
	}

