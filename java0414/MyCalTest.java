public class MyCalTest {
    public static void main(String[] args) {
        Calculator cal = new MyCal();
        cal.plus(3,4);
        int i = cal.exec(5, 6);
        System.out.println(i);

        Calculator.exec2(3, 4);     //인터페이스 이름을 사용해서도 유틸리티성을 만들 수 있다
    }
}
