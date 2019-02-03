package by.cdp.jb27.antonstroich.lesson9;

public class Newspaper extends PrintEdition {
	private int number;

	private String periodicity;

	public Newspaper(String title, double price, int yearPublished, int number, String periodicity) {
		super(title, price, yearPublished);
		this.number = number;
		this.periodicity = periodicity;
	}

	public int getNumber() {
		return number;
	}

	public String getPeriodicity() {
		return periodicity;
	}

	public String toString() {
		return "Journal [Title=" + getTitle() + ", Price=" + getPrice() + ", Year Published=" + getYearPublished()
				+ "Number=" + number + "Periodicity" + periodicity + "]";
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = super.hashCode();
		result = prime * result + number;
		result = prime * result + ((periodicity == null) ? 0 : periodicity.hashCode());
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
		Newspaper other = (Newspaper) obj;
		if (number != other.number)
			return false;
		if (periodicity == null) {
			if (other.periodicity != null)
				return false;
		} else if (!periodicity.equals(other.periodicity))
			return false;
		return true;
	}

}
