

public class prefixsum {
    static void print(int arr[])
    {
        for(int i=0;i<arr.length;i++)
        {
            System.out.print(" "+arr[i]);
        }
        System.out.println();
    }
    static void prefix(int arr[])
    {
        for(int i=1;i<arr.length;i++)
        {
            arr[i]=arr[i]+arr[i-1];
        }
       
    }
    public static void main(String[] args) {
        int arr[]={1,2,3,4,5};
        print(arr);
        System.out.println("Array after prefix sum");
        prefix(arr);
        print(arr);
    }
}
