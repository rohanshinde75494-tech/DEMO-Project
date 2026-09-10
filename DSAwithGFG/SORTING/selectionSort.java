

public class selectionSort {
    public static void main(String[] args) {
        int nums[]={7,4,1,5,9,32,4,6};
    
        for(int j=0;j<nums.length;j++)
        {
         int    min=j;
        for(int i=j+1;i<nums.length;i++)
        {
            if(nums[i]<nums[min])
            {
                min=i;
            }
        }
        int temp=nums[min];
        nums[min]=nums[j];
        nums[j]=temp;

    }
    for(int ele : nums)
    {
        System.out.print(ele+" ");
    }
}
}
