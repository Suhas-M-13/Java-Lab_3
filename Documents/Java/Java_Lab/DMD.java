class A{
    void callme(){
        System.out.println("Inside A class");
    }
}
class B extends A{
    void callme(){
        System.out.println("Inside B class");
    }
}
class C extends B{
    void callme(){
        System.out.println("Inside C class");
    }
}
public class DMD {
    public static void main(String[] args) {
    A a = new A();
    B b = new B();
    C c = new C();
    A ref;
    ref = a;
    ref.callme();
    ref = b;
    ref.callme();
    ref = c;
    ref.callme();
    }
}