public class Car extends Machine {
    public Car(){
        // super();
        System.out.println("Car의 기본 생성자입니다");
    }

    public void turnOn(){
        System.out.println("시동 on");
    }

    public void turnOff(){
        System.out.println("시동 off");
    }
}
