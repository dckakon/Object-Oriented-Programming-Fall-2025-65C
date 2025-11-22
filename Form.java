import javax.swing.*;    // package for Swing components-> jButton, JFrame, JLabel, JTextField
import java.awt.*;      // package for Layout Managers -> FlowLayout, GridLayout
import java.awt.event.*;    
public class Form {
    public static void main(String[] args) {
        JFrame frame=new JFrame("Login Form");
        frame.setSize(600,300);
        frame.setLayout(new BorderLayout()); //  optional

        JPanel panel = new JPanel(new GridLayout(4, 2, 5, 5));

        // creating components
        
        JLabel l1=new JLabel("Email:");
        JTextField t1=new JTextField(40);
        JLabel l2=new JLabel("Name:");
        JTextField t2=new JTextField(40);

        JButton button = new JButton("Sign Up");

        //JPanel to hold components    
        
        panel.add(l1);
        panel.add(t1);
        panel.add(l2);
        panel.add(t2);
        panel.add(button);

        button.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e){
                String email=t1.getText();
                String name=t2.getText();

                String message="Email: "+email+"\n name: "+name;

                JOptionPane.showMessageDialog(frame, message,
                    "Login Information", JOptionPane.INFORMATION_MESSAGE);
            }
        });
        frame.add(panel);
        frame.setVisible(true);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}

// GUI - Graphical User Interface
// Form ,  Facebook -> Login Form -> Email, Password, Login Button