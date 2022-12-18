package oop;

//interace what to do?  but not how to do // supports multiple inheritance
// class implementing interface, class must define abstract methods
// interface can extend other interfaces

// functional interface -single abstract method interface SAM interface 
// only functional interface can implement lambda 

interface Ridable{
	int Max=10;    // compiler always consider primitive value as final and static values
	void ride(); //compiler always consider as abstract class//single abstract method interace SAM interace
	default void dislay() { 
		                   // in previous version cant create other method in interface 
		                   //but new version create new method can define in interface by using default keyword 
		System.out.println("other methods in interface");
	}
			
}
class car implements Ridable{
	public void ride(){   // must put public otherwise shows error
System.out.println("car riding");
}
	public void display() {  /// can override the default method;
		System.out.println("hello from car class");
	}
}

class bike implements Ridable{
	public void ride()
	{System.out.println("bike riding");
	}
}
class Mechanic{
	void check(Ridable r)	{
		System.out.println("checking by Ridable r = c/b new car/bike ");
		r.ride();
	}
	}


class Interfaces {
	
public static void main(String args[]) {
	car c= new car();
	//Ridable r =  new car(); //cannot create object but r reference variable assign to car, cant create constructor in interace
	Mechanic m = new Mechanic();
	
	Ridable r = new Ridable() { // anonymous class method access by interface object
		                        // but new update...interface object can be created only by using anonymous class for only once
		public void ride()
		{System.out.println("vintage car riding");
		}
	};
		
	// anonymous class cannot be reusable for more than one object
    // can create anonymous class by override abstract method for only one object
    // cannot create anonymous class object more than one for same override method, that case we create  derived class to override
	
	Ridable r1 = new Ridable() { 
		
		// but new update...interface object can be created only for anonymous class for one overide method at once.
		
		public void ride()
		{System.out.println("tesla car riding");
		}
	};
	
	// functional interface -single abstract method interface SAM interface 
	// only functional interface can implement lambda
		
	Ridable r2 = () ->                                          // lambda expression
		System.out.println("convertible car car riding");
		
	
	m.check(c);
	 r.ride();
	r1.ride();
	r2.ride();
}

}

