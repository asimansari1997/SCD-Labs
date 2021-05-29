package lab7;

public class Lab7 {
	
	public static < E > void printReverse( E[] inputArray ) {
	      // Display array elements
	      for(int i=inputArray.length-1 ; i>=0 ; i--) {
	    	  System.out.println(inputArray[i]);
	      }
	      System.out.println();
	   }

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	      Integer[] intArray = { 1, 2, 3, 4, 5 };
	      Double[] doubleArray = { 1.1, 2.2, 3.3, 4.4 };
	      Character[] charArray = { 'H', 'E', 'L', 'L', 'O' };
	      System.out.println("Array integerArray contains:");
	      printReverse(intArray);   // pass an Integer array

	      System.out.println("\nArray doubleArray contains:");
	      printReverse(doubleArray);   // pass a Double array

	      System.out.println("\nArray characterArray contains:");
	      printReverse(charArray);   // pass a Character array
	   }

	}



