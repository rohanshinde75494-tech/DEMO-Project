

import java.util.Scanner;

public class pasclesTriangle {
     static int factorial(int fact)
    {
        int ans=1;
        if(fact==0)
        {
            return 1;
        }
        for(int i=1;i<=fact;i++)
        {
            ans=ans*i;
        }
        return ans;
    }
    static int nCr(int n,int r)
    {
        int ncr=factorial(n)/(factorial(n-r)*factorial(r));
        return ncr;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter no of Rows : ");
        int n=sc.nextInt();
        int arr[][]=new int[n][];
        for(int i=0;i<arr.length;i++)
        {
             arr[i] = new int[i + 1];
              for(int j=0;j<=i;j++)
              {
                arr[i][j]=nCr(i,j);
              }
        }
        System.out.println("Pascles Triangle");
        for(int i=0;i<arr.length;i++)
        {
            for(int j=0;j<=i;j++)
            {
                System.out.print(" "+arr[i][j]);
            }
            System.out.println();
        }
    }
}
