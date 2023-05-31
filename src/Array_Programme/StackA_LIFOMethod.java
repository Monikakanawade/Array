package Array_Programme;

import java.util.Stack;

public class StackA_LIFOMethod {
	
	public void stack() {
		
		Stack s = new Stack();       //LIFO Operatio (last in first out)
		
		s.push("pooja");
		s.push("prachi");            //add - stack class = push method
		s.push("pallu");                
		
		System.out.println(s);
		s.pop();                     //pop method = remove(last value)
		System.out.println(s);
	}
public static void main(String[] args) {
	StackA_LIFOMethod m = new StackA_LIFOMethod();
	m.stack();
}
}
