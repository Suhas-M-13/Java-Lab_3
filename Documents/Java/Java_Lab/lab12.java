import java.util.Scanner;
class StackException extends Exception{
    StackException(String str){
        super(str);
    }
}
class Stack{
    private int top;
    private int stk[];
    Stack(int n){
        top=-1;
        stk=new int[n];
    }
    void push(int item) throws StackException{
        if(top==stk.length-1) throw new StackException("Stack Overflow");
        else stk[++top]=item;
    }
    int pop() throws StackException{
        if(top==-1) throw new StackException("Stack Underflow");
        else return stk[top--];
    }
    void display(){
        if(top>-1){
            int i;
            for(i=top;i>=0;i--)
                System.out.println(stk[i]+"\t");
        }
        else System.out.println("No elements");

    }
    void peek(){
        if(top==-1) System.out.println("No element");
        else{
            System.out.println("Peek is "+stk[top]);
        }
    }
}
public class lab12 {
    public static void main(String[] args) {
        int n;
        Scanner sc= new Scanner (System.in);
        System.out.println("Enter size");
        n=sc.nextInt();
        Stack s=new Stack(n);
        int ch;
        do{
            System.out.println("1.push\n2.pop\n3.display\n4.peek\n0.exit\n");
            ch=sc.nextInt();
            switch (ch){
                case 1:try{
                    System.out.println("Enter an element");
                    s.push(sc.nextInt());
                }catch(StackException e){
                    System.out.println("Exception Caught :"+e);

                }
                break;
                case 2:try{
                    System.out.println("popped element "+s.pop());
                }catch(StackException e){
                    System.out.println("Exception Caught :"+e);
                }
                break;
                case 3:s.peek();    break;
                case 4:s.display(); break;
            }


        }while(ch!=0);
    }
}