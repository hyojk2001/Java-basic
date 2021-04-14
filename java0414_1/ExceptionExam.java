public class ExceptionExam {
    public static void main(String[] args) {
        int i = 10;
        int j = 0;
        try{
            int k = i/j;
            System.out.println(k);
        }catch(Exception e){        //모든 예외는 Exception 클래스에서 상속받는다.
            System.err.println("0으로 나눌 수 없습니다." + e.toString());
        }finally{
            System.out.println("예외 상관 없이 무조건 실행.");
        }
    }
}
