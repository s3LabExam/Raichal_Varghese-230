package CO5QN6;

import java.awt.*;
import java.applet.*;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
import java.awt.Graphics;

public class choose extends Applet implements ItemListener {
    Choice ch;
    String str;
    public void init(){
        ch =new Choice();
        ch.addItem("choose");
        ch.addItem("Rectangle");
        ch.addItem("Triangle");
        ch.addItem("Square");
        ch.addItem("Circle");
        ch.addItemListener(this);
        add(ch);
}
    public void paint(Graphics d){
        
        if(str=="Rectangle"){
        	d.setColor(Color.pink);
            d.fillRect(280,100,160,40);
        }
        if(str=="Triangle") {
            int[] x = new int[]{50, 50, 200};
            int[] y = new int[]{500, 400, 500};
            d.setColor(Color.yellow);
            d.fillPolygon(x,y,3);
        }
        if(str=="Square") {
        	d.setColor(Color.red);
            d.fillRect(100,100,100,100);
        }
        if(str=="Circle") {
        	 d.setColor(Color.green);
            d.fillOval(400,300,150,175);
       }
    }
    public void itemStateChanged (ItemEvent e)
    {
        str = ch.getSelectedItem();
        repaint();
    }
}