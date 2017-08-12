/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author PC
 */
public class Stars {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int A[]={0,0,0,0,2,3,1,2,4,2,1}; 
        System.out.println("GRADE DISTRIBUTION");
        for(int i=0;i<A.length;i++){
            if (i!=10)
                System.out.printf("%02d-%02d: ",i*10,i*10+9);
                else
                System.out.printf("%5d: ",100);
            //print bars of asterisks
        for(int stars=0;stars<A[i];stars++){
            System.out.print(" * ");
           
        }
         System.out.println();
        }
        }
}
