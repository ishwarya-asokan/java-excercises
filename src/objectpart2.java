class box4{
		int length;//instance values//set value method
		int breadth;
		int height;
		
		int volume() {
			return length*breadth*height;
		}//avoid by access instance values on outside/must create set value method/constructor in class

		void setValue(int l,int b, int h) {
			length=l;
			breadth=b;
			height=h;
		}
		void protected finalize() {// jvm- garbarge collector 
			
			                       //before memory dealocate by garbage collector finalalize methodla file close check?
		}// sometimes there is no chance of dealocate so finalize method is not called by garbage collector
	}
public class objectpart2 {
	public static void main(String[] args) {
		
		box4 blackbox=new box4();
		blackbox.setValue(20,30,90);
		System.out.println("volume of black box is "+ blackbox.volume());
		blackbox = null;// derefernce- remove unwanted memory
		box4 woodbox=new box4();
		woodbox.setValue(20,50,10);
		System.out.println("volume of black box is "+ woodbox.volume());
		woodbox = blackbox;//deference-no need previous woodbox reference(remove) by using blackbox reernce(use)
		
	}
	}