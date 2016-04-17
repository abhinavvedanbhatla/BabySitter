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
	
	
}
