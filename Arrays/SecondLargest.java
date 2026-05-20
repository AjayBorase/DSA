package Arrays;
import java.util.Scanner;
public class SecondLargest {
    public static void main(String s[])
    {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int arr[]=new int[n];
        for(int i=0;i<n;i++)
        {
            arr[i]=sc.nextInt();
        }
        int max=arr[0];
            
        
        int secondMax=Integer.MIN_VALUE;
        for(int i=1;i<n;i++)
        {
            if(arr[i]>max)
            {
                secondMax=max;
                max=arr[i];
                
            }
            else if(arr[i]>secondMax)
            {
                secondMax=arr[i];
            }
        }
        System.out.println("the second largest element is:"+secondMax);
    }
    
}
