

public class moveZEROStoend {
    static void moveZeros(int arr[]) {
        int i=0;
        int j=arr.length-1;
        while(i<j)
        {
            if(arr[i]==0)
            {
                int temp=arr[i];
                arr[i]=arr[j];
                arr[j]=temp;
                j--;
            }
            else
            {
                i++;
            }
        }
    }
    public static void main(String[] args) {
           int arr[]={1,0,2,0,3,0,4};
           moveZeros(arr);
           for(int ele : arr)
           {
               System.out.print(ele+" ");
           }
    }
}