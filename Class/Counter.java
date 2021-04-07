class Updater{
    /*public void update(int count){        // int형의 변수로 값을 받음
        count++;
    }*/
    public void update(Counter counter){    //Counter라는 클래스의 객체를 전달받음
        counter.count++;
    }
}

//메소드의 입력으로 객체를 전달받는 경우에는 메소드가 입력받은 객체를 그대로 사용하기 때문에
//메소드가 객체의 속성값을 변경하면 메소드 수행 후 객체의 변경된 속성값이 그대로 유지된다

public class Counter {
    int count = 0;
    public static void main(String[] args) {
        Counter mycounter = new Counter();
        System.out.println("before update:" + mycounter.count);
        Updater myupdater = new Updater();
        myupdater.update(mycounter);
        System.out.println("after update:" + mycounter.count);
    }
}
