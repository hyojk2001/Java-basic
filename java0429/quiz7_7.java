import java.util.*;

public class quiz7_7 {
    public static void main(String[] args) {
        System.out.println("왼쪽 아래가 직각인 이등변 삼각형을 표시합니다.");
        Scanner sc = new Scanner(System.in);
        System.out.print("단수는 : ");
        int n = sc.nextInt();
        putStart(n);
    }

    static void putStart(int n){
        for(int i=1; i<=n; i++){
            for (int j=0; j<i; j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
