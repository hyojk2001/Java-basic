import java.util.*;

public class FlowEx11 {
    public static void main(String[] args) {
        System.out.println("당신의 주민번호를 입력하세요.(011231-1111222)>");

    Scanner scanner = new Scanner(System.in);
    String regNo = scanner.nextLine();
    char gender = regNo.charAt(7);

    switch(gender){
        case '1': case '3':
            switch(gender){
                case '1':
                    System.out.println("2000년대 이전에 출생한 남자");
                    break;
                case '3':
                    System.out.println("2000년애 이후에 출생한 남자");
            }
            break;
        case '2': case '4':
            switch(gender){
                case '2':
                    System.out.println("2000년대 이전에 출생한 여자");
                    break;
                case '4':
                    System.out.println("2000년대 이후에 출생한 여자");
                    break;
            }
            break;
        }
    }
}
