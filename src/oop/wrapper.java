package oop;

public class wrapper {  

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// sometimes we need classes in some cases ex ArrayLIst<Intger> i =new Arraylist<Integer>();
		//so that wrapper class is created because of datatypes
		// primitive data types have wrapped by class called wrapped class(Integer ,Byte,Float)
		
		int i =10;
		float f;
		Integer  i2=Integer.valueOf(i); //i2 object // boxing wraping
		
		int j=i2.intValue();//unboxing
		
		System.out.println(j);
		
		Integer i3=20;// auto boxing-  comPiler automatically CONVERT Integer.valueOf(i) //set value
		System.out.println(i3);
		
		int k=i3; //auto unboxing comPiler automatically CONVERT i2.intValue();//get value
		
		System.out.println(k);
		String s ="123";
		int i4=Integer.parseInt(s);
		System.out.println(i4);
		
		
	}

}
