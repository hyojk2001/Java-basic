// public class quiz14_1 {
//     public static void main(String[] args) {
//         Headphone hp = new Headphone();
//         WearableComputer wc = new WearableComputer();
//         hp.putOn();
//         hp.putOff();
//         wc.reStart();
//     }    
// }

public interface Wearable{
    void putOn();
    void putOff();
    void setVolume();
    void reboot();
}

public class Headphone implements Wearable{
    public void putOn(){
        System.out.println("헤드폰을 착용했습니다");
    }
    public void putOff(){
        System.out.println("헤드폰을 벗었습니다");
    }
    public void setVolume(){
        System.out.println("볼륨을 조정했습니다");
    }
}

public class WearableComputer implements Wearable{
    public void putOn(){
        System.out.println("컴퓨터를 실행했습니다");
    }
    public void putOff(){
        System.out.println("컴퓨터를 껐습니다");
    }
    public void reboot(){
        System.out.println("컴퓨터를 재시작합니다.");
    }    
}