import java.util.ArrayList;

public class TestIf {
    public static void main(String[] args) {
        int money = 2000;
        boolean hasCard = true;
        // x && y : x와 y가 동시에(and)
        // x || y : x 또는 y가(or)
        // x! : x가 아니다
        if (money >= 3000 || hasCard){
            System.out.println("택시를 타고 가라");
        }else{
            System.out.println("걸어가라");
        }

    }
    
}
