
public class AVERAGE {
    public static void main(String[] args) {
        
        int sum = 0;
        int counter=0;
        
        double average;
        for(int i=4;i<1000;i+=2){
            counter=counter+1;
            sum+=i;
       }
       
        
            average=(double)sum/counter;
            System.out.println("The sum of even numbers between 2 and 1000 is: "+sum);
            System.out.println("The average of the sum is: "+average);
            
            
            
        
            
        }
    }
    

