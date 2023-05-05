public class Pattern{
    public static void main(String[] args){
        // input n horizontal  2*n-1
        // vertical 2*n
        int n=4;
        for(int i=0;i<n;i++){
            for(int j=0;j<i;j++)
                System.out.print(n-j+" ");
            for(int k=0;k<2*n-2*i-1;k++)
                System.out.print(n-i+" ");
            for(int j=0;j<i;j++)
                System.out.print(n-i+j+1 +" ");
            System.out.println();
        }

        for(int i=n-2;i>=0;i--){
            for(int j=0;j<i;j++)
                System.out.print(n-j+" ");
            for(int k=0;k<2*n-2*i-1;k++)
                System.out.print(n-i+" ");
            for(int j=0;j<i;j++)
                System.out.print(n-i+j+1 +" ");
            System.out.println();
        }

    }
}