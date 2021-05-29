package lab12;

public class Ques2 {
	private Object num1, num2;
	
	public Ques2(Object num1, Object num2) {
		this.num1 = num1;
		this.num2 = num2;
	}
	private boolean checkIntType(Object element) {
		if(element.getClass().getSimpleName().equals("Integer")) return true;
		return false;
	}
	public void divide() {
		try {
		if(checkIntType(num1)==false || checkIntType(num2)==false) {
			throw new ArithmeticException("must be integer");
		}
		if((int)num2==0) {
			throw new ArithmeticException("cannot divide by zero");
		}
		System.out.println("Answer: "+(int)num1/(int)num2);
		}
		catch(Exception e) {
			System.out.println(e);
		}
	}
}
