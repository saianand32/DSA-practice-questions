import java.util.*;
import java.lang.*;
public class UniqueIntIn3timesRepeatingArr
{
    public static void main(String[] args) {
        int arr [] = {1,1,1,2,2,2,3,3,3,4,4,4,100,100,100,3465,5,5,5};
        int freqOfRepetition = 3;
       int max = arr[0];
       for(int i=1;i<arr.length;i++)
       {
        if(arr[i]>max)
            max = arr[i];
       }

       int binArr [] = new int [(int)((Math.log((double)max))/Math.log((double)2))+1];
       System.out.println(binArr.length);

       for(int i = 0;i<arr.length;i++)
       {
        int t = arr[i];
        int j=0;
        while(t!=0)
        {
            if((t&1) == 1)
            {
                binArr[j]+=1;
            }
            t = t>>1;
            j++;
        }
    }

    StringBuilder binString = new StringBuilder();

       for(int i=0;i<binArr.length;i++)
       {

        binArr[i] %= freqOfRepetition;
        binString.append(String.valueOf(binArr[i]));
    
        }

        System.out.println("the element repeating only once = "+Integer.parseInt(binString.reverse().toString(),2));



       
    }
}