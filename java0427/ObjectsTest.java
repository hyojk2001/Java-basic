import java.util.*;
import static java.util.Objects.*;

public class ObjectsTest {
    public static void main(String[] args) {
        String[][] str2D = new String[][]{{"aaa","bbb"},{"ccc","ddd"}};
        String[][] str2D_2 = new String[][]{{"AAA","BBB"},{"CCC","DDD"}};
        // System.out.println(str2D);
        // System.out.println(str2D_2);
        for(String[] s : str2D){
            System.out.println(Arrays.toString(s));
        }
        for(String[] s : str2D_2){
            System.out.println(Arrays.toString(s));
        }
        System.out.println(str2D.equals(str2D_2));
        System.out.println(Objects.equals(str2D, str2D_2));
    }
}
