package stackdemo;
 
 public class stacknew{     
	private int s[] = new int[10]; //access control avoid s.s[1]=22 in  main function
    private int tos;	
	stacknew() {
		tos=-1;
	}
	public void push(int item) {
		if (tos==9)
			System.out.println("stack is full");
		else
		s[++tos]=item;
		
	}
	public int pop() {
		return s[tos--];
	}
}
