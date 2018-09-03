package practice02;

import java.util.Scanner;

public class Datetest2 {
	
	int year,month,date;
	
	public static void main(String args[])
	{
		Scanner input = new Scanner(System.in);
		
		Date test = new Date();
		
		Date setdate = new Date(5);
		Date setmonthdate = new Date(11,5);
		Date setyearmonthdate = new Date(2017,11,4);
		
		System.out.println(test);
		System.out.println(setdate);
		System.out.println(setmonthdate);
		System.out.println(setyearmonthdate);
		
	}
}
