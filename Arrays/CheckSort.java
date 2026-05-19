package Arrays;
import java.util.Scanner;

public class CheckSort {
    public static void main (String s[])
    {
         Scanner sc=new Scanner(System.in);
         System.out.println("enter the size of array");
        int n=sc.nextInt();
        int arr[]=new int[n];
        boolean sorted=true;
        System.out.println("enter array elements");
        for(int i=0;i<n;i++)

            
        {
            arr[i]=sc.nextInt();
        }
        for(int i=0;i<n-1;i++)
        {
            if(arr[i]>arr[i+1])

            {
                sorted=false;
               break;
            }
            
        }
        if(sorted)
        {
            System.out.println("sorted");
        }
        else{
            System.out.println("not sorted");
        }
    }
}
