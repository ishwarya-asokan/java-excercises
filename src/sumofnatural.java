import java.util.Scanner;

public class sumofnatural {
public static void main(String args[])
{
	Scanner scanner=new Scanner(System.in);
	System.out.println("enter the value");
	int n=scanner.nextInt();
	int sumNat=0;
	for(int i=1;i<=n;i++) {
		sumNat=sumNat+i;
	
	}
    System.out.println("result is " + sumNat);

	}
	
}

