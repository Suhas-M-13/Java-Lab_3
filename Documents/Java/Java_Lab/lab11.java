import java.util.Scanner;
class Student1{
    Scanner sc= new Scanner(System.in);
    int roll;
    void read(){
        System.out.println("Enter roll");
        roll=sc.nextInt();
    }
    void dispr(){
        System.out.println("Roll is "+roll);
    }

}
class test1 extends Student1{
    int sub1,sub2;
    void readm(){
        System.out.println("Enter m1 and m2");
        sub1=sc.nextInt();
        sub2=sc.nextInt();
    }
    void dispm(){
        System.out.println("M1 is "+sub1);
        System.out.println("M2 is "+sub2);
    }

}
interface sport{
    public void readw();
    public void dispw();
        }

class  result extends test1 implements sport{
    double swt,total;
    public void readw(){
        System.out.println("Enter sportwt");
        swt=sc.nextDouble();
    }
    public void dispw() {
        System.out.println("Swt is " + swt);
    }
        void disp(){
        total=sub1+sub2+swt;
            System.out.println("Total "+total);
        }

}
public class lab11 {
    public static void main(String[] args) {
        int n;
        Scanner sc=new Scanner(System.in);
        System.out.println("Number of students");
        n=sc.nextInt();
        result r[]=new result[n];
        int i;
        for(i=0;i<n;i++){
            r[i]=new result();
            System.out.println("Enter details of "+(i+1));
            r[i].read();
            r[i].readm();
            r[i].readw();
        }
        for(i=0;i<n;i++){
            System.out.println("Student "+(i+1));
            r[i].dispr();
            r[i].dispm();
            r[i].dispw();
            r[i].disp();
        }

    }
}