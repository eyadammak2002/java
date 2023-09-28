package gestion;
import java.awt.event.*;
import java.io.FileWriter;
import java.io.IOException;

import javax.swing.*;  
public class GestionArticle {
    public static void main(String[] args) {  
    JFrame f= new JFrame("Label Example");  
    JLabel name,price,quantity;  
    name=new JLabel("Name");  
    name.setBounds(20,20, 60,30);  
    price=new JLabel("Price");  
    price.setBounds(20,90, 60,30); 
    quantity=new JLabel("Quantity");  
    quantity.setBounds(20,160, 60,30);
   

    JTextArea Tname=new JTextArea("");  
    Tname.setBounds(100,20, 100,30);
    JTextArea Tprice=new JTextArea("");  
    Tprice.setBounds(100,90, 100,30);
    JTextArea Tquantity=new JTextArea("");  
    Tquantity.setBounds(100,160, 100,30);

    JButton save = new JButton("save");
    save.setBounds(40,220,60,60);
    JButton cancel = new JButton("cancel");
    cancel.setBounds(160,220,60,60);

    save.addActionListener(new ActionListener() {
        
        public void actionPerformed(ActionEvent ae) {
                try {
                // il true bech ki iji izid haja tetzed o matefsa5ch ili ken maktoub 9balha 
                FileWriter myWriter = new FileWriter("gestionArticles.txt",true);
                 String ch1=Tname.getText();
                 String ch2=Tprice.getText();
                 String ch3=Tquantity.getText();
                myWriter.write(ch1+" "+ch2+" "+ch3+"\n");
                myWriter.close();
                System.out.println("Successfully wrote to the file.");
                } catch (IOException e) {
                System.out.println("An error occurred.");
                e.printStackTrace();
                }
        }
      });
      cancel.addActionListener(new ActionListener() { 
        public void actionPerformed(ActionEvent ae) {
             Tname.setText("");   
             Tprice.setText(""); 
             Tquantity.setText("");    
              
        }
      });

    f.add(name); f.add(price);  f.add(quantity);  
    f.add(Tname);f.add(Tprice);f.add(Tquantity);
    f.add(save); f.add(cancel);
    f.setSize(700,700);  
    f.setLayout(null);  
    f.setVisible(true);  

    }  
}
