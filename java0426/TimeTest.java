public class TimeTest {
    public static void main(String[] args) {
        
    }
}

class Time{
    private int hour, minute, second;

    Time(int hour, int minute, int second){
        setHour(hour);
        setMinute(minute);
        setSecond(second);
    }

    public int getHour(){return hour;}
    public void setHour(int hour){
        if(hour < 0 || hoour > 23) return;
        this.hour = hour;
    }
    public int getMinute(){return minute;}
    public void setMin
}
