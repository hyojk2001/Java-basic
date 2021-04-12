import java.util.ArrayList;

public class Test implements Runnable{
    int seq;
    public Test(int seq){       //생성자
        this.seq = seq;
    }

    public void run(){
        System.out.println(this.seq + " thread start.");
        try{
            Thread.sleep(1000);
        }catch(Exception e){

        }
    }

    public static void main(String[] args) {
        ArrayList<Thread> threads = new ArrayList<Thread>();
        for(int i=0; i<10; i++){
            Thread t = new Thread(new Test(i));     //객체를 찍어서 스레드 안에 넣는다
            t.start();
            threads.add(t);
        }

        for(int i=0; i<threads.size(); i++){
            Thread t = threads.get(i);
            try{
                t.join();
            }catch(Exception e){
            }
        }
        System.out.println("main end.");
    }
}