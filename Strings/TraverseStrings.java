package Strings;
import java.util.Scanner;
public class TraverseStrings {
    public static void main(String[] args) {
      Scanner sc =new Scanner (System.in);
      System.out.println("Enter String");
      String str =sc.next();
      for(int i=0;i<str.length();i++)
      {
        System.out.println(str.charAt(i));
      }

    }
}
