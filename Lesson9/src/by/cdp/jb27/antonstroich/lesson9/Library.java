package by.cdp.jb27.antonstroich.lesson9;

import java.util.ArrayList;

public class Library {

	private ArrayList<Book> library = new ArrayList<Book>();

	public ArrayList<Book> getLibrary() {
		return library;
	}

	public void add(Book book) {
		library.add(book);

	}

	public boolean delete(Book book) {
		return library.remove(book);
	}

	public Book findByAuthor(String author) {
		for (Book book : library) {
			if (book.getName().equals(book)) {
				return book;
			}
		}
		return null;
	}

}
