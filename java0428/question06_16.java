import java.util.*;

public class question06_16 {
    public static void main(String[] args) {
        Random rand = new Random();
        int r = rand.nextInt(6);
        Scanner sc = new Scanner(System.in);

        String[] dayKor = {"일요일","월요일","화요일","수요일","목요일","금요일","토요일"};
        String[] dayEng = {"sunday","monday","tuesday","wednesday","thursday","friday","saturday"};

        System.out.println("요일명을 영어 소문자로 입력하세요.");

        int last = -1;  //이전 요일
        int retry;
        do{
            int day;
            do{
                day = rand.nextInt(7);
            }while(day == last);

            last = day;
            while(true){
                System.out.print(dayKor[day] + " : ");
                String s = sc.next();

                if(s.equals(dayEng[day])) break;    //정답일 경우
                System.out.println("틀렸습니다. ");
            }
            System.out.print("정답입니다. 다시 한번? 1..Yes/0..No : ");
            retry = sc.nextInt();

        }while(retry == 1);
        
    }
}
