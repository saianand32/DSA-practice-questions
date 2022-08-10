public class FirstAndLastOccourence {
    public static void main(String[] args) {
        int [] arr = {1,2,2,3,3,4,5,6};
        first(arr,3,0,7,0);
        last(arr,3,0,7,0);
    }

    static void first(int [] arr,int key,int l,int h,int f_ind)
    {
        int mid  = (h+l)/2;
        if(l>h)
            System.out.println("first occourence = "+f_ind);
        else if(arr[mid]>key)
            first(arr,key,l,mid-1,f_ind);
        else if(arr[mid]<key)
            first(arr,key,mid+1,h,f_ind);
        else
            first(arr,key,l,mid-1,mid);
        
    }
    static void last(int [] arr,int key,int l,int h,int l_ind)
    {
        int mid  = (h+l)/2;
        if(l>h)
            System.out.println("last occourence = "+l_ind);
        else if(arr[mid]>key)
            first(arr,key,l,mid-1,l_ind);
        else if(arr[mid]<key)
            first(arr,key,mid+1,h,l_ind);
        else
            first(arr,key,mid+1,h,mid);
    }
    
}
