
abstract class A{
    abstract void callme();
    void callmetoo(){
        System.out.println("This method is defined inside abstract class A only");
    }
}
class B extends A{
    void callme(){
        System.out.println("Call Me defined inside Class B");
    }
}
public class Abstract {
    public static void main(String[] args) {
        B b = new B();
        b.callmetoo();
        b.callme();
    }
}