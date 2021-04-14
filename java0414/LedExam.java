public class LedExam {
    public static void main(String[] args) {
        TV tv = new LedTV();
        tv.turnOn();
        tv.turnOff();
        tv.changeVolume(8);
        tv.changeChannel(39);
    }
}
