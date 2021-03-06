package by.cdp.jb27.antonstroich.lesson9;

public class Book extends PrintEdition {

	private String author;

	public Book(String title, double price, int yearPublished, String author) {
		super(title, price, yearPublished);
		this.author = author;
	}

	public String getAuthor() {
		return author;
	}

	@Override
	public String toString() {
		return "Book [Author=" + author + ", Title=" + getTitle() + ", Price=" + getPrice() + ", Year Published="
				+ getYearPublished() + "]";
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((author == null) ? 0 : author.hashCode());
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
		Book other = (Book) obj;
		if (author == null) {
			if (other.author != null)
				return false;
		} else if (!author.equals(other.author))
			return false;
		return true;
	}

}
