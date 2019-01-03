package by.cdp.jb27.antonstroich.lesson8_1;

public class equalBankAccount {

	public static void main(String[] args) {

		BankAccount ba1 = new BankAccount(400000, "ACR15000BA300");
		BankAccount ba2 = new BankAccount(400000, "ACR15000BA300");

		if (ba1.equals(ba2)) {
			System.out.println("Accounts are equals");
		} else {
			System.out.println("Accounts are not equals");

		}

		System.out.println(ba1.hashCode());
		System.out.println(ba2.hashCode());
		System.out.println(ba1);
		System.out.println(ba2);

	}
}