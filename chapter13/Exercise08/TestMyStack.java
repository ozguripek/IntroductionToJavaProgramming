package chapter13.Exercise08;

public class TestMyStack {

	public static void main(String[] args) throws CloneNotSupportedException {
		 MyStack stack1 = new MyStack();
		    for (int i = 0; i < 10; i++) {
		      stack1.push(i);
		    }

		    MyStack stack2 = (MyStack) stack1.clone();

		   
		    for (int i = 0; i < 3; i++) {
		      stack2.pop();
		      stack1.push(i);		     
		    }

		    System.out.println("stack1 " + stack1);
		    System.out.println("stack2 " + stack2);
		    System.out.println("Are the stacks equal? " + (stack1 == stack2));
		  
	}

}
