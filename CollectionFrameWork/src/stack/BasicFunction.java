package stack;

import java.util.Stack;

public class BasicFunction {
/*
 * Stack is the child of Vector class. it is specially use for LIFO
 * last in first out method ,
 * there is only 5 special method specific to stack class. 
 * Stack class haply inherit all the parent interface. 
 */
	public static void main(String[] args) {
		Stack s = new Stack();
		// Stack specific method
		s.push("a");
		s.push("b");
		s.push("c");
		s.push("d");
		s.push("e");
		System.out.println("the stack elements are "+s);
		// search method will give the offset number of the element
		System.out.println(s.search("c"));
		// if element is not present it will give -1
		System.out.println(s.search("f"));
		//peek method:(Lifo patern) it will give you the first item without 
		// removing it.
		System.out.println("lifo style "+s.peek());
		// pop method: removing the last object lifo style
		 System.out.println(s.pop()+" the last object will be removed");
		 System.out.println(s +" printing after pop method");
		

	}

}
