package main;

import java.util.Scanner;

public class BabySitterMain {
	private static Scanner sc;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BabySitter babySitter = new BabySitter();
		System.out.println("Enter startTime, bedTime and outTime in NUMBER:00PM/AM format");
		sc = new Scanner(System.in);	
		int inTime = babySitter.timeProcessing(sc.nextLine());
		int bedTime = babySitter.timeProcessing(sc.nextLine());
		int outTime = babySitter.timeProcessing(sc.nextLine());

		int salary = babySitter.salary(inTime,bedTime, outTime);
		System.out.println("Total Salary: "+salary);

	}

}
