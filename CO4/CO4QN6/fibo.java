package CO4QN6;

public class fibo implements  Runnable{
    int n1;
    int n2;
    int num =0;
    int x = 0;
    int y = 1;
    fibo(int l,int u){
        n1 = l;
        n2 = u;
    }
    @Override
    public void run() {
        System.out.println("fibannoci = "+0);
        System.out.println("fibannoci = "+1);
        while (num < n2-1) {
            num = x + y;
            if ((num >= n1)&&(num<=n2)) {
                System.out.println("fibannoci = "+num);
            }
            x = y;
            y = num;
        }

    }
}