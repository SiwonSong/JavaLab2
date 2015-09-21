import java.util.Stack;

public class ExampleHelloWorld {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Stack st = new Stack();
		// st.push(new Integer(1));
		// st.push(new Integer(2));
		//
		// System.out.println("pop1 : " + st.pop());
		// System.out.println("pop2 : " + st.pop());

		MyStack myStack = new MyStack(10);

		myStack.push(10);
		myStack.push(50);
		myStack.pop();
		myStack.push(7);
		myStack.push(15);
		myStack.push(20);
		myStack.pop();
		myStack.pop();
		myStack.pop();
		myStack.push(12);
		
	}

}
