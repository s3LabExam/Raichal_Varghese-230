package CO5QN8;

import java.awt.*;
import java.awt.event.*;

public class keyEvents implements KeyListener
{
    Label lb1, lb2;
    TextField tf1;
    Frame fr;
    keyEvents()
    {
        fr = new Frame("KeyEventListener");
        lb1= new Label(" Key Events based on the actions", Label.CENTER);
        lb2= new Label();


        tf1 = new TextField(20);
        fr.setLayout(new FlowLayout());

        fr.add(lb1);

        fr.add(tf1);

        fr.add(lb2);

        tf1.addKeyListener(this);

        fr.setSize(460,250);

        fr.setVisible(true);
    }

    public void keyPressed(KeyEvent ev)
    {
        lb2.setText(" Key pressed");
    }

    public void keyReleased(KeyEvent ev)
    {
        lb2.setText("Released");
    }

    public void keyTyped(KeyEvent ev)
    {
        lb2.setText("Key is typed");

        fr.setVisible(true);
    }
    public static void main(String[] args)
    {
        new keyEvents();
    }
}