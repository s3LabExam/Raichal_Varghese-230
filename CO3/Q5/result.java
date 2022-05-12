/*Create classes Student and Sports. Create another class Result inherited from Student and
Sports. Display the academic and sports score of a student*/

import java.util.*;
class sports{
    String sport;
    int participants;
    sports(String sp,int part){
        sport = sp;
        participants = part;
    }
}
class Student extends sports{
    String name;
    String Grade;
    int Sport_score;
    Student(String sp,int part,String nm,String gd,int sc){
        super(sp,part);
        name = nm;
        Grade = gd;
        Sport_score = sc;
    }
}

public class result extends Student {
    result(String sp,int part,String nm,String gd,int sc){
        super(sp,part,nm,gd,sc);
    }
    void display(){
        System.out.println("Sport Details :");
        System.out.println("Sport :"+sport);
        System.out.println("Number of participants :"+participants);
        System.out.println("Name :"+name);
        System.out.println("Grade :"+Grade);
        System.out.println("Sports Score :"+Sport_score);
    }

    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the sport details of the student:");
        String a,d,c;
        int b,e;
        System.out.println("Enter the Sport Name :");
        a = sc.next();
        System.out.println("Enter the number of participants :");
        b = sc.nextInt();
        System.out.println("Enter the Name of Student :");
        c = sc.next();
        System.out.println("Enter the Grade :");
        d = sc.next();
        System.err.println("Enter the Score :");
        e =sc.nextInt();
        sc.close();
        result obj = new result(a,b,c,d,e);
        obj.display();

    }
}
