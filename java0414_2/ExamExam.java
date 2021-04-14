public class ExamExam{
    public static void main(String[] args) {
        ExceptionExam ex = new ExceptionExam();
        int num = ex.get50Item(new int[100]);
        System.out.println("array 배열 50번째 요소의 값 :" + num);
    }
}