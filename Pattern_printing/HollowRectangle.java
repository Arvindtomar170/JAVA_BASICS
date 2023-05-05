import java.util.Scanner;

public class HollowRectangle{

    public static void main(String[] args){
        int n=8; //heigth
        int m=12;//length 
        for(int i=1;i<=n;i++){
            if(i==1 || i==n)
                for(int j=0;j<m;j++)
                    System.out.print("* ");
            else{
                System.out.print("* ");
                for(int j=0;j<m-2;j++)
                    System.out.print("  ");
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}