

import java.util.Scanner;

public class sortarray {
    static void sort(int arr[])
    {
        int count=0;
        for(int i=0;i<arr.length;i++)
        {
            if(arr[i]==0)
            {
                count=count+1;
            }
        }
        for(int i=0;i<arr.length;i++)
        {
            if(i<count)
            {
                arr[i]=0;
            }
            else{
                arr[i]=1;
            }
        }
    }
    static void print(int arr[])
    {
        for(int i=0;i<arr.length;i++)
        {
            System.out.print(" "+arr[i]);
        }
    }
  public static void main(String[] args) {
      Scanner sc=new Scanner(System.in);
      int arr[]=new int[7];
      for(int i=0;i<arr.length;i++)
      {
        arr[i]=sc.nextInt();
      }
      sort(arr);
      print(arr);
  }
}
