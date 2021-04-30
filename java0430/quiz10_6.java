import java.util.*;

public class quiz10_6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("실수값:");
        double a = sc.nextFloat();

        double b = Math.abs(a);
        System.out.println("절댓값:" + b);
        
        double c = Math.sqrt(b);
        System.out.println("제곱근:" + c);

        double d = Math.PI * b * b;
        System.out.println("면  적:" + d);
    }
}
