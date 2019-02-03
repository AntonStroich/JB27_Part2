package by.cdp.jb27.antonstroich.lesson9;

import java.util.Collections;

public class Main {

	public static void main(String[] args) {

		Book b1 = new Book("War and Peace", 12.00, 2012, "Tolstoy");
		Book b2 = new Book("Crime and Punishment", 9.99, 2011, "Dostoevsky");
		Book b3 = new Book("Anna Karenina", 9.99, 2011, "Tolstoy");
		Book b4 = new Book("Fat and Thin", 8.00, 2011, "Chekhov");
		Book b5 = new Book("The Idiot", 10.66, 2013, "Dostoevsky");
		Book b6 = new Book("Resurrection", 15.04, 2014, "Tolstoy");
		Book b7 = new Book("The Complaints Book", 15.04, 2014, "Chekhov");

		Library library1 = new Library();

		library1.add(b1);
		library1.add(b2);
		library1.add(b3);
		library1.add(b4);
		library1.add(b5);
		library1.add(b6);
		library1.add(b7);

		library1.delete(b4);

		Library library2 = LibrarySearch.createNewLibraryBySerching(library1, 2011);
		System.out.println("Books filtered by years of publishing: ");
		LibraryPrint.printLibraryInList(library2);

		Library library3 = LibrarySearch.createNewLibraryBySerching(library1, 9.99);
		System.out.println("Books filtered by their prices: ");
		LibraryPrint.printLibraryInTable(library3);

		Library library4 = LibrarySearch.createNewLibraryBySerching(library1, "Tolstoy");

		Collections.sort(library4.getLibrary(), new CompareBookByPrice());
		System.out.println("Books filtered by author's name and sorted by prices: ");
		LibraryPrint.printLibraryInList(library4);

		Collections.sort(library4.getLibrary(), new CompareBookByYearPublished());
		System.out.println("Books filtered by author's name and sorted by years of publishing: ");
		LibraryPrint.printLibraryInTable(library4);

	}

}