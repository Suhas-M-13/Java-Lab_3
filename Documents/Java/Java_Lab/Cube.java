import java.util.Scanner;

class CUBE_{
    Scanner in = new Scanner(System.in);
    int i;
    int a[]=new int[3];
    double side, vol, out_ar;
    void read(){
        for(i=0;i<3;i++){
            System.out.println("Enter the side of "+(i+1)+" cube");
            a[i]=in.nextInt();
        }
    }
    void calculate(){
        for(i=0;i<3;i++){
            vol=a[i]*a[i]*a[i];
            out_ar=6*a[i]*a[i];
            System.out.println("Volume of Cube "+(i+1)+" is "+vol+"\nSurface area is "+out_ar);
        }
    }
}

public class Cube {
    public static void main(String[] args) {
        CUBE_ cube=new CUBE_();
        cube.read();
        cube.calculate();
    }
}