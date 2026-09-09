

import java.util.Scanner;

public class sumrange {
    static void print(int arr[])
    {
        for(int i=0;i<arr.length;i++)
        {
           System.out.print(" "+arr[i]);
        }
        System.out.println();
    }
    static int sumofrange(int arr[],int l,int r)
    {
        int ans=0;
        for(int i=l;i<=r;i++)
        {
            ans=arr[i]+ans;
        }
        return ans;
    }
    
     public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter no of elements of array ");
        int n=sc.nextInt();
        int arr[]=new int[n+1];
        for(int i=1;i<=n;i++)
        {
            arr[i]=sc.nextInt();
        }
        print(arr);
        System.out.print("Enter l = ");
        int l=sc.nextInt();
        System.out.print("Enter r = ");
        int r=sc.nextInt();
        System.out.println("The array is ");
       int ans= sumofrange(arr,l,r);
       System.out.println("The answer is = "+ans);
       


     }    
}
