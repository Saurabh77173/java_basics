import java.util.*;
public class switchcase{   
     public static void main(String args[]){
    Scanner sc= new Scanner (System.in);
    System.out.println("enter 1 for pizza");
    System.out.println("enter 2 for burger");
    System.out.println("enter 3 for mango shake");
    int no=sc.nextInt();
     switch(no){
        case 1: System.out.println("pizza");
        break;
        case 2: System.out.println("burger");
        break;
        case 3: System.out.println("mango shake");
        break;
        default : System.out.println("welcome");

     }  
    }
}