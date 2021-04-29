import java.util.*;

public class quiz7_3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("몇 월입니까(1~12):");
        int m = sc.nextInt();
        System.out.println("해당 월의 계절은 " + printSeason(m) + "입니다.");
    }

    static String printSeason(int m){
        String n = "";
        switch(m){
            case 3: case 4: case 5:
                n = "봄";
                break;
            case 6: case 7: case 8:
                n = "여름";
                break;
            case 9: case 10: case 11:
                n = "여름";
                break;
            case 12: case 1: case 2:
                n = "겨울";
                break;
        }
        return n;
    }
    
}
