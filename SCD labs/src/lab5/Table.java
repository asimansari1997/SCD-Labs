package lab5;

public class Table {
	 void printTable(int number) {
		synchronized(this) {
			for(int i=1 ; i<=5 ; i++) {
				System.out.println(number*i);
				try {
					Thread.sleep(400);
				}
				catch(Exception e) {
					System.out.println(e);
				}
			}
		}
	}
}
