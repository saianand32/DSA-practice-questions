import java.util.*;
import java.lang.*;
public class BuySellStock1 {
    public static void main(String[] args) {
        int arr[] = {3,1,4,8,7,2,5};
        int max = maxprofit(arr);
        System.out.println(max);
    }

    static int maxprofit(int [] arr)
    {
        int minval=arr[0];
        int maxprof = 0;
        for(int i=0;i<arr.length;i++)
        {
            minval = Math.min(minval,arr[i]);
                
            
            if((arr[i]-minval) > 0)
            {
                maxprof = Math.max(maxprof,arr[i]-minval);
            }
              
        }

        return maxprof;
    }
}
