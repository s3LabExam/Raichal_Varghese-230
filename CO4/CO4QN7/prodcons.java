package co4qn7;

import java.util.*;

class producer implements Runnable{
	List<Integer>l;
	int  i=0;
	producer(List<Integer>l1){
		l = l1;
	}
	public void run() {
		while(true) {
			try {
				produce(i++);
				if(i==20) break;
				
			}catch(Exception e) {
				System.out.println(e.getMessage());
			}
		}
		
	}
	public void produce(int i) throws Exception {
		synchronized(l) {
			while(l.size()==5) {
				System.out.println("Production full");
				l.wait();
			}
		}
		synchronized(l) {
			System.out.println("Produce"+i);
			l.add(i);
			l.notify();
		}
	}
	
}



class consumer implements Runnable{
	List<Integer>l;
	consumer(List<Integer>l1){
		l = l1;
	}
	public void run() {
		while(true) {
			try {
				consume();
			}catch(Exception e) {
				System.out.println(e.getMessage());
			}
		}
			
	}
		
	public void consume() throws Exception {
		synchronized(l) {
			while(l.isEmpty()) {
				System.out.println("fully consumed");
				l.notify();
				Thread.sleep(500);
				l.wait();
			}
		}
		synchronized(l) {
			Thread.sleep(1000);
			System.out.println("Consumed "+l.remove(0));
		}
	}

}
public class prodcons {
	public static void main(String args[]) {
		List<Integer> l = new ArrayList<Integer>();
		producer p = new producer(l);
		Thread t1 = new Thread(p);
		consumer c = new consumer(l);
		Thread t2 = new Thread(c);
		t1.start();
		t2.start();
	}
}
