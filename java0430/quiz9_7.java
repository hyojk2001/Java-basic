import java.util.*;

public class quiz9_7{
    public static void main(String[] args) {
        Period taejo = new Period(new Day(1392,8,5), new Day(1398,10,14));
        System.out.println("태조 = " + taejo);
    }
}

class Period{
    private Day from;
    private Day to;

    public Period(Day from , Day to){
        this.from = new Day(from);
        this.to = new Day(to);
    }
    public Day getFrom(){
        return new Day(from);
    }
    public Day getTo(){
        return new Day(to);
    }
    public String toString(){
        return "{" + from + "~" + to + "}";
    }


}

class Day{
    Day(int from, int to) {
        int from;
        int to;
    }
}