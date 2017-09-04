
import java.util.Scanner;
public class Height {
    public static void main(String[] args) {
        
        System.out.println("A PROGRAM TO CALCULATE THE AVERAGE HEIGHTS OF BOYS AND GIRLS IN A SCHOOL ");
    //IMPORTING SCANNER    
        Scanner keyboard=new Scanner(System.in);
        //INITIALIZUNG THE HEIGHTS OF THE BOYS 
        System.out.print("Enter the number of heights recorded for boys: ");
       int boys= keyboard.nextInt();
        int Bheight[]=new int[boys];
      
       //RECEIVING HEIGHTS FROM THE USER 
        System.out.println("Enter the heights of the boys: ");
       for(int h=0;h<boys;h++){
        Bheight [h]= keyboard.nextInt();
            }
       
        int Bsum=0;
       double Baverage;
       System.out.println("s/n \t Heights");
       for(int k=0;k<Bheight.length;k++){
        Bsum+=Bheight[k];
        
        System.out.printf("%5d%8d\n",k,Bheight[k]);
       }
       //CALCULATING THE AVERAGE HEIGHT OF THE BOYS
       Baverage=(double)Bsum/Bheight.length;
       System.out.println("The average heights of the boys is"+" "+Baverage);
       //INITIALIZING THE HEIGHTS OF THE GIRLS
        System.out.print("Enter the number of heights recorded for girls: ");
       int girls= keyboard.nextInt();
        int Gheight[];
        Gheight = new int[girls];
        //RECEIVING INPUT FROM USER
        System.out.println("Enter the heights of the girls: ");
        for(int f=0;f<girls;f++){
        
            Gheight [f]= keyboard.nextInt();
            }
       for (double f: Gheight){
           
           }

       double Gaverage;
       System.out.println("s/n \t Heights");
    int Gsum=0;
    for(int k=0;k<Gheight.length;k++){
        Gsum+=Gheight[k];
        
        System.out.printf("%5d%8d\n",k,Gheight[k]);
       }
    //CALCULATING THE AVERAGE HEIGHT OF THE GIRLS
       Gaverage=(double)Gsum/Gheight.length;
    System.out.println("The average height of the girls is"+" "+Gaverage);

   //CALCULATING THE TOTAL NUMBER OF STUDENTS IN THE SCHOOL
    int total=boys+girls;
    System.out.println("the total number of students= "+" "+total);
    
    }
    
            
       
    }
        
       
        
        
    
    


                
                
                
                
                
                
                
                
                
                
                
                
                
                
                
                
                
                
                
                
                
                
                
                
                
                
                
                
                
                
                
                
                
                
                
                
                
                
                
                
                
                
                
                
                
                
                
                
                
                
                
                
                
                
                
                
                
                
                
                
                
                
                
                
                
                
                
                
                
                
                
                
                
                
                
                
                
                
                
                
                
                
                
                
                
                
                
                
                
                
                
                
                
                
                
                
                
                
                
                
                
                
                
                
                
                
                
                
                
                
                
                
                
                
                
                
                
                
                
                
                
                
                
                
                
                
                
                
                
                
                
                
                
                
                
                
                
                
                
                
                
                
                
                
                
                
                
                
                
                
                
                
                
                
                
                
                
                
                
                
                
                
                
                
                
                
                
                
                
                
                
                
                
                
                
                
                
                
                
                
                
                
                
                
                
                
                
                
                
                
        