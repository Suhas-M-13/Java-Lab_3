
//Merging arrays and neglecting the duplicate elements.
import java.util.Scanner;
class MergeArr{
    public static void mergearr(int a[], int b[], int n1, int n2, int c[]){
        int i=0,j=0,k=0;
        while(i<n1 && j<n2){
            if(a[i]==b[j])
            {
                c[k++]=a[i++];
                j++;
            }
            else if(a[i]<b[j]){
                c[k++]=a[i++];
            }
            else{
                c[k++]=b[j++];
            }
        }
        while(i<n1){
            c[k++]=a[i++];
        }
        while(j<n2){
            c[k++]=b[j++];
        }
        
    }
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in); 
            int n1,i,n2;
            System.out.println("Enter n1");
            n1=in.nextInt();
            int a[]= new int[n1];
            System.out.println("Enter Array elements");
            for(i=0;i<n1;i++)
                a[i]=in.nextInt();
            System.out.println("Enter n2");
            n2=in.nextInt();
            int b[]= new int[n2];
            System.out.println("Enter Array elements");
            for(i=0;i<n2;i++)
                b[i]=in.nextInt();
            int c[]= new int[n1+n2];
            mergearr(a, b, n1, n2, c);
            System.out.println("Merged Array Is:");
            int n = (n1+n2);
            for(i=0;i<n;i++)
            {
                if(c[i]!=0)
                System.out.println(c[i]+" ");
            }
            in.close();
        }
        
    }
