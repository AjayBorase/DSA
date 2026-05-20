package Arrays;
import java.util.Scanner;
public class CheckEvenOdd
{
    public static void main(String s[])
    {
         Scanner sc=new Scanner(System.in);
         System.out.println("enter the size of array");
        int n=sc.nextInt();
        int arr[]=new int[n];
        int EvenCount=0;
        int OddCount=0;
        
        System.out.println("enter array elements");
        for(int i=0;i<n;i++)
        {
            arr[i]=sc.nextInt();
        }
        for(int i=0;i<n;i++)
        {
            if(arr[i]%2==0)
            {
                EvenCount++;
            }
            else{
                OddCount++;
            }
        }
        System.out.println("there are"+EvenCount+"even numbers");
        System.out.println("there are"+OddCount+"odd numbers");

    }
}