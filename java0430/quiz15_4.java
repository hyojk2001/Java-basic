import java.util.*;

public class quiz15_4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("문자열 : ");
        String a = sc.next();
        // int[] arr = new int[a.length()];
    
        System.out.print("반대로 읽으면 : ");
        for(int i=a.length()-1; i>=0; i--){
            System.out.print(a.charAt(i));    
        }
        System.out.print(" 입니다.");    
    }
}
