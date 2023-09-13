import java.util.*;
class Student{
    Scanner sc=new Scanner(System.in);
    int roll,m1,m2,m3,total;
    void read(){
        System.out.println("Enter the roll no of student");
        roll=sc.nextInt();
        System.out.println("Enter the marks of subject 1");
        m1=sc.nextInt();
        System.out.println("Enter the marks of subject 2");
        m2=sc.nextInt();
        System.out.println("Enter the marks of subject 3");
        m3=sc.nextInt();
    }
    void total(){
        total=m1+m2+m3;
    }
    void display(){
        System.out.println(roll+"\t"+m1+"\t"+m2+"\t"+m3+"\t");
    }
    void totalDisplay(){
        total();
        System.out.println(roll+"\t"+m1+"\t"+m2+"\t"+m3+"\t"+total);
    }
}
class t2_7{
    public static void main(String args[]){
        int ch,n,h1,h2,h3,h;
        Scanner sc=new Scanner (System.in);
        System.out.println("Enter the number of students");
        n=sc.nextInt();
        Student s[]=new Student[n];
        int i;
        for(;;){
            System.out.println("Main menu\n1.read\n2.display\n3.Display Total\n4.subject toppers\n5.total topper\n6.exit");
            ch=sc.nextInt();
            switch(ch){
                case 1:   for(i=0;i<n;i++){
                          s[i]=new Student();
                          System.out.println("Enter the details of student "+(i+1));
                          s[i].read();
                         }
                         break;
                case 2:
                    System.out.println("Rollno\tSub-1\tSub-2\tSub-3\t");
                    for(i=0;i<n;i++){
                        //s[i].total();
                        s[i].display();
                    }
                    break;
                case 3: System.out.println("Rollno\tSub-1\tSub-2\tSub-3\tTotal");
                        for(i=0;i<n;i++){
                            s[i].totalDisplay();
                        }
                        break;
                case 4: h1=s[0].m1;
                        h2=s[0].m2;
                        h3=s[0].m3;
                        for(i=1;i<n;i++){
                            if(s[i].m1>h1)h1=s[i].m1;
                            if(s[i].m2>h2)h2=s[i].m2;
                            if(s[i].m3>h3)h3=s[i].m3;
                        }
                        for(i=0;i<n;i++){
                            if(h1==s[i].m1){
                                System.out.println("The student with roll no "+s[i].roll+" scored highest marks of "+s[i].m1+" in sub1");
                            }
                            if(h2==s[i].m2){
                                System.out.println("The student with roll no "+s[i].roll+" scored highest marks of "+s[i].m2+" in sub2");
                            }
                            if(h3==s[i].m3){
                                System.out.println("The student with roll no "+s[i].roll+" scored highest marks of "+s[i].m3+" in sub3");
                            }
                        }
                        break;
                case 5:h=0;
                    for(i=0;i<n;i++){
                        s[i].total();
                        if(s[i].total>h)h=s[i].total;
                }
                    for(i=0;i<n;i++){
                        if(h==s[i].total){
                            System.out.println("Highest marks scored by rollno "+s[i].roll+" "+s[i].total+" marks");
                        }
                    }
                    break;
                case 6:System.exit(0);
            }
        }
    }
}