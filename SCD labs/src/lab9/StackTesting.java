package lab9;
import java.util.*;
public class StackTesting {
	 void stack_push(Stack<Integer> S)
	 {
	 for(int i = 0; i < 5; i++)
	 {
	 S.push(i);
	 }
	 }
	 // Popping element from the top of the stack
	  void stack_pop(Stack<Integer> S)
	 {
	 System.out.println("Pop Operation:");

	 for(int i = 0; i < 5; i++)
	 {
	 Integer y = (Integer) S.pop();
	 System.out.println(y);
	 }
	 }
	 // Displaying element on the top of the stack
	  void stack_peek(Stack<Integer> S)
	 {
	 Integer element = (Integer) S.peek();
	 System.out.println("Element on stack top: " + element);
	 }

	 // Searching element in the stack
	  void stack_search(Stack<Integer> S, int element)
	 {
	 Integer pos = (Integer) S.search(element);

	 if(pos == -1)
	 System.out.println("Element not found");
	 else
	 System.out.println("Element is found at position: "
	+ pos);
	 } 
}
