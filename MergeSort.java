import java.util.*;

public class MergeSort{
    public static void main(String[] args) {
        int [] arr = {5,4,3,2,1};
        arr = sort(arr);
        System.out.println(Arrays.toString(arr));
    }

  static  int [] sort(int [] arr)
    {
        int mid = (arr.length)/2;
        if(arr.length == 1)
            return arr;
        else{
            int arr1[] = sort(Arrays.copyOfRange(arr,0,mid));
            int arr2[] = sort(Arrays.copyOfRange(arr,mid,arr.length));
            return merge(arr1,arr2);
        }
    }

    static int[] merge(int [] arr1, int [] arr2)
    {
        int i=0,j=0,k=0;
        int [] arr3 = new int[arr1.length+arr2.length];
        while(i<arr1.length && j<arr2.length)
        {
            if(arr1[i]<arr2[j])
            {
                arr3[k] = arr1[i];
                i++;
                k++;
            }
            else{
                arr3[k] = arr2[j];
                j++;
                k++;
            }
        }
        while(i<arr1.length)
        {
            arr3[k] = arr1[i];
                i++;
                k++;
        }
        while(j<arr2.length)
        {
            arr3[k] = arr2[j];
            j++;
            k++;   
        }
        return arr3;
    }
}