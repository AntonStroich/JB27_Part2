package by.cdp.jb27.antonstroich.lesson9;

public class LibrarySearch {

	public static Library createNewLibraryBySerching(Library library, String author) {
		Library newLibrary = new Library();
		for (Book book : library.getLibrary()) {
			if (book.getAuthor().equals(author)) {
				newLibrary.add(book);
			}
		}
		return newLibrary;
	}

	public static Library createNewLibraryBySerching(Library library, int yearPublished) {
		Library newLibrary = new Library();
		for (Book book : library.getLibrary()) {
			if (book.getYearPublished() == yearPublished) {
				newLibrary.add(book);
			}
		}
		return newLibrary;
	}

	public static Library createNewLibraryBySerching(Library library, double price) {
		Library newLibrary = new Library();
		for (Book book : library.getLibrary()) {
			if (book.getPrice() == price) {
				newLibrary.add(book);
			}
		}
		return newLibrary;
	}
}
