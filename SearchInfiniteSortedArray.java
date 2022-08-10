import java.util.*;
public class SearchInfiniteSortedArray {
    public static void main(String[] args) {
        int arr[] = {1,3,7,9,45,100};
        int t[]= findIndex(arr, 9);
       
        int ans = BinSearch(arr,45,t[0],t[1]);
        System.out.println(ans);
    }
    static int[] findIndex(int arr[],int key)
    {
        int temp[] = new int[2];
        int l = 0;
        int h = 1;
        int i=2;
        while(!(arr[l]<key && arr[h]>key))
        {
            l=h+1;
            i*=2;
            h=h+i;

        }
        temp[0] = l;
        temp[1] = h;
        return temp;
    }

    static int BinSearch(int [] arr,int key,int l,int h)
    {
        int mid = (h+l)/2;
        if(l>h)
            return -1;
        else if(arr[mid] == key)
            return mid;
        else if(arr[mid] > key)
            return BinSearch(arr, key, l, mid-1);
        else
            return BinSearch(arr, key, mid+1, h);

    }
}
