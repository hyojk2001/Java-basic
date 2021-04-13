public class MyClassExam {
    public static void main(String[] args) {
        MyClass myclass = new MyClass();
        myclass.method1();
        myclass.method2(10);
        myclass.method3();
        
        int value = myclass.method3();
        System.out.println("m3가 리턴한 값 :" + value);
        
        myclass.method4(10,20);

        myclass.method5(55);
        System.out.println("m5 리턴값 : " + myclass.method5(55));
        
    }
    
}
