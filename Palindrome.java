package week1.day2;

public class Palindrome {

	public static void main(String[] args) {
		
		String str1="subha";
		String strrev="";
		//char[] charArray=str1.toCharArray();
		for(int i=str1.length()-1;i>=0;i--) {
			strrev=strrev+str1.charAt(i);
		}
		System.out.println(strrev);
		if(str1.equals(strrev))
		{ 
			System.out.println(str1+"is a palindrome");
			
		}
		else
		{
			System.out.println(str1+"is not a palindrome");
		}
}}
