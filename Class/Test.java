public class Test {
    //입력과 출력이 모두 있는 메소드
    public int sum(int a, int b){
        return a+b;
    }

    //입력이 없고 출력만 있는 메소드
    public String say(){
        return "Hi!";
    }

    //입력은 있고 출력은 없는 메소드
    public void sum2(int a, int b){
        System.out.println(a+"과 "+b+"의 합은 "+(a+b)+"입니다");
    }

    //입력도 없고 출력도 없는 메소드
    public void say2(){
        System.out.println("Hi");
    }

    public static void main(String[] args) {
        int a = 3;
        int b = 4;

        Test mytest = new Test();
        int c = mytest.sum(a,b);
        String d = mytest.say();


        System.out.println(c);
        System.out.println(d);
        mytest.sum2(a, b);
        mytest.say2();
    }
    
}
