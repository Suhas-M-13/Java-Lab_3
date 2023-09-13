import java.util.Scanner;

public class EvenOdd {
    public static void main(String[] args) {
        int num;
        Scanner in = new Scanner(System.in);
        num = in.nextInt();
        if(num % 2 == 0)
        System.out.println(num + " is an Even number");
        else
        System.out.println(num + " is an Odd number");
        in.close();
    }
}