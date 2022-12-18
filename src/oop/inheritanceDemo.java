package oop;
import java.util.*;

class Employee implements Comparable<Employee>{    // default predefined class comparable
	//// class create akkum pothu public kudakudath// parant super base //is a relatinship shape- base triangle-derived
	private double salary;
	protected String name;
	Employee(String n,double s){
		salary=s;
		name=n;
	}
	Employee(){
		salary= " ";
		name= 0.0;
	}
	
String getName(){
	return name;
}
void setName(String n){
	name=n;
}
double getSalary(){
	return salary;
}
void setSalary(double s){
	salary=s;
}
void raiseSalary(double percent){
	salary+= salary*percent/100;
	//double raise = salary*percent/100;
	//double totalSalary= bonus+salary;

}

void displayDetail() {
	System.out.println("name is " + name + " Total salary is " + salary ) ;
}

public int compareTo(Employee e){//obj compare obj2  // predefined default method int CompareTo()
	
	if(salary == e.salary)    // predefined sorting =0 >1  <-1
		return 0;
	if(salary<e.salary)
		return -1;
	return 1;
	
}
}

class Manager extends Employee{ /// derived class sub child
	private double bonus;
	
	Manager(String n, double s,double b){
		                             
		super(n,s);                    // super class constructor used to access n,s from IN PRIVATEbase class constructor         
		bonus=b;       
		name=n;                          // name=n;//salary=s; cannot access name and salary in private in base class CONSTRUCTOR
	}                                      // IF NOT PRIVATE DEFINE BELOW FOR AVOID ERROR in manager
	                                             // name=n;salary=s;
	                                             //Employee(){
	                                             //salary= " ";
	                                            //name= 0.0;
                                               //}
	
void setBonus(double b){
	bonus=b;
}
 double getSalary() { // Overriding
 return super.getSalary()+bonus;
}
void displayDetail() {
	System.out.println("name is " + getName() +" salary is "+ super.getSalary() + " bonus+salary is " + (super.getSalary()+bonus));
}
	}


public class inheritanceDemo {
	public static void main(String[] args) {
		Employee e1 = new Employee("Ram",35000);
		e1.raiseSalary(10);
		System.out.println("Total salary with raisesalary " + e1.getSalary()); // e1 access getsalary base
		
		Manager m1 = new Manager("Jomi",65000,0);
		m1.setBonus(5000);
		System.out.println("Total salary with bonus " + m1.getSalary()); // m1 access getsalary derived
		Employee e2= new Manager("shiv",36000,0); // Satisfy "is a "relation ship
		//here e2 base object store both manager reference and employee reference -polymorphism
		e1.displayDetail();
		m1.displayDetail();
			                                            //int[] arr= new int[50];
		Employee[] employees = new Employee[4];    // array can store particular limit 4
		employees[0]= new Employee("Ram",35000);   // arraylist can flexible unlimited
		employees[1]= new Employee("Raj",15000);
		employees[2]= new Employee("Ral",15000);
		employees[3]= new Manager("Jomi",65000,0);
		employees[2].setSalary(70000);
	
		//employees[3]= m1; possible
		//employees[3].setSalary(75000); possible
		//employees[2].setBonus(70000); not possible
		
		// check manager object in array
		//Manager m1;
		if(employees[3]instanceof Manager ) {
			m1= (Manager) employees[3];
			m1.setBonus(20000);
		}

		//Manager m1= (Manager) employees[3];//(manager) object cast in to emp3 for accessing bonus
		//m1.setBonus(20000);
		//employees[2].setSalary(70000); possible
		//employees[3].setSalary(75000); possible
		

		for(Employee e:employees) {/// for(int i:arr) 
			
			System.out.println(e.getName()+ "" + e.getSalary()) ;  
			// dynamic binding( in case m1 e.getsalary is automatically access respective m1.getSalary()  - for eachclass
			
			//dynamic binding - refer base class object, manager class object  refer , 
			//overide method invoke - correct object refer particular respective
		}
	
	Arrays.sort(employees); // .sort(obj) predefined method
	

	for(Employee e:employees) {/// for(int i:arr) 
		
		System.out.println(e.getName()+ "" + e.getSalary()) ;  
}
}
}


