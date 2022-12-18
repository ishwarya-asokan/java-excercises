package oop;

class outer{
	int x;
	void outerDisplay() {
	System.out.println("Outer");
	}
	
static class runner{
		void runnerDislay(){
    System.out.println("runner");			
		}
	}

class inner{
	int y;
	void innerDislay(){
		System.out.println("Inner");
	}
	}
}


public class innerclass {
	
public static void main(String[] args) {
	
	outer o = new outer();
	o.outerDisplay();
	outer.inner i=o.new inner();// non static inner classs
	i.innerDislay();
	outer.runner r= new outer.runner();// static inner class
	r.runnerDislay();

	
}

}
