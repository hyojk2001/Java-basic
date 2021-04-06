public class Test2 {

    int a;      //객체변수 a

    public void vartest(Test2 test){
        test.a++;
    }
    public static void main(String[] args) {
        Test2 mytest = new Test2();
        mytest.a = 1;
        mytest.vartest(mytest);
        System.out.println(mytest.a);  
    }
}
