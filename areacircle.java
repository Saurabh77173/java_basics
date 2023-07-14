import java.util.*;
public class areacircle{
    public static void main(String[] args){
        float r,area;
        Scanner sc = new Scanner (System.in);
        System.out.println("enter radius");
        r = sc.nextInt();
        area = 3.14f * r * r;
        System.out.print("area of circle is ");
        System.out.print(area);
    }
}