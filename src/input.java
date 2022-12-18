import java.util.Scanner;
public class input {
public static void main(String args[]) {
	Scanner scanner=new Scanner(System.in);
	System.out.println("what is yr name");
	String name=scanner.nextLine();
	System.out.println("hai " + name);
	System.out.println("what is yr rating out o 5");
	int rating=scanner.nextInt();
	scanner.nextLine();// to avoid error after integer
    System.out.println(" what is yr last name");
    String lastname=scanner.nextLine();
}
}