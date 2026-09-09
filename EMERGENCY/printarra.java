

import java.util.Scanner;

public class printarra {
     static void recprint(int arr[],int n)
    {
        if(n==arr.length)
        {
            return;
        }
        System.out.println(arr[n]);
        recprint(arr,n+1);
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter array");
        int arr[]=new int[6];
        for(int i=0;i<arr.length;i++)
        {
           arr[i]=sc.nextInt();
        }
        int n=0;
        recprint(arr,n);
    }

}
