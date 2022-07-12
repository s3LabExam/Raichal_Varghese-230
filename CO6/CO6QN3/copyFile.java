package CO6QN3;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;


public class copyFile {

    public static void main(String[] args) throws IOException {
        FileInputStream fileinput = new FileInputStream("C:\\Users\\RAICHAL\\Desktop\\oops_GIT\\CO6\\src\\CO6QN3\\1.txt");

        FileOutputStream fileoutput = new FileOutputStream("C:\\Users\\RAICHAL\\Desktop\\oops_GIT\\CO6\\src\\CO6QN3\\2.txt");

        int i;
        while ((i = fileinput.read()) != -1) {
            fileoutput.write(i);
        }
        System.out.println("Successfully copied one file to another");
        fileinput.close();
        fileoutput.close();
    }
}