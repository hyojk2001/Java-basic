import static java.lang.Math.*;
import static java.lang.System.*;

public class MathEx4 {
    public static void main(String[] args) {
        double val = 90.7552;
        System.out.println(round(val));
        
        val *= 100;
        System.out.println(round(val));
        System.out.println(round(val)/10.0);
        System.out.println(round(val)/100.0);
        System.out.println(ceil(1.1));
        System.out.println(floor(1.5));
        System.out.println(rint(1.5));
        System.out.println(round(-1.5));
        
        
    }
}
