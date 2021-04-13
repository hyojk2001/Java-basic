public class StringMethodExam {
    public static void main(String[] args) {
        // String str = new String("hello");
        String str = "hello";
        System.out.println(str.length());
        System.out.println(str.concat(" world"));   // string 객체.concat(다른 문자열) : 문자열을 붙인다
        System.out.println(str);

        str = str.concat(" world");
        System.out.println(str.substring(3));
        System.out.println(str.substring(3, 6));
    }
    
}
