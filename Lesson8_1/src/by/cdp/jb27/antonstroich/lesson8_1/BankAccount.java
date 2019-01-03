package by.cdp.jb27.antonstroich.lesson8_1;

public class BankAccount {
	private int value;
	private String name;

	public BankAccount (int _value, String _name ) {
		value=_value;
		name =_name;
		
	}
	
	public int getValue() {
		return value;
	}

	public void setValue(int value) {
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

		if (value != account.value) {
			return false;
		}

		if (name == null && account.name != null || !name.equals(account.name)) {
			return false;
		}

		return true;
	}
    
	@Override
	public int hashCode() {	
		return (int) 31 * value + ((name == null) ? 0 : name.hashCode());
	}
	
	@Override
	public String toString () {
		return "BankAccount [name = " + name + "; value= " + value + "]";
	}
	
	
	
}
