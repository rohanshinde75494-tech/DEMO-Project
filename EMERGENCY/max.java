

import java.util.Scanner;

public class max {

static void maxvalue(int arr[],int n,int m)
    {
         if(n==arr.length)
        {
            System.out.println(m);
           
            return;
        } 
        
        if(m<arr[n])
        {
            m=arr[n];
        } 
        maxvalue(arr,n+1,m);

        
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter array");
        int arr[]=new int[6];
        for(int i=0;i<arr.length;i++)
        {
           arr[i]=sc.nextInt();
        }
        int m=0;
        int n=0;
        maxvalue(arr,n,m);
    }
}
