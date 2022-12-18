package practice;

public class callbyvalue {
	static void increment(int a) {
		System.out.println(++a);
		++a;

	}
	public static void main(String args[]) {
		int a = 10;
		increment(a);
		System.out.println(a);

		
	}

}
