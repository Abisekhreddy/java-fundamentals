package sample;

import java.util.*;

public class Sixth {

	public static void main(String[] args)
	{
	Scanner sc=new Scanner(System.in);
	String gender=sc.next();
	if(gender.equals("Female") && (Integer.parseInt (args[0])>=1 && Integer.parseInt (args[0])<=58))
		System.out.println("The percentge of interest is 8.2%");
	else if(gender.equals("Female") && (Integer.parseInt (args[0])>=59 && Integer.parseInt (args[0])<=100))
		System.out.println("The percentge of interest is 9.2%");
	else if(gender.equals("male") && (Integer.parseInt (args[0])>=1 && Integer.parseInt (args[0])<=58))
		System.out.println("The percentge of interest is 8.4%");
	else if(gender.equals("male") && (Integer.parseInt (args[0])>=59 && Integer.parseInt (args[0])<=100))
		System.out.println("The percentge of interest is 10.5%");
	}

}
