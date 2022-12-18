package oop;

enum level{
	BEGINNER,INTERMEDIATE,ADVANCE;
}
enum work{
	SMART("S"),HARD("H");
	private String abbr;
	
	work(String ab){
		abbr=ab;
	}
	
	public String getAbbr(){
		return abbr;
	}
}

public class enumuration {
	
public static void main(String[] args) {
	
	level l1= level.ADVANCE; //method1
System.out.println(l1);
work w1 = work.SMART;
System.out.println(w1.getAbbr()); //method 1
System.out.println(work.SMART.getAbbr()); //method 2
System.out.println(work.HARD); // method 2
System.out.println(level.ADVANCE.ordinal());
	
}
}
