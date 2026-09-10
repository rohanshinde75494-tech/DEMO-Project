

public class checkSORTEDarray {
    static boolean check(int arr[],int n)
    {
        if(n==arr.length-1)
        {
            return true;
        }
        if(arr[n]>arr[n+1])
        {
            return false;
        }
        return check(arr,n+1);
    }
    public static void main(String[] args) {
        int arr[]={1,2,3,6,5};
        int n=0;
        System.out.println(check(arr,n));
    }
}
