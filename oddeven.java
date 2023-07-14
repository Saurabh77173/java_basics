import java.util .*;
public class oddeven{
    public static void main(String args[]){
        int a;
        Scanner sc=new Scanner(System.in);
        System.out.println("enter any number");
        a=sc.nextInt();
      if(a%2==0){
        System.out.println( "number is even");
      }
      else{
        System.out.println("number is odd");
      }
    }
}         