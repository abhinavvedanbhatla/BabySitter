package main;

import java.util.Scanner;

public class BabySitter {

	private static Scanner sc;

	public static void main(String args[]){
	
	System.out.println("Enter startTime, bedTime and outTime in NUMBER:00PM/AM format");
	sc = new Scanner(System.in);	
	int inTime = timeProcessing(sc.nextLine());
	int bedTime = timeProcessing(sc.nextLine());
	int outTime = timeProcessing(sc.nextLine());

	int salary = salary(inTime,bedTime, outTime);
	System.out.println("Total Salary: "+salary);
	
	}
	public static int timeProcessing(String a){
		a=a.toLowerCase();
		String var[] = a.split(":");
		String var1 = a.substring(a.length()-2);
		int x = Integer.parseInt(var[0]);
		if(var1.equals("pm") && x >= 5){
			x = x + 12;
		}
		else if(var1.equals("am") && x <= 4)
		{
			return x;
		}
		
		else{
			//System.out.println("invalid entries");
			return 13;
		}
			

		
		return x;
	}
	
	public static int salary(int inTime,int bedTime,int outTime){
		int salary =0;
		if( inTime >=17 && outTime <=4 && bedTime > inTime){
			salary = salary + ((bedTime-inTime)* 12 );
			salary = salary + ((24-bedTime)*8);
			salary = salary + ((outTime)*16);
			return salary;
			}
		else{
			
			System.out.println("invalid time entries");
			
		}
		return salary;
		
	}

}
