/*Find the percentage of marks obtained by a student in 5 subjects. Display a happy face if
he secures above 50% or a sad face if otherwise.*/

package CO5QN3;
import java.util.*;
import java.applet.*;
import java.awt.*;


public class face extends Applet {
	public void paint(Graphics g) {
		Scanner sc = new Scanner(System.in);
		double mark;
		System.out.println("Enter the percentage of marks obtained :");
		mark = sc.nextDouble();
		if(mark>50) {
			g.drawOval(40,40,120,150);
			g.fillOval(65,60,20,50);	
			g.fillOval(115,60,20,50);
			
			//g.drawArc(65,110,70, 70, 150, 220);
			g.fillArc(65,110,70, 70, 150, 220);
			g.setColor(Color.white);
			//g.drawArc(65,100,70, 70, 160, 220);
			g.fillArc(65,100,70, 70, 160, 220);
		}
		else {
			g.drawOval(40,40,120,150);
			g.fillOval(65,60,20,50);	
			g.fillOval(115,60,20,50);
			g.drawArc(60,130,90, 100, 30, 130);
			
		}
	}
}
