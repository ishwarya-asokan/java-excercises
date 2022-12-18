import java.util.Scanner;

public class odd {
	public static void main(String args[])
	{
		Scanner scanner=new Scanner(System.in);
		System.out.println("enter the value");
		int n=scanner.nextInt();
		int des,asen;
		System.out.println("Print odd numbers till n numbers ");
		for(int i=1;i<=n;i+=2) {
			System.out.println(i);
		}
		System.out.println("Print odd numbers till n numbers ");
		for(int j=1;j<=n;j++) {
			if(j%2!=0)
				System.out.println(j);
	    }
	
        System.out.println("Odd number in descending order:");
        for(int k=n;k>=1;k--) {
        	des=k*2-1;
        	System.out.println(k);
        }
        System.out.println("Odd number in asending order:");
        for(int l=1;l<=n;l++) {
        	asen=l*2-1;
        	System.out.println(l);
        }
		}
		
	}

