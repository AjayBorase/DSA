package Arrays;
import java.util.Scanner;

public class ZeroesToEnd {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
         System.out.println("enter the size of array");
        int n=sc.nextInt();
        int arr[]=new int[n];
        int zeroIndex=0;
        System.out.println("enter array elements");
        for(int i=0;i<n;i++)
        {
            arr[i]=sc.nextInt();
        }
        for(int i=0;i<n;i++)
        {
            if(arr[i]!=0)
            {
                int temp=arr[i];
                arr[i]=arr[zeroIndex];
                arr[zeroIndex]=temp;
                zeroIndex++;
             
            }
             
            
        }
        for(int i=0;i<n;i++)
        
            {
                System.out.println(arr[i]);
            }

       
        
    }
    
}
