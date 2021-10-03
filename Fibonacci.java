package week1.day1;

import java.util.Iterator;

public class Fibonacci {

	public static void main(String[] args) {
		int range=8;
		int firstnum=0;
		int secondnum=1;
		int sum;
		System.out.println(firstnum);
	
	
	 for(int i=1;i<=range;i++) {
		sum=firstnum+secondnum;
	firstnum=secondnum;
	  secondnum=sum;
	  System.out.println(sum);
	 
	}
}	 
		
}	


