package CO5QN5;

import java.awt.*;
import java.awt.event.*;

public class calculator extends Frame implements ActionListener{
	TextField t;
	Panel p;
	char out;
	
	String button[] = {"1","2","3","4","5","6","7","8","9","0","=","+","-","Clr","/","*"};
	Button btn[] = new Button[16];
	int n1=0,n2=0,ans = 0;
	
	public calculator(){
		
		t = new TextField(10);
		
		p = new Panel();
		add(t,"North");
		add(p,"Center");
		p.setLayout(new GridLayout(4,4));
		for(int i=0;i<16;i++) {
			btn[i] = new Button(button[i]);
			btn[i].addActionListener(this);
			p.add(btn[i]);
		}
	}
	
	@Override
	public void actionPerformed(ActionEvent e) {
		String str = e.getActionCommand();
		if(str.equals("*")) {
			out = '*';
			n1 = Integer.parseInt(t.getText());
			t.setText("");
		}
		else if(str.equals("+")) {
			out = '+';
			n1 = Integer.parseInt(t.getText());
			t.setText("");
		}
		else if(str.equals("-")) {
			out = '-';
			n1 = Integer.parseInt(t.getText());
			t.setText("");
		}
		else if(str.equals("/")) {
			out = '/';
			n1 = Integer.parseInt(t.getText());
			t.setText("");
		}
		else if(str.equals("=")) {
			n2 = Integer.parseInt(t.getText());
			
			switch(out) {
				case '+' : ans = n1+n2;break;
				case '*' : ans = n1*n2;break;
				case '-' : ans = n1-n2;break;
				case '/' : ans = n1/n2;break;
				
			}
			t.setText(ans+"");
			ans = 0;
		}
		else if(str.equals("Clr")) {
			t.setText("");
			n1 = n2 = ans = 0;
		}
		else {
			t.setText(t.getText() + str);
		}
		
	}
	
	public static void main(String args[]) {
		calculator c = new calculator();
		c.setTitle("Calculator");
		c.setSize(200,300);
		c.setVisible(true);
	}

}
