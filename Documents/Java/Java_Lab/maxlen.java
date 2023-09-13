import java.util.Scanner;
class StringException extends Exception{
    StringException(String str){
        super(str);
    }
}
class stringsp{
    String name;
    Scanner in=new Scanner(System.in);
    void read() throws StringException{
        System.out.println("Enter the String: ");
        name=in.nextLine();
        if(name.length()>25){
            throw new StringException("String exceeds 25 characters!");
        }
    }
    void display(){
        System.out.println("String Entered By You : "+name);
    }
}
class maxlen{
    public static void main(String[] args) {
        stringsp s=new stringsp();
        try{
            s.read();
            s.display();
        }catch(StringException st){
            System.out.println("Exception caught: "+st);
        }
    }
}