
public class method {//ordinaru method - output in methood (NOT RETURN)

	static void boxVolume(int length,int breadth,int height){//without object call-static
		int vol;// void for not return value in method
		vol = length*breadth*height;
		System.out.println(vol);//but we must return value in method (void isjust ex)
	}
    public static void main(String[] args) {
    	System.out.println("helo");// method call
	    boxVolume(20,30,50);// passing arguments call must
	    boxVolume(56,92,152);
}
}///first main function execute next method execute(1 helo 2 vol value)



