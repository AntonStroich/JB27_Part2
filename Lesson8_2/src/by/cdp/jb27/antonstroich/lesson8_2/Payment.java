package by.cdp.jb27.antonstroich.lesson8_2;

import java.util.ArrayList;

public class Payment {
	private ArrayList<Product> purchase= new ArrayList<Product> ();

	public ArrayList<Product> getPurchase() {
		return purchase;
	}

	public void setPurchase(ArrayList<Product> purchase) {
		this.purchase = purchase;
	}

	public void add(Product product) {
		purchase.add(product);
	} 
}