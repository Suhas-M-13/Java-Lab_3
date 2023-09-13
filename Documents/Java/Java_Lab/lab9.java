import java.util.Scanner;
class Employee1{
    Scanner sc=new Scanner(System.in);
    String name,dept;
    double gp,np,bp;
    int id;
    void read(){
        System.out.println("Enter id");
        id=sc.nextInt();
        System.out.println("Name");
        name=sc.next();
        System.out.println("Dept name");
        dept=sc.next();
        System.out.println("Bp");
        bp=sc.nextDouble();
    }
    void gp(){
        gp=bp+(bp*0.16)+(bp*0.58);
    }
    void np(){
        gp();
        double tax;
        if(gp<200000) tax=0;
        else if(gp<300000) tax=(0.10)*gp;
        else if(gp<500000) tax=0.15*gp;
        else{
            tax=0.3*gp;
            tax=tax+(0.02*tax);
        }
        np=gp-tax;
    }
    void display(){
        np();
        System.out.println(id+"\t"+name+"\t"+dept+"\t"+bp+"\t"+gp+"\t"+np);

    }
}
public class lab9 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n,ch;
        System.out.println("Enter number of employees");
        n=sc.nextInt();
        Employee1 e[]=new Employee1[n];
        int i;
        for(;;){
            System.out.println("1.Read\n2.Display\n3.Exit");
            ch=sc.nextInt();
            switch(ch){
                case 1:
                        for(i=0;i<n;i++){
                            e[i]=new Employee1();
                            System.out.println("Employee "+(i+1));
                            e[i].read();
                        }
                        break;
                case 2:
                    System.out.println("id\tname\tdpt\nbasic\tgross\tnet\t");
                    for(i=0;i<n;i++){
                        // e[i].gp();
                        // e[i].np();
                        e[i].display();
                    }
                case 3:
                    System.out.println("Thank you");
                    sc.close();
                    break;
            }
        }
    }
}