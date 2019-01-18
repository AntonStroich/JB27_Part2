package by.cdp.jb27.antonstroich.lesson8_1;

public class BankAccount {

	private int id;

	private double value;

	private String name;

	public BankAccount(int _id, double _value, String _name) {
		id = _id;
		value = _value;
		name = _name;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public double getValue() {
		return value;
	}

	public void setValue(double value) {
		this.value = value;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}
		if (obj == null || this.getClass() != obj.getClass()) {
			return false;
		}

		BankAccount account = (BankAccount) obj;

		if (id != account.id) {
			return false;
		}

		if (Double.doubleToLongBits(value) != Double.doubleToLongBits(account.value)) {
			return false;
		}
		if (name == null && account.name != null || !name.equals(account.name)) {
			return false;
		}

		return true;
	}

	@Override
	public int hashCode() {
		int result = 1;
		int prime = 27;
		result = result * prime + id;
		long x = 0;
		result = result * prime + (int) (x ^ (x >>> 32));
		result = result * prime + (int) ((name == null) ? 0 : name.hashCode());
		return result;
	}

	@Override
	public String toString() {
		return "This BankAccount [id = " + id + "; name = " + name + "; value= " + value + "]";
	}

}
