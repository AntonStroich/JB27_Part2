package by.cdp.jb27.antonstroich.lesson6_2;

import java.util.Scanner;

public class Student {
	private String name;
	private int[] marks = new int[3];
	private double avgMark;

	public void setName() {
		Scanner sc = new Scanner(System.in);
		System.out.print("Please provide a student's name: ");
		while (!sc.hasNextLine()) {
			System.out.print("Please provide a student's name: ");
			sc.next();
		}
		this.name = sc.nextLine();
	}

	public String getName() {
		return name;
	}

	public void setMarks() {
		for (int i = 0; i < marks.length; i++) {
			Scanner sc = new Scanner(System.in);
			do {
				System.out.print("Please, specify a mark: ");
				while (!sc.hasNextInt()) {
					System.out.print("Please, specify a mark: ");
					sc.next();				
				}
				this.marks[i] = sc.nextInt();
			} while (this.marks[i] < 2 || this.marks[i] > 5);			
		}
	}

	public int[] getMarks() {
		return marks;
	}

	public double setAvgMark(int[] marks) {
		int sum = 0;
		if (marks.length == 0) {
			this.avgMark = 0;
		} else {
			for (int i = 0; i < marks.length; i++) {
				sum = sum + marks[i];
			}
			this.avgMark = (double) sum / marks.length;
		}
		return this.avgMark;
	}

	public double getAvgMark() {
		return avgMark;
	}

}
