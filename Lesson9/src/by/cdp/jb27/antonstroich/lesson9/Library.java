package by.cdp.jb27.antonstroich.lesson9;

import java.util.ArrayList;

public class Library {

	private ArrayList<Book> library = new ArrayList<Book>();

	public ArrayList<Book> getLibrary() {
		return library;
	}

	public void add(Book item) {
		library.add(item);

	}

	public void delete(Book item) {
		library.remove(item);
	}

}
