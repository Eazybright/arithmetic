
import javax.swing.JOptionPane;
public class boxes {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        String first_name,family_name,matric_number,institution,department,faculty,full_name;
        first_name=JOptionPane.showInputDialog("First name: ");
        family_name=JOptionPane.showInputDialog("Family name: ");
    matric_number=JOptionPane.showInputDialog("Enter your matric number:");
        department=JOptionPane.showInputDialog("Enter your department:");
        faculty=JOptionPane.showInputDialog("Enter your faculty:");
    institution=JOptionPane.showInputDialog("Enter your institution:");
    full_name="Name: "+first_name +" "+family_name+"\n" +"Institution: "+institution+"\n" +"Matric number: "+matric_number+"\n" +" " +"Faculty: " +faculty+"\n" +"Department: "+department;
    JOptionPane.showMessageDialog(null,full_name);
    System.exit(0);
    }
    
}
