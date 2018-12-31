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

	public double getAvgGroupMark() {
		double sumGroup = 0;
		if (students.length == 0) {
			avgGroupMark = 0;
		} else {
			for (int i = 0; i < students.length; i++) {
				sumGroup = sumGroup + students[i].getAvgMark();
			}
			this.avgGroupMark = sumGroup / students.length;
		}
		return this.avgGroupMark;
	}

	public int getCountBestStudents() {
		for (int i = 0; i < students.length; i++) {
			if (students[i].getAvgMark() == 5) {
				this.countBestStudents++;
			}
		}
		return this.countBestStudents;
	}

	public int getCountWorstStudents() {
		for (int i = 0; i < students.length; i++) {
			if (students[i].getAvgMark() == 2) {
				this.countWorstStudents++;
			}
		}
		return this.countWorstStudents;
	}

}