package oop;

// anonymous class - avoid for creating derived class for only method overriding purpose 
// by creating nameless class with  method overriding in main function
class Cycle{
	void display(){
		System.out.println("i am a cycle");
	}
}

class Tricycle extends Cycle{
void display() {
		
	System.out.println("i am tricycle");
			}
}

public class annymous {
	public static void main(String args[]) {
		Cycle c = new Cycle()    // dont put semicolon on object decleration 
				                 //  put semicolon on the end of the method overriding closing bracket
		{                       // anonymous class method access by any class object
			void display()
			{
			System.out.println("i am a anonymous tricycle");
			}
	
		};       
		Cycle c1= new Cycle()   
		{
			
			void display(){
				System.out.println("i am a anonymous cycle");
		}
		};

		
		// anonymous class cannot be reusable for more than one object
	    // can create anonymous class by override abstract method for only one object
	    // cannot create anonymous class object more than one for same override method, that case we create  derived class to override
		
		Cycle c2 = new Cycle();
		c2.display();

		c.display();
		c1.display();
			
	}

}
