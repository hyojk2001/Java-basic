import java.lang.ProcessBuilder.Redirect.Type;
import java.util.ArrayList;

public class TestGeneric {
    public static void main(String[] args) {
        ArrayList<String> aList = new ArrayList<String>();    
        //ArrayList<>에서 <> 안에 형태를 넣어주면 그 형태만 올수 있다.
        //<> 안에 아무것도 넣지 않을 경우 ArrayList 안에 들어가는 형태는 '객체'가 된다.
        System.out.println(aList);
    }
    
}
