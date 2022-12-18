package stackdemo;

public class stack{
	public static void main(String args[]) {
		stacknew s1 = new stacknew();
		s1.push(9);
		s1.push(6);
		s1.push(3);
		s1.pop();
		System.out.println("current/top of stack " + s1.pop());
		
}
}