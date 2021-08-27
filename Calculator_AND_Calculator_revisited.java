package activityjava;

public class Calculator_AND_Calculator_revisited {
	// Calculator + Calculator Revisited
		public static void main(String[] args) {
		 // TODO Auto-generated method stub
		
		 calcmult(5,3);
		 calcdiv (5,3);
		 calcsub(5,3);
		 calcadd(5,3);
		 calcdivrev(1,3);
		
		 }
		
		 private static void calcadd(int num1, int num2) {
		 // TODO Auto-generated method stub
		
		 System.out.println("Sum = "+(num1+num2));
		}
		
		 private static void calcmult(int num1, int num2) {
		 // TODO Auto-generated method stub
		
		 System.out.println("Mult ="+(num1*num2));
		}
		
		 private static void calcdivrev(float num1, float num2) {
		 // TODO Auto-generated method stub
		
		 if(num1 < num2 ) {
		
		 System.out.println("Divrev (1/3) ="+(num1/num2));
		
		 } else {
		 System.out.println("Division cannot be performed!");
		 }
		 }
		
		 private static void calcsub(int num1, int num2) {
		 // TODO Auto-generated method stub
		
		 System.out.println("Sub = "+(num1-num2));
		
		 }
		 private static void calcdiv(float num1, float num2) {
		 // TODO Auto-generated method stub
		
		 System.out.println("Div ="+(num1/num2));
		 }
		 
}
