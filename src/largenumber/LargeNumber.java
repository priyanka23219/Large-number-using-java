
import java.util.Scanner;
public class LargeNumber {

    public static void main(String[] args) {
      double n1, n2,n3;
      Scanner sc=new Scanner(System.in);
      System.out.println("Enter first number");
      n1=sc.nextDouble();
      System.out.println("Enter second number");
      n2=sc.nextDouble();
      System.out.println("Enter third number");
      n3=sc.nextDouble();
      if(n1>=n2 && n1>=n3)
      {
          System.out.println(n1+"is largest number");
      }
      else if(n2>=n1 && n2>=n3)
      {
          System.out.println(n2+"is largest number");
      }
      else 
      {
          System.out.println(n3+"is largest number");
      }

    }
    
}
