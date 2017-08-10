/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author PC
 */
//importing
import java.util.Scanner;
public class Product {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner Ezekiel=new Scanner(System.in);
        int x,y,z,product;
        System.out.print("Enter the first number: ");
        x=Ezekiel.nextInt();
        System.out.print("Enter the second  number: ");
        y=Ezekiel.nextInt();
        System.out.print("Enter the third number: ");
        z=Ezekiel.nextInt();
        product=(x*y*z);
        System.out.println("The product of the three integers is"+" "+product);
        
    }
    
}
