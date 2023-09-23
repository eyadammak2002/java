import javax.swing.*;
import java.awt.event.*;


public class Course {
    int x=20;
    public static void main(String[] args)
  {
      Course c = new Course();
    JFrame frame = new JFrame("Exemple ActionListener");
    Icon icon = new ImageIcon("lapin.png");
    JButton btnl = new JButton(icon);
    JButton lance = new JButton("lancer");
    btnl.setBounds(c.x,20,200,200);
    lance.setBounds(20,240,50,50);

    lance.addActionListener(new ActionListener() {
        
        public void actionPerformed(ActionEvent ae) {
           
            while(c.x<300){
               c.x=c.x+1;
                System.out.println("x="+c.x);
               btnl.setBounds(c.x,20,200,200);
                
            }
           
        }
     });

    frame.add(btnl);
    frame.add(lance);
    
    frame.setSize(700,700);
    frame.setLayout(null);
    frame.setVisible(true);

  }
}