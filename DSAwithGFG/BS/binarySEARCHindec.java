

public class binarySEARCHindec {
    public static void main(String[] args) {
        int arr[]={8,7,6,5,4,3,2,1};
        int i=0;
        int t=7;
        int j=arr.length-1;
        int mid=0;
        while(i<=j)
        {
            mid=(i+j)/2;
            if(arr[mid]==t)
            {
                System.out.println(mid);
                break;
            }
            else if(arr[mid]>=t)
            {
                i=mid+1;
            }
            else{
                j=mid-1;
            }
        }
    }
}
