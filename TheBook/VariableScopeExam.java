public class VariableScopeExam {
    int globalScope = 10;
    static int staticVal = 7;

    public void scopeTest(int value){
        int localScope = 20;

        System.out.println(globalScope);
        System.out.println(localScope);
        System.out.println(value);
    }

    public void scopeTest2(int value2){
        System.out.println(globalScope);
        System.out.println(localScope);     //다른 메소드에서 지정된 지역변수는 다른 메소드에서 사용 불가능
        System.out.println(value2);
    }

    public static void main(String[] args) {        //static을 붙이면 클래스를 인스턴스화하지 않아도 static 메서드나 변수를 사용 가능
        System.out.println(staticVal);

        VariableScopeExam v1 = new VariableScopeExam();
        VariableScopeExam v2 = new VariableScopeExam();
        System.out.println(v1.globalScope);
        System.out.println(v2.globalScope);
        v1.staticVal = 50;
        v2.staticVal = 100;
        System.out.println(v1.staticVal);       // static은 저장 공간도 하나밖에 없다. 즉 v1을 찍어도 50이 아닌,
                                                // 마지막으로 초기화한 값인 100이 뜬다
        System.out.println(v2.staticVal);

    }
    
}
