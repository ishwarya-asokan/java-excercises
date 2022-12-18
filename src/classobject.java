class box1{
	int length;
	int breadth;
	int height;
	
	int volume() {
		return length*breadth*height;
	}
}
public class classobject {

public static void main(String[] args) {
	
	box1 blackbox=new box1();
	blackbox.length=10;//instance variable
	blackbox.breadth=12;
	blackbox.height=16;
	//using object to call method is call invoke
	System.out.println("volume of black box is "+ blackbox.volume());
	box1 woodbox=new box1();
	woodbox.length=19;//not passing values outside is not advisable and cant controlable
	woodbox.breadth=22;
	woodbox.height=15;
	System.out.println("volume of black box is "+ woodbox.volume());
	
}
}
