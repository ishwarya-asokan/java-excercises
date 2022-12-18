
public class nestedloopbreakcontine {
	public static void main(String args[]) {
		outer:
		for(int i=1;i<=5;i++) {
			inner:
			for(int j=1;j<=i;j++) {
				if(i==4&&j==4) 
					continue outer;
				System.out.print("*");
				}
			System.out.print("\n");	
				
		}
		for(int i=1;i<=5;i++) {
			for(int j=1;j<=i;j++) {
				System.out.print(i);
				}
			System.out.print("\n");
		}
		for(int i=1;i<=5;i++) {
			for(int j=0;j<=i;j++) {
				System.out.print(i+j);
				}
			System.out.print("\n");
		}
				
	}

}
