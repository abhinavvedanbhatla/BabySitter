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
		
		if(ante_postMeridiem.equals("pm")){
			timeValue = timeValue + 12;
		}
		
		else{
		
			return 13;
		}
		return timeValue;
	}

}
