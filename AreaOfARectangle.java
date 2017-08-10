/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author PC
 */
public class AreaOfARectangle {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
    System.out.println("A PROGRAM TO COMPUTE THE AREA OF A RECTANGLE");
        getlength(5);
    getbreadth(5);
    double AR= getarea(5,5);
    double BR= displayresult(AR);
    System.out.println("The area of a rectangle is "+BR +"cm^2");
    }
    public static void getlength(double length){
        System.out.println("The length is "+length+"cm");
    }
    public static void getbreadth(double breadth){
        System.out.println("The breadth is "+ breadth+"cm");
        
    }
    public static double getarea(double length, double breadth){
        double area=length*breadth;
        return area;
    }
    public static double displayresult(double result){
        return result;
    }
}
