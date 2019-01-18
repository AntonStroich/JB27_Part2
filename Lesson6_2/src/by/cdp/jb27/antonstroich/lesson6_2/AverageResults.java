package by.cdp.jb27.antonstroich.lesson6_2;

import java.util.Scanner;

public class AverageResults {

	public static void main(String[] args) {

		Student[] arrayStudents = new Student[4];

		AverageResults.fillStudentGroup(arrayStudents);

		AverageResults.showAvgForEachStudentGroup(arrayStudents);

		Group myGroup = new Group(arrayStudents);

		System.out.println("Average group mark = " + myGroup.calculateAvgGroupMark());

		System.out.println("There are " + myGroup.calculateCountBestStudents() + " students with average mark = 5");

		System.out.println("There are " + myGroup.calculateCountWorstStudents() + " students with average mark = 2");

	}

	public static int[] inputMarks() {
		int[] marks = new int[3];
		for (int i = 0; i < marks.length; i++) {
			Scanner sc = new Scanner(System.in);
			do {
				System.out.print("Please, specify a mark (2, 3, 4, 5): ");
				while (!sc.hasNextInt()) {
					System.out.print("Please, specify a mark (2, 3, 4, 5): ");
					sc.next();
				}
				marks[i] = sc.nextInt();
			} while (marks[i] < 2 || marks[i] > 5);
		}
		return marks;
	}

	public static String inputName() {

		Scanner sc = new Scanner(System.in);
		System.out.print("Please provide a student's name: ");
		while (!sc.hasNextLine()) {
			System.out.print("Please provide a student's name: ");
			sc.next();
		}
		return sc.nextLine();

	}

	public static void fillStudentGroup(Student[] arrayStudents) {
		for (int i = 0; i < arrayStudents.length; i++) {
			System.out.println("Student[" + i + "] ");
			arrayStudents[i] = new Student();
			arrayStudents[i].setName(inputName());
			arrayStudents[i].setMarks(inputMarks());
			arrayStudents[i].calculateAvgMark();
		}
	}

	public static void showAvgForEachStudentGroup(Student[] arrayStudents) {
		for (int i = 0; i < arrayStudents.length; i++) {
			System.out.println("Student[" + i + "]: name - " + arrayStudents[i].getName() + "; Average mark = "
					+ arrayStudents[i].calculateAvgMark());
		}
	}

}
