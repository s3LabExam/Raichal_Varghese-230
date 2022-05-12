import java.util.*;

interface product{
    void data();
}
class Item implements product{
    int total_rate;
    int rate;
    public void get_data(){
        Scanner sc1 = new Scanner(System.in);
        Scanner sc2 = new Scanner(System.in);
        String p_id;
        System.out.println("Enter the p_id");
        p_id = sc1.next();
        String p_name;
        System.out.println("Enter the p_name");
        p_name = sc1.next();
        int quantity;
        System.out.println("Enter the quantity");
        quantity = sc2.nextInt();
        int price;
        System.out.println("Enter the price");
        price = sc2.nextInt();
        rate = quantity* price;
        System.out.println("Total price of the product :" + quantity*price);
    }
}
void total(){
    total_rate+=rate;
    System.out.println("The Net Amount of Products is:" + total_rate);
}


public class bill {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int n;
        int netamount;
        System.out.println("Enter the number of Products :");
        n = sc.nextInt();
        bill ob[] = new bill[n];
        for(int i=0;i<n;i++){
            ob[i] = new bill();
        }
        for(int i=0;i<n;i++){
            ob[i].get_data();
        }
        for(int i=0;i<n;i++){
            n+=ob[i].total();
        }
        System.out.println("The Net Total Amount is :" + n);
        
    }
}
