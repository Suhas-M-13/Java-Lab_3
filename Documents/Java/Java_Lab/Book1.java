import java.util.*;
class Book{
    String title;
    int id;
    float unitprice, totalprice;
    int quantity, i;
    Scanner sc = new Scanner(System.in);
    Book B[]= new Book[2];
    void read(){
        for(i=0;i<2;i++){
            B[i]=new Book();
            System.out.println("Enter the Book Title:");
            B[i].title= sc.next();
            System.out.println("Enter the Book ID:");
            B[i].id= sc.nextInt();
            System.out.println("Enter Book price:");
            B[i].unitprice=sc.nextFloat();
            System.out.println("Enter the Book Quantity:");
            B[i].quantity= sc.nextInt();
        }
    }
    void totalprice(){
        totalprice=unitprice*quantity;
    }
    void display(){
        for(i=0;i<2;i++){
            B[i].totalprice();
            System.out.println(B[i].title+"\t"+B[i].id+"\t"+B[i].unitprice+"\t\t"+B[i].quantity+"\t\t"+B[i].totalprice);
        }
    }
}
public class Book1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Book book=new Book();
        int choice;
        System.out.println("Enter the book details:");
        do{
            System.out.println("1.Read\n2.Dsiplay\n3.Exit\nEnter your choice");
            choice=sc.nextInt();
            switch(choice){
                case 1: book.read();
                break;
                case 2: System.out.println("Title\tID\tUnit Price\tQuantity\tTotalPrice");
                book.display();
                break;
                case 3:System.out.println("...Thank You...");
                break;
                default: System.out.println("Invalid Choice");
            }
        }while(choice!=3);
        sc.close();
    }
}
