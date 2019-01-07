package by.cdp.jb27.antonstroich.lesson9;

public class Demo {

	public static void main(String[] args) {
		Edition ed1 = new Edition(123, "Travel", 1988);
		System.out.println(
				"Id: " + ed1.getId() + "; Name: " + ed1.getName() + "; Year Published: " + ed1.getYearPublished());
		Journal j1 = new Journal(125, "World", 1990, 12);
		System.out.println("Id: " + j1.getId() + "; Name: " + j1.getName() + "; Year Published: "
				+ j1.getYearPublished() + "; Number: " + j1.getNumber());
		Journal j2 = new Journal(125, "World", 1990, 12);
		System.out.println("Id: " + j2.getId() + "; Name: " + j2.getName() + "; Year Published: "
				+ j2.getYearPublished() + "; Number: " + j2.getNumber());
		Book b1 = new Book(1001, "War and Peace", 1964, "Lev Tolstoy");
		System.out.println("Id: " + b1.getId() + "; Name: " + b1.getName() + "; Year Published: "
				+ b1.getYearPublished() + "; Author: " + b1.getAuthor());

		if (j1.equals(j2)) {
			System.out.println("Editions are equals!" + '\n' + j1.hashCode() + '\n' + j2.hashCode());
			
		} else {
			System.out.println("Editions are not equals!" + '\n' + j1.hashCode() + '\n' + j2.hashCode());
		}
	}

}
