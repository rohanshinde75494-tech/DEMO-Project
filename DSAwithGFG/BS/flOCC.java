

public class flOCC {
    public static void main(String[] args) {
        int arr[]={1,2,3,4,5,5,5,6,7,7,8};
        int l=0;
        int t=5;
        int r=arr.length;
        int mid=0;
      for(int i=0;i<r;i++)
      {
        if(arr[i]==t)
        {
            System.out.println(i);
            break;
        }
      }
      for(int  j=r-1;j>=0;j--)
      {
        if(arr[j]==t)
        {
            System.out.println(j);
            break;
        }
      }
    }
}
