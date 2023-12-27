import javax.swing.JOptionPane;

public class IfStatements {

    public static void main(String[] args) {

        int message = 1;

        while (true) {
            int age = Integer.parseInt(JOptionPane.showInputDialog("What is your age?"));

            if (age >= 18 && age < 60){
                JOptionPane.showMessageDialog(null, "You are an adult", "Your age", message);
            }
            else if (age >= 60 && age <= 129){
                JOptionPane.showMessageDialog(null, "Ok boomer", "Boomer", message);
            }
            else if (age <= 17) {
                JOptionPane.showMessageDialog(null, "You are a minor", "Your age", message);
            }
            else if (age >= 130) {
                JOptionPane.showMessageDialog(null, "You are dead", "Your age", message);
            }

        }
    }

}
