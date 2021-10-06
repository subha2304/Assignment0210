package week1.day2;

import java.util.Arrays;

public class Anagram {

	public static void main(String[] args) {
		String strTest1 = "stops";
		String strTest2 = "potss";
		int lengthstr= strTest1.length();
		int lengthstr1=strTest2.length();
//System.out.println("length: "+ lengthstr);
//System.out.println("length: "+ lengthstr1);
		char[] charArray = strTest1.toCharArray();
		for( int i=0;i<charArray.length;i++) {
		//	System.out.println("charArray["+i+"]" +charArray [i]);
	}
		char[] charArrayy = strTest2.toCharArray();
		for( int j=0;j<charArrayy.length;j++) {
		//	System.out.println("charArray["+j+"]" +charArray [j]);
	}
		
	
			Arrays.sort(charArray);   
			Arrays.sort(charArrayy);
			int count =0;
			for(int k = 0; k<lengthstr;k++) {   
				if(charArray[k]==charArrayy[k]) {
					count++;				
					} 
			}
				if(count==5) {
					System.out.println("It is an anagram");
				}
				else { 
						System.out.println("not an anagram");
					}
			}
			
			}
	


