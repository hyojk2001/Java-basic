import java.util.Scanner;

public class CalExercise {
    public static void main(String[] args) {
        System.out.println("구의 겉넓이와 부피를 구합니다.");
        Scanner sc = new Scanner(System.in);

        System.out.print("반지름 : ");
        double r = sc.nextDouble(); 

        final double PI = 3.14;     //final을 붙여서 절대 바뀌지 않도록 한다

        System.out.println("겉넓이는 " + 4.0*PI*r*r + "입니다.");
        System.out.println("부피는 "+ (4/3.0)*PI*r*r*r + "입니다.");


    }
}
