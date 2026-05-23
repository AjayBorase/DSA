package Arrays;
import java.util.Scanner;

import javax.sql.rowset.spi.SyncResolver;
public class TwoSum {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the size of array");
        int n=sc.nextInt();
        int arr[]=new int[n];
        System.out.println("Enter element to be found");
        int target=sc.nextInt();
        boolean found=false;
        System.out.println("enter array elements");
        for(int i=0;i<n;i++)
        {
            arr[i]=sc.nextInt();
        }
        for(int i=0;i<n-1;i++)
        {
            for(int j=i+1;j<n;j++)
            {
                if(arr[i]+arr[j]==target)
                {
                    found=true;
                    System.out.println("pair found:"+arr[i]+"and"+arr[j]);
                }
                
            }
        }
        if(found)
        {
            System.out.println("pair found");
        }
        else
        {
            System.out.println("pair not found");
        }
        
    }
}
