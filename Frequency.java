public class Frequency {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int scores[]= {1,2,3,4,3,2,1,3,3,4,5,3,5,49,7};
        int frequency[]= new int[6];
        for(int answer=0;answer<scores.length;answer++){
            try{
                ++frequency[scores[answer]];
            }
            catch(ArrayIndexOutOfBoundsException e){
                System.out.println(e);
                System.out.printf("scores[%d]=%d\n\n", answer,scores[answer]);
        }    
            }
        System.out.println("ratings\t frequency");
        for(int rating=1;rating<frequency.length;rating++){
            System.out.printf("%5d%8d\n", rating,frequency[rating]);
        }
    }
    
}
