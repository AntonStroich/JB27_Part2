package by.cdp.jb27.antonstroich.lesson9;

public class Journal extends PrintEdition {

	private int number;

	public Journal(String title, double price, int yearPublished, int number) {
		super(title, price, yearPublished);
		this.number = number;
	}

	public int getNumber() {
		return number;
	}

	@Override
	public String toString() {
		return "Journal [Title=" + getTitle() + ", Price=" + getPrice() + ", Year Published=" + getYearPublished()
				+ "Number=" + number + "]";
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = super.hashCode();
		result = prime * result + number;
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (!super.equals(obj))
			return false;
		if (getClass() != obj.getClass())
			return false;
		Journal other = (Journal) obj;
		if (number != other.number)
			return false;
		return true;
	}

}