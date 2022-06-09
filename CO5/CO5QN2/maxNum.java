package CO5QN2;



import java.awt.*;
import java.applet.*;

public class maxNum extends Applet
{
    TextField text1,text2,text3;
    Frame f = new Frame("Maximum of 3 Numbers");
    public void init(){
        text1 = new TextField(10);
        text2 = new TextField(10);
        text3 = new TextField(10);

        add(text1);
        add(text2);
        add(text3);

        text1.setText("0");
        text2.setText("0");
        text3.setText("0");
    }

    public void paint(Graphics g){
        int a, b, c,result;
        String str;

        g.drawString("Enter value to Check the Maximum of 3 ",10,50);

        str=text1.getText();
        a=Integer.parseInt(str);
        str=text2.getText();
        b=Integer.parseInt(str);
        str=text3.getText();
        c=Integer.parseInt(str);

        g.setColor(Color.blue);
        if (a>b) {
            if (a>c)
                result=a;
            else
                result=c;
        }
        else{
            if (b>c)
                result=b;
            else
                result=c;
        }
        g.drawString("Maximum of 3 No is "+result,10,70);
        showStatus("MAXIMUM OF 3 NUMBERS");
    }

    public boolean action(Event e, Object o){
        repaint();
        return true;
    }
}