public class ifexam {
    public static void main(String[] args) {
        // int base = 180;
        // int height = 185;
    
        // boolean isTall = height > base;
    
        // if(isTall){
        //     System.out.println("키가 큽니다.");
        // }       
        String a = "hello";
        String b = "java";
        String c = "hello";
        
        System.out.println(a.equals(b));        //문자 자체가 같은지 판별할 때는 equals() 메소드를 사용
        System.out.println(a.equals(c));
        System.out.println(a == c);             // 문자 a와 c는 '주소가 같다'

        String d = new String("hello");         

        System.out.println(a == d);             // a의 'hello'와는 '다른 주소에 들어가 있다'. 그래서 false 이다.
        System.out.println(a.equals(d));        // 문자 자체를 비교하였으므로 true이다.
        
        System.out.println();
        System.out.println(System.identityHashCode(a));
        System.out.println(System.identityHashCode(c));
        System.out.println(System.identityHashCode(d));
    }
}
