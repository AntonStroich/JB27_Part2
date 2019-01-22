package by.cdp.jb27.antonstroich.lesson9;

public class BookVolume extends Book {
	private int volume;

	public BookVolume(int id, String name, double price, int yearPublished, String author, int volume) {
		super(id, name, price, yearPublished, author);
		this.volume = volume;
	}

	public int getVolume() {
		return volume;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = super.hashCode();
		result = prime * result + volume;
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
		BookVolume other = (BookVolume) obj;
		if (volume != other.volume)
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "BookVolume [Author" + getAuthor() + ", Id" + getId() + ", Name=" + getName() + ", Volume=" + volume
				+ ", Price=" + getPrice() + ", Year Published=" + getYearPublished() + "]";
	}

}
