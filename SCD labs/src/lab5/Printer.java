package lab5;

public class Printer {
	int pages=10;
	int quan;
	
	synchronized void printPages(int quantity) {
		this.quan=quantity;
		System.out.println("Printing is in process...");
		while(pages<quantity) {
			System.out.println("Pages not available.\nBecause required pages are: "+quantity+"\nCurrent page: "+pages+"\n");
			try {wait();} catch(Exception e) {}
		}
		pages-=quantity;
		System.out.println("Printing successful\nCurrent Page:"+pages);
	}
	
	synchronized void calculatePages() {
		try {
			System.out.println("Adding pages...");
		while(!(pages>=quan)) {
			System.out.println(pages+1);
			Thread.sleep(400);
			pages++;
		}
		} catch(Exception e) {}
		System.out.println("\ncurrent pages in tray: "+pages);
		notify();
	}
}



