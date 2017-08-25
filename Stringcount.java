public class Stringcount {

   
    public static void main(String[] args) {
        int letter_count=0;
        String check_word="Debugging";
        String single_letter="";
       
        for( int i=0;i<check_word.length();i++){
            single_letter=check_word.substring(i,i+1);
            if(single_letter.equals("g")){
                letter_count=0;
            }
        }
        System.out.println("G was found "+letter_count+" times.");
    }
    
}
