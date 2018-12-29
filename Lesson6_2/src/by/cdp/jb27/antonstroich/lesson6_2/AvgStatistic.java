package by.cdp.jb27.antonstroich.lesson6_2;

public class AvgStatistic {
	
	public static void main(String[] args) {
		int groupLength = 4;
		Student[] studentGroup = new Student[groupLength];
		AvgStatistic.fillStudentGroup(studentGroup);
		AvgStatistic.getAvgForEachStudentGroup(studentGroup);

	}
	public static void fillStudentGroup(Student[] studentGroup) {
		for (int i = 0; i < studentGroup.length; i++) {
			System.out.println("Student[" + i + "] ");
			studentGroup[i] = new Student();
			studentGroup[i].setName();
			studentGroup[i].setMark();
		}
	}
	
	public static void getAvgForEachStudentGroup(Student[] studentGroup) {
		for (int i = 0; i < studentGroup.length; i++) {
			double avg = 0;
			// avg = Math.average(studentGroup[i].getMark());
			System.out.println("Student[" + i + "]: " + studentGroup[i].getName() + "Average mark: "  + studentGroup[i].getMark());
		}
	}
}
