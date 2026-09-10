

public class bubbleSORT {
     static void bubble(int arr[])
     {
        for(int i=1;i<arr.length;i++)
        {
            int j=i;
            while(j>0 && arr[j]<arr[j-1])
            {
                int temp=arr[j];
                arr[j]=arr[j-1];
                arr[j-1]=temp;
                j--;
            }
        }
     }
      public static void main(String[] args) {
        int arr[]={3,4,1,5,2};
        bubble(arr);
        for(int ele : arr)
        {
            System.out.print(ele+" ");
        }
      }
}
