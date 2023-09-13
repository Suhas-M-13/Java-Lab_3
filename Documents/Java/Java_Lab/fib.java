import java.util.*;

public class fib {
    public static void main(String[] args) {
        try (Scanner in = new Scanner(System.in)) {
            int num, i;
            System.out.print("Enter number of terms in series : ");
            num = in.nextInt();
            int a=0, b=1, c;
            for(i=0; i<num; i++)
            {
                System.out.print(a + "\t");
                c = a + b;
                a = b;
                b = c;
            }
            in.close();
        }
        System.out.println();
    }
}