package by.cdp.jb27.antonstroich.lesson6_2;

import java.util.Scanner;

public class Student {
	private String name;
	private int[] mark = new int[3];

	public String getName() {
		return name;
	}

	public int[] getMark() {
		return mark;
	}

	public void setName() {
		Scanner sc = new Scanner(System.in);
		System.out.print("Please provide a student's name: ");
		while (!sc.hasNextLine()) {
			System.out.print("Please provide a student's name: ");
			sc.next();
		}
		this.name = sc.nextLine();
	}

	public void setMark() {
		for (int i = 0; i < mark.length; i++) {
			Scanner sc = new Scanner(System.in);
				System.out.print("Please, specify a mark: ");
				while (!sc.hasNextInt()) {
					System.out.print("You have entered an incorect value! ");
					sc.next();
				}
				this.mark[i] = sc.nextInt();
		}
	}
	

}
