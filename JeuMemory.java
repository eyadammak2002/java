import javax.swing.*;
import java.awt.event.*;
public class JeuMemory {
    



  public static void main(String[] args)
  {
    JFrame frame = new JFrame("Exemple ActionListener");
    Icon icon = new ImageIcon("aaa.jpeg");
    Icon icon1 = new ImageIcon("rose.jpeg");
    Icon icon2 = new ImageIcon("violet.jpeg");
    
    JButton btn = new JButton(icon);
    JButton btn1 = new JButton(icon);
    JButton btn2 = new JButton(icon);
    JButton btn3 = new JButton(icon);
    JButton res = new JButton("reset");
    
    btn.setBounds(20,20,100,100);
    //Changer la valeur du bouton1 au clic
    btn.addActionListener(new ActionListener() {
       public void actionPerformed(ActionEvent ae) {
                      btn.setIcon(icon1);
       }
    });

       btn1.setBounds(20,140,100,100);
    //Changer la valeur du bouton2 au clic
    btn1.addActionListener(new ActionListener() {
       public void actionPerformed(ActionEvent ae) {
                      btn1.setIcon(icon2);
       }
    });

    btn2.setBounds(140,20,100,100);
    //Changer la valeur du bouton2 au clic
    btn2.addActionListener(new ActionListener() {
       public void actionPerformed(ActionEvent ae) {
                      btn2.setIcon(icon1);
       }
    });

    btn3.setBounds(140,140,100,100);
    //Changer la valeur du bouton1 au clic
    btn3.addActionListener(new ActionListener() {
       public void actionPerformed(ActionEvent ae) {
                      btn3.setIcon(icon2);
       }
    });

    res.setBounds(120,250,100,50);
       //Changer la valeur du bouton2 au clic
    res.addActionListener(new ActionListener() {
       public void actionPerformed(ActionEvent ae) {
                     
                      btn.setIcon(icon);
                      btn1.setIcon(icon);
                      btn2.setIcon(icon);
                      btn3.setIcon(icon);
       }
    });
    frame.add(btn);
    frame.add(btn1);
    frame.add(btn2);
    frame.add(btn3);
    frame.add(res);
    frame.setSize(250,250);
    frame.setLayout(null);
    frame.setVisible(true);
  } }
