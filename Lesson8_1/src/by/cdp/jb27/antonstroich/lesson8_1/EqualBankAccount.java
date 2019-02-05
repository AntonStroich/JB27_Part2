package by.cdp.jb27.antonstroich.lesson8_1;

public class EqualBankAccount {

	public static void main(String[] args) {

		BankAccount ba1 = new BankAccount(400000, 99999.99, "ACR15000BA300");

		BankAccount ba2 = new BankAccount(400000, 99999.99, "ACR15000BA300");

		BankAccount ba3 = new BankAccount(500000, 99899.99, "ACR15000BA301");

		if (ba1.equals(ba2)) {
			System.out.println("Accounts are equals");
		} else {
			System.out.println("Accounts are not equals");

		}

		if (ba1.equals(ba1)) {
			System.out.println("Accounts are equals");
		} else {
			System.out.println("Accounts are not equals");

		}

		if (ba1.equals(ba3)) {
			System.out.println("Accounts are equals");
		} else {
			System.out.println("Accounts are not equals");

		}

		if (ba2.equals(ba3)) {
			System.out.println("Accounts are equals");
		} else {
			System.out.println("Accounts are not equals");

		}

		System.out.println(ba1.hashCode());

		System.out.println(ba2.hashCode());

		System.out.println(ba3.hashCode());

		System.out.println(ba1);

		System.out.println(ba2);

		System.out.println(ba3);

	}
}