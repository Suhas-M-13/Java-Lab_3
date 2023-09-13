import java.util.Scanner;
import java.lang.Math;
public class quadratic {
    public static void main(String[] args) {
        int a, b, c;
        double r1, r2, d;
        System.out.println("Enter a, b and c");
        Scanner in = new Scanner(System.in);
        a=in.nextInt();
        b=in.nextInt();
        c=in.nextInt();
        d=Math.sqrt((b*b)-(4*a*c));
        if(d>0){
            System.out.println("Roots are real and distinct");
            r1=(-b+d)/(2*a);
            r2=(-b-d)/(2*a);
            System.out.println("Roots are "+r1+" and "+r2);
        }
        else if(d==0){
            System.out.println("Rootss are real and equal");
            r1=(-b+d)/(2*a);
            r2=r1;
            System.out.println("Roots are "+r1+" and "+r2);
        }
        else{
            System.out.println("Roots are Imaginary");
            d=Math.sqrt(-((b*b)-(4*a*c)));
            int re;
            Double im;
            re=(-b)/(2*a);
            im=d/(2*a);
            System.out.printf("First Root = "+re+"+"+im+"i");
            System.out.printf("\nSecond Root = "+re+"-"+im+"i");
        }
        in.close();
    }
}