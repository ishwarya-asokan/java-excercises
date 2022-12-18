class box{
		int length;//instance values//constructor method
		int breadth;
		int height;
		
		box(int l,int b, int h) {//doesnt have return values
			length=l;
			breadth=b;
			height=h;
		}
		void setValue(int l,int b, int h) {
			length=l;
			breadth=b;
			height=h;
		}
		int volume() {
			return length*breadth*height;
		}//avoid by access instance values on outside/must create set value method/constructor in class
		
		}// for updating value using set value method 

public class objectpart2constructor {
	public static void main(String[] args) {
		
		box blackbox=new box(10,30,50);//constructor possible only in inizilizing values not for updating values
		// constructor call only once at a time creating object
		blackbox.setValue(30,20,10);
		System.out.println("volume of black box is "+ blackbox.volume());
		
		box woodbox=new box(20,80,10);
		System.out.println("volume of woodbox box is "+ woodbox.volume());
		
	}
	}


