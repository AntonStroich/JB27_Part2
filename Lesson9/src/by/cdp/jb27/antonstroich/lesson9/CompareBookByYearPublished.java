package by.cdp.jb27.antonstroich.lesson9;

import java.util.Comparator;

public class CompareBookByYearPublished implements Comparator<Book> {

	@Override
	public int compare(Book b1, Book b2) {
		if (b1.getYearPublished() == b2.getYearPublished()) {
			return 0;
		}
		return (int) (b1.getYearPublished() - b2.getYearPublished());
	}

}
