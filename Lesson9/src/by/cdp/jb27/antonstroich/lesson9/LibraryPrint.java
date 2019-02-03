package by.cdp.jb27.antonstroich.lesson9;

public class LibraryPrint {

	public static void printLibraryInList(Library library) {
		for (Book book : library.getLibrary()) {
			System.out.println("Author: " + book.getAuthor() + "; Title: " + book.getTitle() + "; Price: "
					+ book.getPrice() + "; Year Published: " + book.getYearPublished() + ".");
		}
		System.out.print('\n');
	}

	public static void printLibraryInTable(Library library) {
		System.out.println("| Author | Title | Price | Year Published |");
		for (Book book : library.getLibrary()) {
			System.out.println("| " + book.getAuthor() + " | " + book.getTitle() + " | " + book.getPrice() + " | "
					+ book.getYearPublished() + " |");
		}
		System.out.print('\n');
	}

}