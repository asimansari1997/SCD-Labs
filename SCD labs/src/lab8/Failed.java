package lab8;

public class Failed {
	private final String studentName ,courseName ,courseCode;
	private final int rollNumber;
	public Failed (String studentName, int rollNumber,String courseCode, String courseName) {
	this.studentName = studentName;
	this.courseName = courseName;
	this.courseCode =courseCode;
	this.rollNumber = rollNumber;
}
public String getCourseName() {
	return courseName;
}
public int getRollNumber() {
	return rollNumber;
}
public String getStudentName() {
	return studentName;
}
public String getCourseCode() {
	return courseCode;
}
}
