package Arrays;
import java.util.Scanner;
public class RemoveDuplicates {
    public static void main(String[] args) {
         Scanner sc=new Scanner(System.in);
         System.out.println("enter the size of array");
        int n=sc.nextInt();
        int arr[]=new int[n];
        System.out.println("Enter the no whose frequency need to be checked");
        
        int uniqueIndex=0;
        System.out.println("enter array elements");
        for(int i=0;i<n;i++)
        {
            arr[i]=sc.nextInt();
        }
        for(int i=1;i<n;i++)
        {
            if(arr[i]!=arr[uniqueIndex])

            {
                uniqueIndex++;
                arr[uniqueIndex]=arr[i];
            }
            
        }
        for(int i=0;i<=uniqueIndex;i++)
        {
            System.out.println(arr[i]+" ");
        }
    }
}
