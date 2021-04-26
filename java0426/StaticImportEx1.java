import static java.lang.System.out;
import static java.lang.Math.*;

public class StaticImportEx1 {
    public static void main(String[] args) {
        out.println(random());

        out.println("Math.PI : " + PI);
    }
}
// static : 인스턴스와 관계없이 같은 값을 가지며, 하나의 변수를 모든 인스턴스 멤버가 공유해서 사용한다.
// 메서드로 쓸경우 인스턴스를 생성하지 않고도 호출이 가능한 스태틱 메서드가 된다
// static 메서드 내에서는 인스턴스 멤버들을 직접 사용 불가능