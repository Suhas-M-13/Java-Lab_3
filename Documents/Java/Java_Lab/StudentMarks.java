
import java.util.Scanner;

class Student{
    Scanner sc = new Scanner(System.in);
    String name;
    int m1,m2,m3,total,i,choice,high1,high2,high3,hight;
    Student S[] = new Student[2];
    void read(){
        for(i=0;i<2;i++){
            S[i]=new Student();
            System.out.println("Enter student name:");
            S[i].name=sc.next();
            System.out.println("Enter the marks scored in 3 subjects");
            S[i].m1=sc.nextInt();
            S[i].m2=sc.nextInt();
            S[i].m3=sc.nextInt();
        }
    }
    void display(){
        for(i=0;i<2;i++){
            System.out.println(S[i].name+"\t"+S[i].m1+"\t"+S[i].m2+"\t"+S[i].m3
            );
        }
    }
    void total(){
        total=m1+m2+m3;
    }
    void totalDisplay(){
        for(i=0;i<2;i++){
            S[i].total();
            System.out.println(S[i].name+"\t"+S[i].m1+"\t"+S[i].m2+"\t"+S[i].m3+"\t"+S[i].total);
        }
    }
    void sub1High(){
        int sh1=0;
        high1=S[0].m1;
        for (int i = 1; i < 2; i++) {
            if (high1<S[i].m1) {
                high1=S[i].m1;
                sh1=i;
                break;
            }
        }
        System.out.println("The Student with the highest marks in Subject-1 is "+S[sh1].name);
    }
    void sub2High(){
        int sh2=0;
        high2=S[0].m2;
        for (int i = 1; i < 2; i++) {
            if (high2<S[i].m2) {
                high2=S[i].m2;
                sh2=i;
                break;
            }
        }
        System.out.println("The Student with the highest marks in Subject-2 is "+S[sh2].name);
}
void sub3High(){
    int sh3=0;
    high3=S[0].m3;
    for (int i = 1; i < 2; i++) {
        if (S[i].m3>high3) {
            high3=S[i].m3;
            sh3=i;
            break;
        }
    }
    System.out.println("The Student with the highest marks in Subject-3 is "+S[sh3].name);
}
void highTotal(){
    int hight=0;
    hight=S[0].total;
    for(i=1;i<2;i++){
        if(S[i].total>hight)
        hight=S[i].total;
        if(S[i].total>hight){
            hight=S[i].total;
            hight=i;
            
        }
    }
    System.out.println("The Student with highest marks is "+S[hight].name);
}
}
public class StudentMarks {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int choice;
        Student student = new Student();
        System.out.println("Main Menu\n1.Read\n2.Display\n3.Total\n4.Subject Highest\n5.Highest\n6.Exit");
        do{
            System.out.println("Enter your Choice:");
            choice = sc.nextInt();
            switch (choice) {
                case 1:
                    System.out.println("Enter the details of 2 students");
                    student.read();
                    break;
                case 2:
                System.out.println("Entered Deatils are");
                System.out.println("Name\tSub1\tSub2\tSub3");
                student.display();
                break;
                case 3:
                System.out.println("Name\tSub1\tSub2\tSub3\tTotal");
                student.totalDisplay();
                break;
                case 4:
                student.sub1High();
                student.sub2High();
                student.sub3High();
                break;
                case 5:
                student.highTotal();
                break;

            }
        }while(choice!=6);
        sc.close();
    }
    }

