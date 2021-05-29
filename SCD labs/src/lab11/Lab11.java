package lab11;

public class Lab11 {
	public boolean isOdd(int num) {
		
		return num%2==0 ? false : true;
	}
	public boolean isEven(int num) {
		
		return num%2==0 ? true : false;
	}
	public boolean isPrime(int num) {
		
		boolean flag = false;
	    for (int i=2 ; i<=num/2 ; ++i) {
	      if (num % i == 0) {
	        flag = true;
	        break;
	      }
	    }
	    return !flag;
	}
	public int calculateFactorial(int num) {
		int fact = 1;
		for(int i = 1 ; i<=num ; i++) {
			fact = fact*i;
		}
		return fact;
	}
}


