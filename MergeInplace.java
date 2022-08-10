import java.util.*;
public class MergeInplace {
    public static void main(String[] args) {
        int [] arr = {5,4,3,2,1};
        sort(arr,0,4);
        System.out.println(Arrays.toString(arr));
    }

    static void sort(int [] arr,int l,int h)
    {
        int mid = (h+l)/2;
        if(h-l == 0)
            return;
        else
        {
            sort(arr,l,mid);
            sort(arr,mid+1,h);
            merge(arr,l,mid,h);
        }
    }

    static void merge(int [] arr,int l,int mid,int h)
    {
        int i=l,j=mid+1,k=0;
        int [] arr3 = new int[h-l+1];
        while(i<=mid && j<=h)
        {
            if(arr[i]<arr[j])
            {
                arr3[k] = arr[i];
                i++;
                k++;
            }
            else{
                arr3[k] = arr[j];
                j++;
                k++;
            }
        }
        while(i<=mid)
        {
            arr3[k] = arr[i];
                i++;
                k++;
        }
        while(j<=h)
        {
            arr3[k] = arr[j];
            j++;
            k++;   
        }
        
        int y=0;
        for(int m=l;m<=h;m++)
        {
            arr[m] = arr3[y];
            y++; 
        }
    }
}
