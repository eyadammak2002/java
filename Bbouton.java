import java.awt.event.*;  
import javax.swing.*;    
public class Bbouton {  
     int s=20;
public static void main(String[] args) {  
   Bbouton a=new Bbouton();
    JFrame f=new JFrame("Button Example");  
    Icon icon = new ImageIcon("lapin.png");
    JButton tf = new JButton(icon);
    tf.setBounds(a.s,20, 100,100);  
    JButton lence=new JButton("Click Here");  
    lence.setBounds(20,140,95,30);  
    lence.addActionListener(new ActionListener(){  
public void actionPerformed(ActionEvent e){ 
            while(a.s<100){
            tf.setBounds(a.s,20,100,100);  
            System.out.println("x="+a.s);

            a.s++;
            }
        }  
    });  
    f.add(lence);f.add(tf);  
    f.setSize(400,400);  
    f.setLayout(null);  
    f.setVisible(true);   
}  
}  
    
