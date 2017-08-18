/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author PC
 */
public class Passarrays {
    public static void main(String[] args) {
        // TODO code application logic hererray
        int array[]={1,2,3,4,5};
        System.out.println("Effect of passing reference to array\n"+
                "The values in the original array are:");
        for(int value : array)
            System.out.printf( " %5d:" , value);
            modifyArray(array);  
            System.out.println("\n\nThe values of the modified array are: ");
        
        for(int value:array)
            System.out.printf(" %5d:", value);
        
        System.out.printf("\n\nEffect of passing array elements value:\n"+
                "Array[3] before modifyElement:%d\n",array[3]);
        modifyElement(array[3]);
        System.out.printf("array[3] after modifyElement: %d\n",array[3]);
        
        
    }
    private static void modifyArray(int[] array2) {
        for(int i=0;i<array2.length;i++)
            array2[i]*=2;
        
     
    }

    private static void modifyElement(int element) {
element*=2;
System.out.printf("the value in modifyElement is: %d\n",element);
    
}        
    }

