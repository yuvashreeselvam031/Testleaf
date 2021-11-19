package assignment2;

public class Student extends Department{
	
	public void studentName() {

		System.out.println("studentName: Yuvashree");
	}
	public void studentDept() {
		System.out.println("studentDept: BCA");
	}
	public void studentId() {
		System.out.println("studentId: 211604729");

	}

	public static void main(String[] args) {

		Student std = new Student();
		std.collegeName();
		std.collegeCode();
		std.collegeRank();
		std.departmentName();
		std.studentName();
		std.studentDept();
		std.studentId();
	}

}
