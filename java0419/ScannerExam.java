import java.util.Scanner;

public class ScannerExam{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        int i = Integer.parseInt(s);
        System.out.println("입력내용 : " + s);
        System.out.println("num = " + i); 
    }
}