import java.util.*;
import java.lang.*;
class newthread extends Thread{
    Thread t;
    String name1;
    newthread(String name){
        name1=name;
        t=new Thread(this,name1);
        System.out.println("Thread name:  "+t);
    }
    public void run(String s1){
        try{
        for(int i=0;i<5;i++){
            System.out.println(name1+" : "+s1);
            Thread.sleep(1000);
        }
        }catch(InterruptedException e){
            System.out.println("Exception caught: "+e);
        }
        System.out.println("Thread "+name1+" exiting");
    }
}
class threaddemo{
    public static void main(String[] args) {
        newthread n1=new newthread("t1");
        newthread n2=new newthread("t2");
        n1.t.start();
        n2.t.start();
        n1.run("SJCE");
        n2.run("SJCEMVP");
        try{
            for(int i=0;i<5;i++){
                Thread.sleep(1000);
            }
        }catch(InterruptedException e){
            System.out.println("Exception Caught : "+e);
        }
        System.out.println("Main Thread Exiting");
    }
}