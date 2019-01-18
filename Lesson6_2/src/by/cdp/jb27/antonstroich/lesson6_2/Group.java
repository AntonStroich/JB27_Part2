package by.cdp.jb27.antonstroich.lesson6_2;

public class Group {

	private Student[] students;

	private double avgGroupMark;

	private int countBestStudents;

	private int countWorstStudents;

	public Group(Student[] students) {
		this.students = students;
	}

	public Student[] getStudents() {
		return students;
	}

	public void setStudents(Student[] students) {
		this.students = students;
	}

	public double calculateAvgGroupMark() {
		double sumGroup = 0;
		if (students.length == 0) {
			avgGroupMark = 0;
		} else {
			for (int i = 0; i < students.length; i++) {
				sumGroup = sumGroup + students[i].calculateAvgMark();
			}
			this.avgGroupMark = sumGroup / students.length;
		}
		return this.avgGroupMark;
	}

	public int calculateCountBestStudents() {
		for (int i = 0; i < students.length; i++) {
			if (students[i].calculateAvgMark() == 5) {
				this.countBestStudents++;
			}
		}
		return this.countBestStudents;
	}

	public int calculateCountWorstStudents() {
		for (int i = 0; i < students.length; i++) {
			if (students[i].calculateAvgMark() == 2) {
				this.countWorstStudents++;
			}
		}
		return this.countWorstStudents;
	}

}
