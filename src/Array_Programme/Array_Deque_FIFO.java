package Array_Programme;

import java.util.ArrayDeque;

public class Array_Deque_FIFO {

public void deque() {
	
	ArrayDeque c = new ArrayDeque();      //FIFO Operation(first in first out)
	
	c.push("pooja");
	c.push("rahul");                   //push method = put info
	c.push("pratik");
	
	System.out.println(c);
	c.pop();                           //pop method = remove info
	System.out.println(c);
		
}
public static void main(String[] args) {
Array_Deque_FIFO A = new Array_Deque_FIFO();
A.deque();
}
}