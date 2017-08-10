import java.util.Scanner;
public class Quadratic {
/*
 *  using the formula a(x * x) + bx + c
 *  
 */
	public static void main(String[] args) {	
		
		Scanner input = new Scanner(System.in);
		 double a, b , c , factor, factor2;
		 
		 
		System.out.println("input A");  // prompt
		 a = input.nextDouble();
		
		 System.out.println("input B");  // prompt
		 b = input.nextDouble();

		 System.out.println("input C ");  // prompt
		 c = input.nextDouble();
		 
		 
		 
		 double discriminant = ((b * b) - (4 * a * c));
		 
		 // computing the factors
		factor = ( - b + Math.sqrt(discriminant))/(2*a);
         factor2 = (-b - Math.sqrt(discriminant))/(2*a);
         
		 if (discriminant > 0){
		
         System.out.println("factor 1: "+ (int)(factor * 100) / 100.00 );
         System.out.println("factor 2: "+ (int)(factor2 * 100) / 100.0);
		 }// end of if
		 
		 else if (discriminant == 0){
			System.out.println("The equation has only one distinct sollution ");
			 System.out.println("factor : "+ (int)(factor2 * 100) / 100.0);

		 }// end of else if
		 else {
		System.out.println("The equation has no real roots");	
		 }// end of else
		 
	}// end method main

}// end class Quadratic
    
    
