package CO5QN4;

import java.awt.*;
import java.awt.event.*;

public class home extends Frame implements MouseListener {
		home(){  
        addMouseListener(this);  
          
        setSize(300,300);    
        setLayout(null);  
        setVisible(true);  
         
    }  
	public void paint(Graphics g) {
		g.setColor(Color.GREEN);  
        g.fillRect(170,100,300,90); 
        g.fillRect(170,200,300,200); 
        g.setColor(Color.BLUE); 
        g.fillRect(270,300,100,100); 
        
	}
		
	public static void main(String args[]) {
		new home();  
	}

	@Override
	public void mouseClicked(MouseEvent e) {
		Graphics g=getGraphics();  
		g.setColor(Color.GREEN);  
        g.fillRect(170,100,300,90); 
        g.fillRect(170,200,300,200); 
        g.setColor(Color.RED); 
        g.fillRect(270,300,100,100);
    }  

	@Override
	public void mousePressed(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mouseReleased(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mouseEntered(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mouseExited(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}
}
