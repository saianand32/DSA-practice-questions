import java.util.*;
import java.lang.*;
public class IntersectionOfArrays {
    public static void main(String[] args) {
        int arr1[] = {12,4,6,8,3};
        int arr2[] = {12,2,1,6,4,12,100,300};

        HashSet <Integer> sai = new HashSet<>();
        List <Integer> list = new ArrayList<>();
        for(int i=0;i<arr1.length;i++)
        {
            sai.add((arr1[i]));
        }
        for(int i=0;i<arr2.length;i++)
        {
            if(sai.contains((arr2[i])) && !list.contains(arr2[i]))
           {
            list.add((arr2[i]));
           }
        }
        System.out.println(list);
    }
}
