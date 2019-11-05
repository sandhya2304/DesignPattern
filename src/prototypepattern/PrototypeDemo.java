package prototypepattern;

import java.util.Scanner;

public class PrototypeDemo {

	public static void main(String[] args) 
	{
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter id");
       int id =sc.nextInt();
       
       System.out.println("enter name");
		String name = sc.nextLine();
		
		System.out.println("enter designation :");
		String desig = sc.nextLine();
		
		EmployeeRecord er = new EmployeeRecord(id, name, desig);
		er.showRecord();
		System.out.println("\n");
		
		EmployeeRecord er2 = (EmployeeRecord) er.getClone();
		er2.showRecord();
		
	}

}
