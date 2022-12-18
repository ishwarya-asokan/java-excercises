package oop;
class A{
	void dislay(){
		System.out.println("print A");
	}
}

	class B{
		void dislay() {
			System.out.println("print B");
		}
	}
	class C extends B { // access method nearest super class
			
		}
					
public class multipleInher {
	
	public static void main(String[] args) {
		
		C c = new C();
		c.dislay();
	}
	
}
