
import java.util.Scanner;
public class Maximum {

    public static void main(String[] args) {
        System.out.println("A PROGRAM TO DETERMINE THE MAXMIMUM OF FIVE NUMBERS");
        // creating scanner class
        Scanner input=new Scanner(System.in);
         System.out.print("enter five integer numbers seperated with spaces: ");
        //read integer values
         int p=input.nextInt();
         int   q=input.nextInt();
           int r=input.nextInt();
           int m=input.nextInt();
         int t=input.nextInt();
        //determine maximum
         int result= maximum(p, q, r,m,t);
         //ouput result
         System.out.println("the max number is: "+result);
    }
//return the max 
         public static int maximum(int p, int q, int r, int m, int t ){
             
         int maximumvalue=p;
        if(q>maximumvalue)
            maximumvalue=q;
        
        if(r>maximumvalue)
            maximumvalue=r;    
        
        if(m>maximumvalue)
            maximumvalue=m;
        
        if(t>maximumvalue)
            maximumvalue=t;
        
        
        return maximumvalue;
    }
        
}