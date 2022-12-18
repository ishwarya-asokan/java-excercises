

	class boxover{// static variables and stati
		// constructor overloading
		//object as parameter in method and constructor//
		
		int length;//instance values
		int breadth;
		int height;
		static int boxCount;// static variables
		
		boxover(int l,int b, int h) {//constructor doesnt have return values//
			length=l; 
			breadth=b;
			height=h;
		    boxCount++;
		}
		
		boxover(){
		length=-1;
		breadth=-1;
		height=-1;
	    boxCount++;

		}
		
		static {
			boxCount=0;
			System.out.println("staic starts");
		}
		
		static void displayBoxCount() {
			System.out.println("objet count is" + boxCount);
		}
		
		boxover(int l){
			length=breadth=height=l;
		    boxCount++;

		}
		
		// incase int recieve pannanumna int create pannanum ||ly object recieve - new object create pannanum
		//object as parmeter in constructor
		// woodbox object receive - b1 
		
		boxover(boxover b1){  //copy consructor
			length=b1.length;
			breadth=b1.breadth;  // length-boardbox    b1.length- woodbox
			height=b1.height;
		    boxCount++;

			
		}
		
		void setValue(int l,int b, int h) {// for updating value using set value method  // int recieve panrathuku int l b h create panroom
			length=l;
			breadth=b;
			height=h;
		}
		
		
		int volume() {
			return length*breadth*height;
		}
		
		//avoid by access instance values on outside/must create set value method/constructor in class
		// incase int recieve pannanumna int create pannanum ||ly object recieve - new object create pannanum

		boolean isEqual(boxover b){// create object for passing object
			b.length++; // example for call by reference
			if (length==b.length && breadth==b.breadth && height==b.height)// length - invoke object , b.length - pass object
				return true;
				
		    return false;
		    }
		
		// object return//
		
		boxover doublebox() {
			//boxover nike = new boxover();
			//nike.length=length*2;
			//nike.breadth=breadth*2;
			//nike.height=height*2;
			//return nike;
			
			boxover nike=new boxover(length*2,breadth*2,height*2);// act like a object main function where pass parameter in constructor
			return nike;
			
			}
		}
	

	public class boxoverloading {
	public static void main(String[] args) {

	
		//constructor possible only in inizilizing values not for updating values
	    // constructor call only once at a time creating object
		System.out.println("before object create");
		
		boxover blackbox=new boxover(10,30,50);
		
		System.out.println("after object created");
		
		System.out.println("volume of black box is "+ blackbox.volume());
		
		boxover woodbox=new boxover(10,30,50);
		System.out.println("volume of black box is "+ woodbox.volume());
		

		boxover boardBox=new boxover(woodbox);    // passing object as parameter in constructor// copy constructor
		System.out.println(boardBox.length);
	
	    System.out.println(blackbox.isEqual(woodbox));//passing object as parameter in method 
	    // compare the objects have whether same parameter

				// blackbox invoke, woodbox pass panroom 
				// so woodbox object pass -> b objectla  - copy ayirku
	    
	    System.out.println(woodbox.length);//example for call by reerence
	    
		boxover goldbox =new boxover();  // no parameter
		
		boxover diamondbox= new boxover(6); // single parameter
		
		System.out.println(diamondbox.length);
		
		boxover high = new boxover(10,30,50);
		
		boxover low = new boxover(10,30,50);
		
		boxover medium = low.doublebox();// object return   nike hele -storage,
		//so nike reference address store in medium not store object
		System.out.println(medium.length);
		System.out.println(boxover.boxCount);
		boxover.displayBoxCount();
	
	}
	}




