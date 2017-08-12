package org.dhawal.codechef;

public class SnakesAndMangooseElection {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//String sa = "smsmsmmmsms";
		//String sa = "smsmsmmmsms";
//		String sa = "sm";
//		String sa = "ssm";
//		String sa = "sms";
//		/String sa = "ssmmmssss";
		String sa = "m";
		StringBuilder s = new StringBuilder(sa);
		int mCount=0, xCount = 0;
		for(int i=0; i<s.length(); i++) {
			if(s.charAt(i) == 'm') {
				mCount++;
				if(i-1 >= 0 && s.charAt(i-1) == 's') {
					s.setCharAt(i-1, 'x');
					xCount++;
					//s.deleteCharAt(i-1);
				}
				else if(i < s.length()-1 && s.charAt(i+1) == 's') {
					s.setCharAt(i+1, 'x');
					xCount++;
					//s.deleteCharAt(i+1);
				}
			}
		}
		int sCount = s.length() - mCount - xCount;
		if(sCount == mCount) {
			System.out.println("tie");
		} else if(sCount > mCount) {
			System.out.println("snakes");
		} else System.out.println("mongooses");
	}

}
