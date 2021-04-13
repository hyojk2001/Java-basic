public class AccessObjExam {
    public static void main(String[] args) {
        AccessObj obj = new AccessObj();
        System.out.println(obj.p);
        System.out.println(obj.p2);
        System.out.println(obj.i);  //i는 private이라 같은 폴더상에 있어도 클래스가 다르면 나오지 않는다.
        System.out.println(obj.k);
    }
}
