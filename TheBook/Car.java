public class Car {
    String name;
    int number;  

    public Car(){
        // this.name = "이름없음";
        // this.number = 0;
        this("이름없음",0);
    }

    public Car(String name){
        // this.name = name;
        // number = 0;
        this(name,0);
    }

    public Car(String name, int number){
        this.name = name;
        this.number = number;
    }

    public void run(){
        System.out.println("RUN");
    }

    public void run(int x){
        System.out.println("차가 " + x +"km 로 달립니다");
    }
}
