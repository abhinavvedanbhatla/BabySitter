package main;

public class BabySitter {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

	public int timeProcessing(String time) {
		// TODO Auto-generated method stub
		time =time.toLowerCase();
		String temp[] = time.split(":");
		String ante_postMeridiem = time.substring(time.length()-2);
		int timeValue = Integer.parseInt(temp[0]);
		
		if(ante_postMeridiem.equals("pm") && timeValue >= 5){
			timeValue = timeValue + 12;
		}
		else if(ante_postMeridiem.equals("am") && timeValue <= 4)
		{
			return timeValue;
		}
		else{
			return 13;
		}
		return timeValue;
	}

	public int salary(int inTime, int bedTime, int outTime) {
		// TODO Auto-generated method stub
		int salary = 0;
		if( inTime >= 17 && outTime <= 4 && bedTime > inTime){
			salary = salary + ((bedTime-inTime)* 12 );
			salary = salary + ((24-bedTime)*8);
			salary = salary + ((outTime)*16);
			return salary;
		}
		else
			System.out.println("Invalid Entries");
		return salary;
	}

}
