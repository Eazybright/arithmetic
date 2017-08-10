/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author PC
 */
public class AVERAGE {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int sum = 0;
        int counter=0;
        double average;
        
        for(int i=4;i<10;i+=2){
            sum=sum+i;
            counter=counter+1;
            i=i+2;
        }
            average=(double)sum/counter;
            System.out.println(average);
            
            
            
        
            
        }
    }
    

