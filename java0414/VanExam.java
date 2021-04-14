public class VanExam {
    public static void main(String[] args) {
        Car c = new Van();      //car는 van보다 상위 개념이다.
        c.run();
        // c.ppangppang();

        Van van = (Van) c;
        van.run();
        van.ppangppang();
    }
}
