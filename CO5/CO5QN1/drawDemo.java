package CO5QN1;

import java.applet.Applet;  
import java.awt.*; 
public class drawDemo extends Applet{
	public void paint(Graphics g) {
		g.setColor(Color.red);  
		g.drawOval(10,10, 100, 100);
		g.drawRect(10,120, 100, 100);
		g.drawLine(10,250, 250, 250);
	
	}
}
