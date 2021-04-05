import java.util.HashMap;

public class TestMap {
    public static void main(String[] args) {
        //map은 파이썬의 딕셔너리처럼 키-밸류 로 구성된다
        HashMap<String, String> map = new HashMap<String, String>();
        map.put("people","사람");
        map.put("baseball","야구");
        System.out.println(map.get("people"));          //map의 키값을 입력하여 밸류값을 출력
        System.out.println(map.containsKey("people"));  //map의 키값 중 "검색어" 가 있는지를 확인하고 true/false

    }
}
