import javax.swing.JOptionPane;

public class SwitchCase {
    
    static int msg = 1;

    public static void main(String[] args) {

        String day = JOptionPane.showInputDialog("What day is it");

        switch(day) {
            case "Sunday": 
                JOptionPane.showMessageDialog(null, "It is Sunday!", "day", msg);
                break;
            case "Monday":
                JOptionPane.showMessageDialog(null, "It is Monday!", "day", msg);
                break;
            case "Tuesday":
                JOptionPane.showMessageDialog(null, "It is Tuesday!", "day", msg);
                break;
            case "Wednesday":
                JOptionPane.showMessageDialog(null, "It is Wednesday!", "day", msg);
                break;
            case "Thursday":
                JOptionPane.showMessageDialog(null, "It is Thurday!", "day", msg);
                break;
            case "Friday":
                JOptionPane.showMessageDialog(null, "It is Friday", "day", msg);
                break;
            case "Saturday":
                JOptionPane.showMessageDialog(null, "It is Saturday!", "day", msg);
                break;
            default:
                JOptionPane.showMessageDialog(null, day + " is not a valid day!", "day", 0);
        }

    }

}