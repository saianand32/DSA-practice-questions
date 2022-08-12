import java.util.*;
import java.lang.*;
public class NthMagicNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the number");
        int n = sc.nextInt();
        int t = n;

        int j = 1;
        int magicNum = 0;
        while(n!=0)
        {
            if((n&1) == 1)
                magicNum+=(Math.pow(5,j));
            
            j++;
            n=n>>1;
        }

        System.out.println("The "+t+" magic number is "+magicNum);


    }
}
