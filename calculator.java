import java.util.*;
public class calculator{
   public static void main(String args[]){
      Scanner sc=new Scanner(System.in);
      int a,b,c;
      char operator;
      System.out.println("enter the first number");
      a=sc.nextInt();
      System.out.println("enter the second number");
      b=sc.nextInt();
      System.out.println("enter the operator");
      operator=sc.next().charAt(0);
      switch(operator){
         case '+': c=a+b;
         System.out.println("the addition is "+c);
         break;
         case '-': c=a-b;
         System.out.println("the substraction is "+c);
         break;
         case '*':c=a*b;
         System.out.println("the multiplication is "+c);
         break;
         case '/': c=a/b;
         System.out.println("the division is "+c);
         break;
         case  '%': c=a%b;
         System.out.println("the modulus is "+c);
         break;
         default:
         System.out.println("wrong operator");
         break;
      }
   }
}