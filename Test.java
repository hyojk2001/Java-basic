import java.util.ArrayList;

public class Test {
    public static void main(String[] args) {
        // StringBuffer sb = new StringBuffer();   //StringBuffer 자료형은 append라는 메소드를 이용해 계속해서 문자열을 추가할수 있다.
        
        // // sb.append("hello");
        // // sb.append(" ");
        // sb.append("jump to java");
        // sb.insert(0,"Hello ");      //4,5번째 줄과 같은 의미
        // System.out.println(sb.toString());      //toString 메소드를 사용하면 String 형태로 데이터 자료형을 변경 가능하다

        // sb.append("Hello jump to java");
        // System.out.println(sb.substring(0,4));  //substring을 통해 0번째~3번째까지

        // //배열의 속성들 나열
        // String[] weeks = {"월","화","수","목","금","토","일"};
        // for (int i=1; i<weeks.length; i++){
        //     System.out.println(weeks[i]);
        // }

        ArrayList pitches = new ArrayList();
        pitches.add("138");
        pitches.add("129");
        pitches.add("142");
        System.out.println(pitches.size());
        System.out.println(pitches.contains("142"));    //contains는 리스트 안에 항목값 있는지 없는지 판별
        System.out.println(pitches.remove(0));

    }
}
