import javax.swing.*;
import java.awt.event.*;

public class CourseThread  {
    
  
        public static void main(String[] args) {
            
            Animal A1=new Animal("chat.png",20,"chat");
            Animal A2=new Animal("lapin.png",140,"lapin");
           
            JFrame frame = new JFrame("Exemple ActionListener");
            
            JButton lance = new JButton("lancer");
            lance.setBounds(20,240,50,50);

            lance.addActionListener(new ActionListener() {
                public void actionPerformed(ActionEvent ae) {
                    
                    A1.start();
                    A2.start();
                }
             });


             
         
        
            frame.add(A1.a);
            frame.add(A2.a);
            frame.add(lance);
            
            frame.setSize(1200,700);
            frame.setLayout(null);
            frame.setVisible(true);
        }
       
      
}
      
     
    
