import java.util.*;

public class DownsortExam {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // System.out.print("정수a : ");
        // int a = sc.nextInt();
        // System.out.print("정수a : ");
        // int b = sc.nextInt();
        // int c;
        // if (a < b){
        //     System.out.println("a>=b가 되도록 정렬했습니다");
        //     c = a;
        //     a = b;
        //     b = c;
        // }
        // System.out.println("변수 a는 " + a);
        // System.out.println("변수 b는 " + b);

        System.out.print("정수a : ");
        int a = sc.nextInt();
        System.out.print("정수a : ");
        int b = sc.nextInt();
        System.out.print("정수a : ");
        int c = sc.nextInt();

        System.out.println("a<=b<=c가 되도록 정렬했습니다");

        if(a>b){
            int t=a; a=b;b=t;
        }
        if(b>c){
            int t=b; b=c; c=t;
        }
        if(a>b)



        System.out.println("변수 a는 " + a);
        System.out.println("변수 b는 " + b);
        System.out.println("변수 c는 " + c);
    }
}
