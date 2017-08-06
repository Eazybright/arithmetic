/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author PC
 */
public class Currency {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       System.out.println("A PROGRAM TO CONVERT A SUM OF MONEY IN NAIRA TO DOLLAR");
        
        obtainMoney(3000.00);
        obtainRate(250.00);
        double A= obtainConversion( 3000.00,250.00);
        double B= displayResult(A);
                        System.out.println("The dollar equivalent is $"+B) ;
}
public static void obtainMoney(double money){
                                 System.out.println("The amount of the money is #"+money);

    }
    public static void obtainRate(double rate){
                          rate=250.00;
                          
        System.out.println("The rate is $250.00 per #1");
    }
              public static double obtainConversion(double money, double rate){
                  double Conversion= money/rate;

                  return Conversion;

              }
    public static double displayResult(double Result){
        
        return Result;
    }
}


    
    

