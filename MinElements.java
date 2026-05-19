import java.util.Scanner;
public class MinElements {
    public static void main(String s[])
    {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int arr[]=new int[n];
        for(int i=0;i<n;i++)
        {
            arr[i]=sc.nextInt();
        }
        int min=arr[0];
        for(int i=1;i<n;i++)
        {
            if(arr[i]<min){
                min=arr[i];
                
            };
        }
        System.out.println("the min element is:"+min);

    }
    
}
