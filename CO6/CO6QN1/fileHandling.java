package CO6QN1;
import java.io.File;

public class fileHandling {
    static void RecursivePrint(File[] arr, int index, int level)
    {
        if (index == arr.length)
            return;

        for (int i = 0; i < level; i++)
            System.out.print("\t");
 
        if (arr[index].isFile())
            System.out.println(arr[index].getName());
 
        else if (arr[index].isDirectory()) {
            System.out.println("[" + arr[index].getName()+ "]");
 
            RecursivePrint(arr[index].listFiles(), 0,level + 1);
        }
 
        RecursivePrint(arr, ++index, level);
    }
 
    public static void main(String[] args)
    {

        String maindirpath= "E:\\S2\\ADBMS\\M1";
 
        File maindir = new File(maindirpath);
 
        if (maindir.exists() && maindir.isDirectory()) {

            File arr[] = maindir.listFiles();

            System.out.println(
                "Files from main directory : " + maindir);
            System.out.println("**********************************************");
            RecursivePrint(arr, 0, 0);
            
            System.out.println("**********************************************");
            String flist[] = maindir.list();
            int flag = 0;
            if (arr == null) {
                System.out.println("Empty directory.");
            }
            else {

                for (int i = 0; i < flist.length; i++) {
                    String filename = flist[i];
                    if (filename.equalsIgnoreCase("E-R_Model.pdf")) {
                        System.out.println(filename + " found");
                        flag = 1;
                    }
                }
            }
      
            if (flag == 0) {
                System.out.println("File Not Found");
            }
        }
    }
}