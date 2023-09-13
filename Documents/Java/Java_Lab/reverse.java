import java.util.Scanner;

public class reverse {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int onum, rnum = 0, r;
        System.out.print("Enter number to reverse : "); 
        onum = in.nextInt();
        while(onum > 0)
        {
            r = onum % 10;
            rnum = rnum * 10 + r;
            onum /= 10;
        }
        System.out.println("Reversed Number = " + rnum);
        in.close();
    }
}