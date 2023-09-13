//Execute account
import java.util.*;
import java.util.Scanner;

class Account{
    String accno;
    String name;
    long balance;
    String acctype;
    Scanner in = new Scanner(System.in);
    Account(){
        System.out.println("Constructor of Account class is called\n");
    }
    void openAccount(){
        System.out.println("Enter Account Number: ");
        this.accno=in.nextLine();
        System.out.println("Enter Name ");
        this.name=in.nextLine();
        System.out.println("Enter Balance ");
        this.balance=in.nextLong();
        System.out.println("Enter Account type ");
        this.acctype=in.next();
    }
    void showAccount(){
        System.out.println("Acc no.\tName\tBalance\tAcc Type\t");
        System.out.println(this.accno+"\t"+this.name+"\t"+this.balance+"\t"+this.acctype);
    }
    void deposit(){
        long amt;
        System.out.println("Enter the amount you want to deposit: ");
        amt=in.nextLong();
        balance+=amt;
    }
    void withdrawl(){
        long amt;
        System.out.println("Enter the amount you want to withdraw:");
        if(balance>=amt){
            balance-=amt;
        }
        else
        System.out.println("Insufficient Balance");
    }
    boolean search(String acn){
        if(accno.equals(acn)){
            showAccount();
            return true;
        }
        return false;
    }
}

public class BankAccount{
    public static void main(String[]args){
        Scanner in = new Scanner(System.in);
        System.out.println("How many Customers?");
        int n = in.nextInt();
        Account C[]=new Account[n];
        for(int i=0;i<C.length;i++){
        C[i]=new Account();
        C[i]=openAccount();
    }
    int ch;
    do{
        System.out.println("Main Menu\n1.Display\n2.Search by account type\n3.Deposit\n4.Withdral\n5.Exit");
        ch = in.nextInt();
        switch(ch){
            
        }
    }while(ch!=5);
}
}