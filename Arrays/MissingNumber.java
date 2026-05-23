package Arrays;
import java.util.Scanner;
public class MissingNumber {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the size of array");
        int n=sc.nextInt();
        int arr[]=new int[n];
        int expectedSum = ((n+1)*(n+2))/2;
        int actualSum=0;
        int MissingNumber=0;
        System.out.println("enter array elements");
        for(int i=0;i<n;i++)
        {
            arr[i]=sc.nextInt();
        }
        for(int i=0;i<n;i++)
        {
            actualSum=actualSum+arr[i];
        }
        MissingNumber=expectedSum-actualSum;
        System.out.println("the mssing element is:"+ MissingNumber);
    }
}
