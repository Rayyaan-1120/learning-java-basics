import javax.swing.JOptionPane;

public class IntrotoGui {
    public static void main(String[] args) {

        //*this method showInputDialog returns a string to store it in other data types first we would have to parse the data types
        //*like Integer.parse
        
        String name = JOptionPane.showInputDialog("What is Your Name");
        JOptionPane.showMessageDialog(null,"Your name is " + name);

        int age = Integer.parseInt(JOptionPane.showInputDialog("Enter Your Age"));
        JOptionPane.showMessageDialog(null,"Your age is " + age);

        double height = Double.parseDouble(JOptionPane.showInputDialog("Enter Your Height"));
        JOptionPane.showMessageDialog(null,"Your height is " + height / 5.5);


    }
}
