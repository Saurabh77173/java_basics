import java.util .*;
public class printlargest{
    public static void main(String args[]){
        int a;int b;
        Scanner sc=new Scanner(System.in);
        System.out.println("enter first number");
        a=sc.nextInt();
        System.out.println("enter the second number ");
        b=sc.nextInt();
      if(a>b){
        System.out.println( "first number is greater than second number");
      }
      else if(a==b){
        System.out.println("both numbers are equal");
      }
      else{
        System.out.println("second number  is greater than first number");
      }
    }
}         