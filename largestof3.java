import java.util .*;
public class largestof3{
    public static void main(String args[]){
        int a,b,c;
        Scanner sc =new Scanner(System.in);
        System.out.println("enter first number");
        a=sc.nextInt();
        System.out.println("enter second number");
        b=sc.nextInt();
        System.out.println("enter third number");
        c=sc.nextInt();
        if(a>=b && a>=c){
            System.out.println("first number is greater");
        }
        else if(b>=a && b>=c){
            System.out.println("second number is greater");
        }
        else {
            System.out.println("third number is greater");
        }


    }
}
