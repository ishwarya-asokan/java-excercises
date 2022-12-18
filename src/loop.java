import java.util.Scanner;
public class loop {
public static void main(String args[]) {
	Scanner scanner=new Scanner(System.in);
	System.out.println("enter the value");
	int n=scanner.nextInt();
	int fact=1;
	for(int i=1;i<=n;i++) {
		fact=fact*i;
	}
    System.out.println("result is " + fact);
	}
	
}