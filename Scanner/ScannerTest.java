import java.util.Scanner;       //scanner를 사용하기 위해서는 클래스를 import 해줘야 한다

public class ScannerTest {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int b = sc.nextInt();
        // System.out.println(sc.next());      //next()는 단어 하나를 읽어들인다

        if (b == 1){
            System.out.println(Math.pow(b,b));
        }else if(b == 2){
            System.out.println(Math.pow(b,b));
        }else if(b == 3){
            System.out.println(Math.pow(b,b));
        }
    }
}
