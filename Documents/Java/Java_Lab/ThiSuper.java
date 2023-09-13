class a{
    String s = "Parent";
}
class b extends a{
    String s = "Child";
    void m1(){
        System.out.println(s);
        System.out.println(this.s);
        System.out.println(super.s);
    }
}
public class ThiSuper {
    public static void main(String[] args) {
        b c = new b();
        c.m1();
    }
}