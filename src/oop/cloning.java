package oop;

// incompleted
// object cloning

// mostly we copy refernce address using another object
// but using clone we copy whole object

class Department{
	
	int deptId;
	String name;
	Department(int id,String n){
		deptId = id;  /// cloning copy occurs in int float double
		name =n;
		
		}
		void Display() {
			System.out.println("Dept Id is "+ deptId);
			System.out.println("Dept name is "+ name);
	}
	
}
class Student implements Cloneable{  /// indicate permisiion object clone to student
	int id;
	String name;  /// cloning copy occurs in int float double
   	Department dept;  // doesnt copy string and object class
	
	Student(int i, String n, Department d){
		id=i;  /// cloning copy occurs in int float double
		name=n; // doesr
		dept=d;
		
	}
	void Display() {
		System.out.println(" Id is "+ id);
		System.out.println("name is "+ name);
		dept.Display();
	}
	protected Object clone() throws CloneNotSupportedException {
		return super.clone();
	}
}
public class cloning {
	public static void main(String[] args) throws CloneNotSupportedException {
		Department dept =new Department(822,"physics");
		Student s1 = new Student(62,"Ishu",dept);
		Student s2 = (Student)s1.clone(); 
		dept.name="Maths";  // shallow copy 
		dept.deptId=833;
		s1.Display(); //overidding display method invoke both student s1 and department dept individually;  
		
		s2.Display();
	}

}
