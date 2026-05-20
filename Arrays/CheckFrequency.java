package Arrays;

import java.util.Scanner;

public class CheckFrequency {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
         System.out.println("enter the size of array");
        int n=sc.nextInt();
        int arr[]=new int[n];
        System.out.println("Enter the no whose frequency need to be checked");
        int target=sc.nextInt();
        int freqCount=0;
        System.out.println("enter array elements");
        for(int i=0;i<n;i++)
        {
            arr[i]=sc.nextInt();
        }
        for(int i=0;i<n;i++)
        {
            if(arr[i]==target)
            {
                freqCount++;
            }
        }
        System.out.println("The element"+" "+target+" "+"appears"+" "+freqCount+" "+"times in the array");

    }
}
