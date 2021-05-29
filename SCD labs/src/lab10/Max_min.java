package lab10;

import java.util.Arrays;

public class Max_min {

	public int findMaxInteger(int[] array) {
		Arrays.sort(array);
		return array[array.length-1];
	}
	public int findMinInteger(int[] array) {
		Arrays.sort(array);
		return array[0];
	}
}


