

import javax.swing.*;

public class Animal extends Thread {

    int x=20; 
    int y;
    Icon icon ;
    String name;
    JButton a;
    Animal(String stricon ,int y,String name){
      this.y=y;
      this.name=name;
      this.icon = new ImageIcon(stricon);
      this.a= new JButton(icon);
      this.a.setBounds(x,y,100,100);
    }
  @Override
  public void run(){
     
      while(this.x<1000){
      this.x=this.x+(int)(Math.random() * 50);  // 0 to 100
      ;

      System.out.println(this.name+": x: "+this.x+" y: "+this.y);
      this.a.setBounds(this.x,this.y,100,100);
      try {
        sleep(10);
      } catch (InterruptedException e) {
        // TODO Auto-generated catch block
        e.printStackTrace();
      }
     
   }
     

    }    
}

   

   

  