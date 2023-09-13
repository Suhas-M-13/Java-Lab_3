import java.util.Scanner;
public class primeInRange {
    public static void main(String[] args) {
        int n1, n2, temp=0,i,j;
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the Range : ");
        n1 = in.nextInt();
        n2 = in.nextInt();
        for(i=n1;i<=n2;i++){
            temp=0;
            for(j=2;j<i;j++){
                if(i%j==0){
                    temp=1;
                    break;
                }
            }
            if(temp==0)
            {
                System.out.print(i+"\t");
            }
        }
    }
}
