import java.util.*;
public class incometax{
    public static void main(String args[]){
    int income;
    Scanner sc=new Scanner(System.in);
    System.out.println("enter your income");
    income=sc.nextInt();
    int tax=0;
    if(income<500000){
    System.out.println("you have tax rs   80"+ tax);
    }

    else if(income>500000 && income<=1000000){
      tax=(int)(income*0.2);
      System.out.println("you have tax rs "+tax);
    }
    else if(income>1000000){
     tax=(int)(income*0.3);
        System.out.println("you have tax rs "+tax);
    }
    }
}