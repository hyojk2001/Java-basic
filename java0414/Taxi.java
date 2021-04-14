public class Taxi implements Meter {
    @Override
    public void start(){
        System.out.println("출발합니다.");
    }

    public int BASE_FARE = 3000;

    @Override
    public int stop(int distance){
        int fare = distance * 2 + BASE_FARE;
        System.out.println("운행을 종료합니다. 요금은 " + fare + " 원 입니다.");
        return fare;
    }

}
