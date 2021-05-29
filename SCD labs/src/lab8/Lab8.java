package lab8;
public class Lab8 {
	public static void printFailedList(Failed arr[]) {
		for(Failed obj : arr) {
			System.out.println(obj.getStudentName()+"\t"+obj.getCourseCode()+
			"\t"+obj.getCourseName()+"\t"+obj.getClass().getSimpleName());
		}
	}
	public static void printPromotedList(Promoted arr[]) {
		for(Promoted obj : arr) {
			System.out.println(obj.getStudentName()+"\t"+obj.getCourseCode()+
			"\t"+obj.getCourseName()+"\t\t"+obj.getClass().getSimpleName());
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Failed student1 = new Failed("Robert",200,"SWE318","E-Commerce");
		Failed student2 = new Failed("Alia",210,"SWE318","E-Commerce");
		Promoted student3 = new Promoted("Jackson",183,"SWE308","HCI");
		Failed f_arr[] = {student1,student2};
		Promoted p_arr[] = {student3};
		System.out.println("Before Modification:");
		System.out.println("\nName\tCourse\tCode\t\tStatus");
		printFailedList(f_arr);
		printPromotedList(p_arr);	
		System.out.println("\nAfter Modification:");
		student3.setCourseName("ITSE");
		student3.setCourseCode("SWE-212");
		System.out.println("\nName\tCourse\tCode\t\tStatus");
		printFailedList(f_arr);
		printPromotedList(p_arr);	

	}
}






//Math math = new Math();
//System.out.println("Circumference of Circle: "+math.circumference(5));
//System.out.println("Area of Circle: "+math.area(5));
//System.out.println("Volume of Sphere: "+math.volumeOfSphere(5));
//System.out.println("Surface Area of Sphere: "+math.surfaceAreaofSphere(5));