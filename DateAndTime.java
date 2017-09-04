
package date.and.time;
import java.util.Calendar;
public class DateAndTime {

    public static void main(String[] args) {
      Calendar datetime=Calendar.getInstance();
        
       System.out.printf("Today's date is: %1$tA, %1$tB %1$td, %1$tY.%n",datetime);
       System.out.printf("The current time is: %tr\n",datetime);
       
    }
    
}
