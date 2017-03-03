package stack;

import java.util.LinkedList;

public class StackMachine1 {

    public static void main(String[] args) {
       // System.out.println("Expected solution: 76");
        //System.out.println("Actual solution: " + getSolution("13p12d5+6-"));
    	getSolution("13 d 4 p 5 d + d + -");
    }

	public static int getSolution(String s) {
		LinkedList<Integer> stack = new LinkedList(); // 'Stack' would be a good class as well

		if (s == null || s.length() == 0)
			return -1;

		for (int n=0; n<s.length(); ++n) {
			char c = s.charAt(n);
			//char c=s.valueOf(n);
			//String c=s.substring(n);
			//char s=s.charAt(n)
			if (c >= '0' && c <= '9')
			{ // Check whether the char represents a digit
				stack.push(c - '0'); // Convert from char to int
				System.out.println("push ope:"+c);
				 for (Integer f:stack)
			     {
			    	 System.out.println(f);
			     }
			} 
			
			else if (stack.size() >= 2) 
			{ // There must be at least two entries on the stack in order to start operating
				if (c == '+') 
				{
					int x = stack.pop() + stack.pop();
					System.out.println("Add oper of 2 entiries" +x);
					if (x < 4096) // The stack entry cannot be bigger than 12-bit
						stack.push(x);
					else return -1;
					 for (Integer f:stack)
				     {
				    	 System.out.println(f);
				     }
				} 
				else if (c == '*') 
				{
					int x = stack.pop() * stack.pop();
					System.out.println("Multipli oper of 2 entiries " +x);
					if (x < 4096)
						stack.push(x);
					else return -1;
					 for (Integer f:stack)
				     {
				    	 System.out.println(f);
				     }
				}
				else if(c=='-')
				{
					int x=stack.pop()-stack.pop();
					stack.push(x);
					System.out.println("sub operation:"+x);
					 for (Integer f:stack)
				     {
				    	 System.out.println(f);
				     }
				}
				else if(c=='p')
				{
					int x=stack.pop();
					System.out.println("pop operation:" +x);
					 for (Integer f:stack)
				     {
				    	 System.out.println(f);
				     }
				}
				else if(c=='d')
				{
					int x=stack.pop();
					stack.push(x);
					stack.push(x);
					System.out.println("duplicate operation: "+x);
					 for (Integer f:stack)
				     {
				    	 System.out.println(f);
				     }
				}
				else return -1;
			} 
			else return -1;
		}
		System.out.println("================================");
     for (Integer f:stack)
     {
    	 System.out.println(f);
     }
		return stack.peek();
	}

}