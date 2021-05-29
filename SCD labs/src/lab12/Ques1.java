package lab12;

public class Ques1 {
	private int arr[];
	
	public Ques1(int arr[]){
		this.arr = generateRandom(arr);
	}
	private int[] generateRandom(int arr[]) {
		int random = 0;
		for(int i=0; i<arr.length ; i++) {
			random = (int) ((Math.random() * (10 - 1)) + 1);
			arr[i] = random;
		}
		return arr;
	}
	public int getValuebyIntex(int index) {
		try {
			return arr[index];
		}
		catch(ArrayIndexOutOfBoundsException e) {
			System.out.println("index"+index+" is out of bound");
		}
		return -1;
	}
}
