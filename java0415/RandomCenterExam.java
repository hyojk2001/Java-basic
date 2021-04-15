import java.util.*;

public class RandomCenterExam {    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("정수a : ");
        int a = sc.nextInt();
        System.out.print("정수b : ");
        int b = sc.nextInt();
        System.out.print("정수c : ");
        int c = sc.nextInt();

        int mid = 0;

        if((b>a && c<a) || (b<a && c>a)){
            mid = a;
        }else if((a>b && c<b) || (a<b && c>b)){
            mid = b;
        }else{
            mid = c;
        }

        System.out.println("중앙값은 " + mid + "입니다.");
    }
}
