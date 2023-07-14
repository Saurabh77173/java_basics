import java.util.*;
public class if_else{
    public static void main(String args[]){
        int age;
        Scanner sc = new Scanner(System.in);
        System.out.println("enter your age..");
        age=sc.nextInt();
        if(age>18){
            System.out.println("you can drive or vote...!");
    
        }
        else{
            System.out.println("you are adult you cannot drive or vote");
        }
    }
}