import java.util.Scanner;
class nomatchexception extends Exception{
    nomatchexception(String str){
        super(str);
    }
}
class demo{
    void string(String name) throws nomatchexception{
            if(!name.equalsIgnoreCase("india")){
                    throw new nomatchexception("not matched");
            }
            else
                System.out.println("String is "+name);
    }
}
class nomatch{
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        demo obj=new demo();
        try{
            for(int i=0;i<5;i++){
                String name;
                System.out.println("Enter string: ");
                name=in.next();
                obj.string(name);
            }
        }catch(nomatchexception e){
            System.out.println("Exception Caught: "+e);
        }
    }
}
