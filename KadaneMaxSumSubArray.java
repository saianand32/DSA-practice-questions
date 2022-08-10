import java.util.*;
public class KadaneMaxSumSubArray {
    public static void main(String[] args) {
        int arr [] = {1, 3, -8, -2, 6, 3, 5};
        int ans = maxsum(arr);
        System.out.println(ans);
    }

static int maxsum(int [] arr)
{
    int sum=0;
    int max=0;
    for(int i=0;i<arr.length;i++)
    {
        sum+=arr[i];
        if(sum<0)
            sum=0;
        if(sum>max)
            max = sum;
    }
    return max;
}
}


