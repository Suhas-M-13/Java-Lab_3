import java.util.*;
import java.util.Scanner;
class student{
    int rollnumber;
    void readNumber(int n){
        rollnumber=n;
    }
    void printNumber(){
        System.out.println("Roll Number: "+rollnumber);
    }
}
class Test extends student{
    int sub1, sub2;
    void readMarks(int m1, int m2){
        sub1=m1;
        sub2=m2;
    }
    void printMarks(){
        System.out.println("Subject-1 Marks: "+sub1);
        System.out.println("Subject-2 Marks: "+sub2);
    }
    interface sports{
        void readwt(double n);
        void printwt();
    }
    class Results extends Test implements sports{
        double total, sportwt;
        public void readwt(double n){
            sportwt=n;
        }
        public void printwt(){
            System.out.println("Sports weight: "+sportwt);
        }
        void display(){
            total=sub1+sub2+sportwt;
            printNumber();
            printMarks();
            printwt();
            System.out.println("Total Score : "+total);
        }
    }
    public class student_score {
        public static void main(String[] args) {
            Scanner in = new Scanner(System.in);
            System.out.println("Enter number of students: ");
            int n = in.nextInt();
            Results[] s = new Results[n];
            for(int i=0;i<n;i++){
                s[i]=new Results();
                System.out.println("Enter details of Student "+(i+1));
                System.out.println("Roll Number: ");
                s[i]=new Results();
            }
            in.close();
        }
    }
}


