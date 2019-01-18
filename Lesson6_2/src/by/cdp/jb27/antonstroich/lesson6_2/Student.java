package by.cdp.jb27.antonstroich.lesson6_2;

import java.util.Scanner;

public class Student {

	private String name;

	private int[] marks;

	//private double avgMark;

	public void setName(String name) {
		this.name = name;
	}

	public String getName() {
		return name;
	}

	public void setMarks(int[] marks) {
		this.marks = marks;
	}

	public int[] getMarks() {
		return marks;
	}

	public double calculateAvgMark() {
		double avgMark;
		int sum = 0;
		if (marks.length == 0) {
			avgMark = 0;
		} else {
			for (int i = 0; i < marks.length; i++) {
				sum = sum + marks[i];
			}
			avgMark = (double) sum / marks.length;
		}
		return avgMark;
	}
}
