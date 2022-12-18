
public class classmethod {// ordinaru method/- output in Main function  (RETURN)
	static int boxVolume(int length,int breadth,int height){//without object call-static
		int vol;
		vol = length*breadth*height;
		return vol;
	
	}
	static void line() {
		System.out.println("------------------");
	}
    public static void main(String[] args) {
    	System.out.println("helo");// method call
	    int volume=boxVolume(52,62,12);// passing arguments calll must
	    System.out.println(volume);
	    System.out.println(boxVolume(52,66,52));
	    line();
	    line();

	
}
}
