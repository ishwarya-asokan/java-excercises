package oop;

import java.util.ArrayList;// nested package
import java.util.*;/// same name class name cannot conflict in different packages
import java.lang.Math;

////package name dont be same, so com.domainname
public class nestedPackageDemo{
	public static void main(String args[])
	{
		Date today=new Date();
		System.out.println(Math.sqrt(3));//or include java.lang.math.sqrt so that only put (sqrt(3))
}
}
