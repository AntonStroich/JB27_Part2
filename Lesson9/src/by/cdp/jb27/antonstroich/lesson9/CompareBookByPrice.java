package by.cdp.jb27.antonstroich.lesson9;

import java.util.Comparator;

public class CompareBookByPrice implements Comparator<Book> {

	@Override
	public int compare(Book b1, Book b2) {
		if (b1.getPrice() == b2.getPrice()) {
			return 0;
		}
		return (int) (b1.getPrice() - b2.getPrice());
	}

}
