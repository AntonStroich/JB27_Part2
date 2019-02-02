package by.cdp.jb27.antonstroich.lesson9;

public abstract class PrintEdition {
	private String name;

	private double price;

	private int yearPublished;

	public PrintEdition(String name, double price, int yearPublished) {
		this.name = name;
		this.price = price;
		this.yearPublished = yearPublished;
	}

	public String getName() {
		return name;
	}

	public double getPrice() {
		return price;
	}

	public int getYearPublished() {
		return yearPublished;
	}

	@Override
	public String toString() {
		return "Edition [name=" + name + ", price=" + price + ", yearPublished=" + yearPublished + "]";
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((name == null) ? 0 : name.hashCode());
		long temp;
		temp = Double.doubleToLongBits(price);
		result = prime * result + (int) (temp ^ (temp >>> 32));
		result = prime * result + yearPublished;
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		PrintEdition other = (PrintEdition) obj;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		if (Double.doubleToLongBits(price) != Double.doubleToLongBits(other.price))
			return false;
		if (yearPublished != other.yearPublished)
			return false;
		return true;
	}
}
