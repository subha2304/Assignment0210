package week1.day2;

public class Calulator {
	public int add() {
		int num1=1;
		int num2=2;
		int num3=3;
		int sum = num1+num2+num3;
		
		return sum;
	}
	 public int sub() {
		 int num1=2;
		 int num2=1;
		 int sub=num1-num2;
		 
		 return sub;
		 
	 }
	      public double mul() {
	    	  double num1=5;
	    	  double num2=2;
	    	  double product= num1*num2; 
	    	
	    	  return product;
	      }
	      public float div(){
	    	   float num1  = 10f;
	    	   float num2 = 2f;
	    	   float division=num1/num2;
	    	  
	    	   return division;
	      }

	public static void main(String[] args) {
		Calulator aspd = new Calulator();
		int result1 = aspd.add();
		int result2 = aspd.sub();
		double result3 = aspd.mul();
		float result4= aspd.div();
		System.out.println("the sum is"+result1);
		System.out.println("the sub is "+result2);
		  System.out.println("the product is"+result3);
		  System.out.println("the division is"+result4);
		
	}

}
