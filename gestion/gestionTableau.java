package gestion;
import java.awt.event.*;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

import javax.swing.*;

public class gestionTableau {

public static void main(String[] args)throws Exception {  
    JFrame f2 = new JFrame();

   
    FileReader fii = new FileReader("gestionTableau.txt");

        try {
     
        BufferedReader br = new BufferedReader(fii);  
        String str;
        int nbrLine=0;
          //calculer le nombre des lignes dans le fichier
         while((str = br.readLine()) != null)
        {
         //Pour chaque ligne, incrémentez le nombre de lignes
         nbrLine++;               
            
         }
        
        while (fii.hasNextLine()) {
            String ch = fii.nextLine();
            String[] words = ch.split(" ");
            for (String word : words) {
            System.out.println(word);   
        }
        }
        fii.close();
        } catch (FileNotFoundException e) {
        System.out.println("An error occurred.");
        e.printStackTrace();
        }
        String data[4][nbrLine]={ {"1","Amit","670000","3"},    
        {"2","Jai","780000","3"},    
        {"3","Sachin","700000","3"}};     
        String column[]={"ID","name","price","quantity"};         
        JTable jt=new JTable(data,column);    
        jt.setBounds(0,70,200,300);          
        JScrollPane sp=new JScrollPane(jt);  

       

            
    JButton create= new JButton( "create");
    create.setBounds(0,0, 70,30);  
    //fenetre s'ouvre auclic du bouton create
    create.addActionListener(new ActionListener()
       {  
            public void actionPerformed(ActionEvent ae)
            {
           
                JFrame f= new JFrame("Label Example");  
                JLabel name,price,quantity,id;  
                id=new JLabel("id");  
                id.setBounds(20,20, 60,30); 
                name=new JLabel("Name");  
                name.setBounds(20,90, 60,30);  
                price=new JLabel("Price");  
                price.setBounds(20,160, 60,30);
                quantity=new JLabel("Quantity");  
                quantity.setBounds(20,230, 60,30);
                
                JTextArea Tid=new JTextArea("");  
                Tid.setBounds(100,20, 100,30);
                JTextArea Tname=new JTextArea("");  
                Tname.setBounds(100,90, 100,30);
                JTextArea Tprice=new JTextArea("");  
                Tprice.setBounds(100,160, 100,30);
                JTextArea Tquantity=new JTextArea("");  
                Tquantity.setBounds(100,230, 100,30);
                

                JButton save = new JButton("save");
                save.setBounds(40,280,60,60);
                JButton vider = new JButton("vider");
                vider.setBounds(160,280,60,60);
                JButton cancel = new JButton("cancel");
                cancel.setBounds(240,280,60,60);

                save.addActionListener(new ActionListener() {  
                    public void actionPerformed(ActionEvent ae) {
                            try {
                            // il true bech ki iji izid haja tetzed o matefsa5ch ili ken maktoub 9balha
                           
                            FileWriter fi = new FileWriter("gestionTableau.txt",true);
                            String ch1=Tid.getText();
                            String ch2=Tname.getText();
                            String ch3=Tprice.getText();
                            String ch4=Tquantity.getText();
                            
                            fi.write(ch1+" "+ch2+" "+ch3+" "+ch4+"\n");
                            fi.close();
                            System.out.println("Successfully wrote to the file.");
                            } catch (IOException e) {
                            System.out.println("An error occurred.");
                            e.printStackTrace();
                            }
                            f.dispose();
                    }
                });
                cancel.addActionListener(new ActionListener() { 
                    public void actionPerformed(ActionEvent ae) {
                      f.dispose(); 
                        
                    }
                });
                 vider.addActionListener(new ActionListener() { 
                    public void actionPerformed(ActionEvent ae) {
                        Tid.setText("");  
                        Tname.setText("");   
                        Tprice.setText(""); 
                        Tquantity.setText("");    
                        
                    }
                });
                  
                    f.add(id); f.add(name); f.add(price);  f.add(quantity); 
                    f.add(Tid);f.add(Tname);f.add(Tprice);f.add(Tquantity);
                    f.add(save); f.add(cancel); f.add(vider); 
                    f.setSize(700,700);  
                    f.setLayout(null);  
                    f.setVisible(true); 

               
            }
        }
    );
     
            
            
  

     f2.setSize(700,700); 
     f2.setVisible(true); 
     f2.add(create); 
     f2.add(sp); 
     
 




  }

}


