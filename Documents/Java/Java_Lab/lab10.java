import java.util.Scanner;
abstract class Bank{
    Scanner sc=new Scanner(System.in);
    String type(){
        System.out.println("Enter the type");
        String type=sc.next();
        return type;
    }
    int deposit(){
        System.out.println("Enter term deposit");
        int deposit=sc.nextInt();
        return deposit;
    }
    void credit(String type){
        if(type.equalsIgnoreCase("national")){
            System.out.println("No card");
        }
        else if(type.equalsIgnoreCase("international")){
            System.out.println("Credit card");
        }
        else{
            System.out.println("Invalid Bank Type");
        }
    }
    abstract void getRoi(String type,int depoist);
    abstract void display();
}
class Bank1 extends Bank{
    void getRoi(String type,int deposit){
        if(deposit>=3){
            if(type.equalsIgnoreCase("national")){
                System.out.println("ROI 7%");
            }
            else{
                System.out.println("ROI 8%");
            }
        }
        else{
            System.out.println("Term limit insufficient");
        }
    }
    void display(){
        System.out.println("Bank 1");
        String type=type();
        int deposit=deposit();
        getRoi(type,deposit);
        credit(type);
    }
}
class Bank2 extends Bank{
    void getRoi(String type,int deposit){
        if(deposit>=3){
            if(type.equalsIgnoreCase("national")){
                System.out.println("ROI 7%");
            }
            else{
                System.out.println("ROI 8%");
            }
        }
        else{
            System.out.println("Term limit insufficient");
        }
    }
    void display(){
        System.out.println("Bank 2");
        String type=type();
        int deposit=deposit();
        getRoi(type,deposit);
        credit(type);
    }
}
class Bank3 extends Bank{
    void getRoi(String type,int deposit){
        if(deposit>=3){
            if(type.equalsIgnoreCase("national")){
                System.out.println("ROI 7%");
            }
            else{
                System.out.println("ROI 8%");
            }
        }
        else{
            System.out.println("Term limit insufficient");
        }
    }
    void display(){
        System.out.println("Bank 3");
        String type=type();
        int deposit=deposit();
        getRoi(type,deposit);
        credit(type);
    }
}
class Bank4 extends Bank{
    void getRoi(String type,int deposit){
        if(deposit>=3){
            if(type.equalsIgnoreCase("national")){
                System.out.println("ROI 7%");
            }
            else{
                System.out.println("ROI 8%");
            }
        }
        else{
            System.out.println("Term limit insufficient");
        }
    }
    void display(){
        System.out.println("Bank 4");
        String type=type();
        int deposit=deposit();
        getRoi(type,deposit);
        credit(type);
    }
}
public class lab10 {
    public static void main(String[] args) {
        Bank a=new Bank1();
        Bank b=new Bank2();
        Bank c=new Bank3();
        Bank d=new Bank4();
        Bank ref;
        ref=a;
        ref.display();
        ref=b;
        ref.display();
        ref=c;
        ref.display();
        ref=d;
        ref.display();

    }
}