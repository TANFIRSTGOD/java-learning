import javax.swing.JOptionPane;

public class HypotenuseCalculator {

    //calculate the hypotenuse function
    static double hypotenuse (double a, double b){
        
        double aroot = a*a;
        double broot = b*b;
        
        return Math.sqrt(aroot + broot);
    }

    public static void main (String[] args) {

        double a = Double.parseDouble(JOptionPane.showInputDialog("Input side a")); //prompts the user for side a
        double b = Double.parseDouble(JOptionPane.showInputDialog("Input side b")); //prompts the user for side b
        JOptionPane.showMessageDialog(null, "The hypotinuse of " + a + " and " + b + " is: " + hypotenuse(a, b)); //displays the awnser

    }

}