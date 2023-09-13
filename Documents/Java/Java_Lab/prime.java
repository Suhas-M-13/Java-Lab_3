import java.util.*;
public class prime {
    public static void main(String args[]) {
        Scanner in = new Scanner(System.in);
    System.out.print("Enter the number : ");
    int a = in.nextInt();
    int flag = 0;
    for(int i=2; i<Math.sqrt(a); i++)
    {
            if(a%i == 0)
            {
                flag = 1;
                break;
            }
        }
    if(flag == 0)
        {
            System.out.println(a + " is a prime");
        }
    else
    {
        System.out.println(a + " is not a prime number");
    }
    in.close();
        
    }
}