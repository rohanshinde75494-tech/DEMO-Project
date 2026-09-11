

public class b {
   public static void main(String[] args) {
    int arr[]={5,6,8,10,11,45,67};
    int t=11;
    int l=0;
    int r=arr.length-1;
    int mid=0;
    while(l<=r)
    {
        mid=(l+r)/2;

        if(arr[mid]==t)
        {
            System.out.println("Element found at : "+mid);
            break;
         
        }
        else if(arr[mid]<t)
        {
             l=mid+1;
        }
        else{
            r=mid-1;
        }
    }
   }
}
