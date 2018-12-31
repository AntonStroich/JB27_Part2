package by.cdp.jb27.antonstroich.lesson6_2;

public class AverageResults {

	public static void main(String[] args) {
		int groupLength = 4;
		Student[] arrayStudents = new Student[groupLength];
		AverageResults.fillStudentGroup(arrayStudents);
		AverageResults.showAvgForEachStudentGroup(arrayStudents);
		Group myGroup = new Group(arrayStudents);
		System.out.println("Average group mark = " + myGroup.getAvgGroupMark());
		System.out.println("There are " + myGroup.getCountBestStudents() + " students with average mark = 5");
		System.out.println("There are " + myGroup.getCountWorstStudents() + " students with average mark = 2");

	}

	public static void fillStudentGroup(Student[] arrayStudents) {
		for (int i = 0; i < arrayStudents.length; i++) {
			System.out.println("Student[" + i + "] ");
			arrayStudents[i] = new Student();
			arrayStudents[i].setName();
			arrayStudents[i].setMarks();
			arrayStudents[i].setAvgMark(arrayStudents[i].getMarks());
		}
	}

	public static void showAvgForEachStudentGroup(Student[] arrayStudents) {
		for (int i = 0; i < arrayStudents.length; i++) {
			System.out.println("Student[" + i + "]: name - " + arrayStudents[i].getName() + "; Average mark = "
					+ arrayStudents[i].getAvgMark());
		}
	}

}