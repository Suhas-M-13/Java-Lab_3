import java.util.Scanner;
class Book1{
    Scanner sc =new Scanner (System.in);
    String nameb;
    int code,quantity;
    double unitp,totalp;
    void read(){
        System.out.println("Enter the name of the book");
        nameb=sc.nextLine();
        System.out.println("Enter the code");
        code=sc.nextInt();
        System.out.println("Enter the unit price");
        unitp=sc.nextDouble();
        System.out.println("Enter the total quantity of book");
        quantity=sc.nextInt();
    }
    void total(){
        totalp=unitp*quantity;
    }
    void display(){
        System.out.println(nameb+"\t"+code+"\t"+unitp+"\t"+quantity+"\t"+totalp);
    }
}
public class lab8 {
    public static void main(String[] args) {
        int ch,n;
        Scanner sc =new Scanner (System.in);
        System.out.println("Enter the number of books");
        n=sc.nextInt();
        int i;
        Book1 b[]=new Book1[n];
        for(;;){
            System.out.println("1.Read\n2.Display\n3.Exit");
            ch=sc.nextInt();
            switch (ch){
                case 1:for(i=0;i<n;i++){
                    b[i]=new Book1();
                    System.out.println("Enter book "+(i+1)+" details");
                    b[i].read();
                }
                break;
                case 2:
                        System.out.println("Name\tCode\tUnitprice\tquantity\ttotalprice");
                        for(i=0;i<n;i++){
                            b[i].total();
                            b[i].display();
                        }
                        break;
                case 3:
                    System.out.println("Thank YOU");
                    sc.close();
                    break;
                }
            }
        }
    }