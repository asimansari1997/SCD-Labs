package lab8;

public class Promoted {
	private String studentName ,courseName ,courseCode;
	private int rollNumber;
	Promoted(String studentName, int rollNumber,String courseCode, String courseName) 
	{
		this.studentName = studentName;
		this.courseName = courseName;
		this.courseCode =courseCode;
		this.rollNumber = rollNumber;
	}
	public String getStudentName() {
		return studentName;
	}
	public void setStudentName(String studentName) {
		this.studentName = studentName;
	}
	public String getCourseName() {
		return courseName;
	}
	public void setCourseName(String courseName) {
		this.courseName = courseName;
	}
	public String getCourseCode() {
		return courseCode;
	}
	public void setCourseCode(String courseCode) {
		this.courseCode = courseCode;
	}
	public int getRollNumber() {
		return rollNumber;
	}
	public void setRollNumber(int rollNumber) {
		this.rollNumber = rollNumber;
	}
}
