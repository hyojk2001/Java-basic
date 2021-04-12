package jump2java.house;


public class Test {
    public void ShouldBeRun(){
        System.out.println("ok thanks.");
    }

    public static void main(String[] args) {
        Test test = new Test();
        int c;
        try{
            c = 4/0;
            test.ShouldBeRun();
        } catch(ArithmeticException e){
            c = -1;
        }finally{       //finally... 구문은 try/catch와 관계없이 '무조건' 실행
            test.ShouldBeRun();
        }
        System.out.println(c);
    }
    
}
