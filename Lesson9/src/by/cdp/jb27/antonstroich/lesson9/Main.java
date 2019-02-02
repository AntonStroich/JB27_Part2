package by.cdp.jb27.antonstroich.lesson9;

public class Main {

	public static void main(String[] args) {
		Book b1 = new Book("Book1", 12.00, 2011, "Author1");
		Book b2 = new Book("Book2", 9.99, 2012, "Author2");
		Book b3 = new Book("Book3", 9.99, 2012, "Author1");
		Book b4 = new Book("Book4", 8.00, 2011, "Author3");
		Book b5 = new Book("Book5", 10.66, 2013, "Author2");
		Book b6 = new Book("Book6", 15.04, 2014, "Author1");
		Book b7 = new Book("Book7", 15.04, 2014, "Author3");
		
		Library library1 = new Library();
		library1.add(b1);
		library1.add(b2);
		library1.add(b3);
		library1.add(b4);
		library1.add(b5);
		library1.add(b6);
		library1.add(b7);
		library1.delete(b4);
		Library library2 = createListBookByAuthor(library1, "Author1");
		printLibraryInList(library2);
		printLibraryInTable(library2);
		
			
		}

	
	public static Library createListBookByAuthor(Library library, String author) {
		Library newLibrary = new Library();
		for (Book book : library.getLibrary()) {
			if (library.findByAuthor(author) != null) {
				newLibrary.add(book);
			}
		}
		
		return newLibrary;
		
	}
	
	
	
	public static void printLibraryInList (Library library) {
		for (Book book : library.getLibrary()) {
		System.out.println("Author= " + book.getAuthor() + ", Name=" + book.getName() + ", Price=" + book.getPrice() + ", Year Published="
				+ book.getYearPublished());
		}
	}
	
	public static void printLibraryInTable (Library library) {
		System.out.println("| Author | Name | Price | Year Published |");
		for (Book book : library.getLibrary()) {
		System.out.println("| " + book.getAuthor() + " | " + book.getName() + " | " + book.getPrice() + " | "
				+ book.getYearPublished() + " |");
		}
	}

}
