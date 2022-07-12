package CO6QN4;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class oddEven
{
    public static void main(String[] args) throws IOException {
        FileInputStream source = new FileInputStream ("C:\\Users\\RAICHAL\\Desktop\\oops_GIT\\CO6\\src\\CO6QN4\\source.txt");
        FileOutputStream destination_odd = new FileOutputStream ("C:\\Users\\RAICHAL\\Desktop\\oops_GIT\\CO6\\src\\CO6QN4\\odd.txt");
        FileOutputStream destination_even = new FileOutputStream ("C:\\Users\\RAICHAL\\Desktop\\oops_GIT\\CO6\\src\\CO6QN4\\even.txt");
        int i;
        while((i = source.read()) != -1){
            if(i%2==0) {

                destination_even.write(i);
            }
            else {
                destination_odd.write(i);
            }
        }
        System.out.println("copied");
        source.close();
        destination_even.close();
        destination_odd.close();



    }

}