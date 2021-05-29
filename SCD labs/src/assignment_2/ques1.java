package assignment_2;

public class ques1 {

	public static int recursiveAddition(int num,int range) {
		
		 if(range<0) {
			return num;
		 }
		 return recursiveAddition(num+range, range-1);
		}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int answer = recursiveAddition(0,10);
		System.out.println(answer);
	}

}
