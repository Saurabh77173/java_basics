import java.util.*;
public class product{
    public static void main(String[] args){
        int a,b,product;
        Scanner sc = new Scanner (System.in);
        System.out.println("enter the first number ");
        a = sc.nextInt();
        System.out.println("enter the second number ");
        b=sc.nextInt();
        product = a*b;
        System.out.print("Product is ");
        System.out.print(product);
    }
}