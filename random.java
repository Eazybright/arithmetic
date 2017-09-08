package ezekiel;

import java.util.Random;
public class random {
public static void main(String[]args) {
	System.out.println("A PROGRAM TO TOSS A DICE");
	//creating random class
	Random randomValue=new Random();
	System.out.println("The result is displayed below");
	//loop 30 times
	for(int counter=1;counter<=30;counter++) {
		//determine integer range
		int face=1+randomValue.nextInt(6);
		
		//output result
		System.out.printf("%3d",face);
		//if counter is divisible by 5, start a new line
		if(counter%5==0)
			System.out.println();
	}
}
}
