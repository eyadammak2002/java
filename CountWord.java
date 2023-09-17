import java.awt.event.*;
import javax.swing.*;


public class CountWord {
    

public static void main(String[] args) {  
    JFrame f=new JFrame("Button Example"); 
    //zone d'affichage 
    final JTextField tf=new JTextField();  
    tf.setBounds(10,290, 150,20);
    //zone de saisie 
    JTextArea area=new JTextArea("");  
    area.setBounds(10,30, 200,200);
    // boutton  
    JButton b=new JButton("Click Here");  
    b.setBounds(10,250,95,30);
    b.addActionListener(new ActionListener(){  


public void actionPerformed(ActionEvent e){
            String ch=area.getText();
            int countWords = ch.split("\\s").length;
            tf.setText(String.valueOf(countWords));
        }  
    });  
    f.add(b);f.add(area);
    f.add(tf);
    f.setSize(800,800);
    f.setLayout(null);  
    f.setVisible(true);   
}  
}  
    
