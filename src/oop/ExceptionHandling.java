package oop;
import java.io.*;
import java.util.Scanner;
 
// try catch is used to handle error in particular section and also execute full program without error message 
public class ExceptionHandling {
	
	public static void main (String[] args) // throw decleration in main () doesnt complete the full program
	{
		
		int a=10;
		int b=5;
		int c=0;
		
		try {
			//int arr[]=null;                          // execute first try error, ignore all other try error and execute corresponding catch
			//System.out.println(arr[1]);              // IF without error in try, execute all try and dont execute catch errors
		 c=a/b; // system throw // unchecked error - compiler not checked - runtime error 
		//throw new NullPointerException(); //throw custom  exception define
	}
		catch(NullPointerException e)  {   // 	object exception- class   e - object throw panratha reciceve panum

			System.out.println("Expected pointer Error occurs");
			
		}
		//		catch(NullPointerException e|ArithmeticException e)
		
catch(ArithmeticException e)  {   // 	object exception- class   e - object throw panratha reciceve panum

	System.out.println("Expected Error occurs");
	System.err.println("Expected Arithmetic Error occurs"); // err indicate red output statement
	                               	
	}
		
		
		catch(Exception e)  {   // 	object exception- class   e - object throw panratha reciceve panum

			System.out.println("Expected Error occurs");
			
		}
		
		
		finally {
			System.out.println("This get printed whatever no matter");
		}
		System.out.println(c);
		System.out.println("End of Program");
		
		// file handling
	//	File file = new File("abc.txt");// checked error identified by compiler //file object create
//try {
//	FileInputStream fs= new FileInputStream(file);
//} catch (FileNotFoundException e) {
	// TODO Auto-generated catch block
//	e.printStackTrace();
//} // file process
int i=0;
//try (Scanner scanner = new Scanner(System.in)) {  // try with resource// Scanner.close(); properly close scanner resource
	// using try to closes scanner resource

	// i= scanner.nextInt();
	 
	// scanner.close(); close the resources
//}
 System.out.println(i);
		
		double bal=500, withdraw=700;
		try {
		if(bal<withdraw)
			throw new InsufficientFundException(withdraw-bal);
		
		}
		catch(InsufficientFundException e){
		System.out.println("not sufficient amount");
}	 
}

}