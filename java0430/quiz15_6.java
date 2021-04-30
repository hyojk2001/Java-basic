import java.util.*;

public class quiz15_6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("문자열 s1:");
        String s1 = sc.next();        
        System.out.print("문자열 s2:");        
        String s2 = sc.next();        

        System.out.println(s1);
        int idx = s1.indexOf(s2);
        if(idx == -1){
            System.out.println("s1 안에 s2가 포함되어 있지 않습니다");
        }
        else{
            for(int i=0; i<idx; i++) System.out.print(" ");
            System.out.println(s2);
        }
    }
}
