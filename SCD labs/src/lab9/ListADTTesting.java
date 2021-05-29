package lab9;
import java.util.*;
public class ListADTTesting {
	public static void main(String arg[]) {
		
		//List
		
		//Add Items
		List <String> cars = new ArrayList<String>();
		 cars.add("Volvo");
		 cars.add("BMW");
		 cars.add("Ford");
		 cars.add("Mazda");
//		 System.out.println(cars);
		
//		//Access items
//		 System.out.println(cars.get(0));
//		 System.out.println(cars.get(3));
		 
		 //set item
//		 cars.set(0, "Honda");
//		 System.out.println(cars);
		 
		 //remove item
//		 cars.remove(0);
		 
//		 size of list
//		 System.out.println(cars.size());
		 
		 // stack
		 StackTesting stack = new StackTesting();
		 Stack<Integer> S = new Stack<Integer>();
		 
		 //stack basic operations
		 stack.stack_push(S);
		 stack.stack_pop(S);
		 stack.stack_push(S);
		 stack.stack_peek(S); 
		 stack.stack_search(S, 2);
		 stack.stack_search(S, 6); 
		 
		 //Queue 
		 
//		 Queue<Integer> q = new LinkedList<Integer>();
//		// Adds elements {0, 1, 2, 3, 4} to the queue
//		 for (int i = 0; i < 5; i++)
//		 {
//		 q.add(i);
//		 }
//		 // Display contents of the queue.
//		 System.out.println("Elements of queue " + q);
//
//		 // To remove the head of queue.
//		 int removedelement = q.remove();
//		 System.out.println("removed element:" + removedelement);
//		 System.out.println("updated queue:" +q);
//
//		 // To view the head of queue
//		 int head = q.peek();
//		 System.out.println("head of queue:" + head);
//		 // To check size of Queue
//		 int size = q.size();
//		 System.out.println("Size of queue:"+ size); 
	}
}
