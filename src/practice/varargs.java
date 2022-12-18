package practice;

public class varargs {
	
	/// smallest of three numbers
static int minVal(int...vals){
	int min=Integer.MAX_VALUE;
	for (int k:vals) {
		if(k<min)
		min=k;
	}
	 return min;  ///kind of recursion didnt return until all argments passed in loop
	}

	
	public static void main(String[] args) {
		int m = minVal(7,6,3,8,2);
		System.out.println(m);
		

}
	
}
