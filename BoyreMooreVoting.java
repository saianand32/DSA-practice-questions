import java.util.*;

public class BoyreMooreVoting{
    public static void main(String[] args) {
        int [] arr = {1,1,6,1};
        majorityElement(arr);
    }

    static void majorityElement(int [] arr)
    {
        int count=1,index = 0;
        for(int i=1;i<arr.length;i++)
        {
            if(count == 0)
            {
                index = i;
                count = 1;
            }

            if(arr[i]==arr[i-1])
                count++;
            else
                count--;
            
        }
       System.out.println(arr[index]);
        count = 0;
        for(int i=0;i<arr.length;i++)
        {
            if(arr[i] == arr[index])
                count++;
        }
        if(count > ((arr.length)/2))
            System.out.println("Majority element is "+arr[index]);
        else
            System.out.println("no majority element");
    }
}