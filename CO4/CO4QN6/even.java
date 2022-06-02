package CO4QN6;

public class even extends Thread {
	int n1;
	int n2;
	even(int x,int y){
		n1 = x;
		n2 = y;
	}
	public void run() {
		for(int i=n1;i<=n2;i++ ) {
			if(i%2==0) {
				System.out.println("Even : "+i);
			}
		}
	}
}
