
import java.util.Arrays;
public class pairsum {
    public static void main(String[] args) {
        int arr[]={1,2,3,4,5,6};
        int target=6;
        Arrays.sort(arr);
        int i=0;
        int j=arr.length-1;
        while(i<j)
        {
            if(arr[i]+arr[j]==target)
            {
                System.out.println("Pair found: " + arr[i] + ", " + arr[j]);
                break;
            }
            else if(arr[i]+arr[j]<target)
            {
                i++;
            }
            else
            {
                j--;
            }
        }
        }
    }

