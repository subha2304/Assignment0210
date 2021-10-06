package week1.day2;

public class ChangeOddIndexToUpperCase {

	public static void main(String[] args) {
		String strTest="changeme";
		char[] charArray = strTest.toCharArray();
	for( int i=0;i<charArray.length;i++) {
			System.out.println("charArray["+i+"]" +charArray [i]);
	}
		for( int j=0;j<charArray.length;j++) {
		if (j%2!=0) {
		System.out.println(Character.toUpperCase(charArray[j]));		
		}
		}
	}

}
