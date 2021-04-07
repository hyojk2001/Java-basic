// 메소드 오버라이딩
// 할아버지 - Animal, 부모 - Dog, 자식 - HouseDog
// 자식은 부모의 메소드 뿐만 아니라 부모가 상속받은 할아버지의 메소드도 사용 가능.
public class HouseDog extends Dog{
    public void sleep(){
        System.out.println(this.name + " zzz in house");
    }
    public void sleep(int hour){        //위의 sleep()과 이름이 같다. 다만 받는 변수가 다른데, 이를 메소드 오버리딩이라 한다.
        System.out.println(this.name + " zzz in house for " + hour + " hours");
    }
    public void sleep(int hour, int min){
        System.out.println(this.name + " zzz in house for " + hour + " hours " + min + " minutes");
    }

    //생성자 : 메소드처럼 보이지만 클래스명과 같은 이름을 쓰고, return이 없다.
    //생성자는 객체가 생성될 때 호출된다. 또한 여러 개의 생성자를 만드는 것도 가능하다.
    public HouseDog(String name){
        this.setName(name);
    }

    public HouseDog(int type){       
        if(type == 1){
            this.setName("yorkshire");
        }else if(type == 2){
            this.setName("bulldog");
        }
    }

    public static void main(String[] args) {
        HouseDog happy = new HouseDog("happy");
        HouseDog yorkshire = new HouseDog(1); 
        System.out.println(happy.name);
        System.out.println(yorkshire.name);
        
        /*
        HouseDog houseDog = new HouseDog();
        houseDog.setName("happy");      //Animal
        houseDog.sleep();               //sleep() 메소드 
        houseDog.sleep(20);             //sleep(int hour) 메소드 호출
        houseDog.sleep(20,30);          //sleep(int hour, int min) 메소드 호출
        //자식과 부모에게 동일한 이름의 메소드가 있을 경우, 자식의 메소드를 실행한다 - 메소드 오버라이딩
        //메소드는 자식의 우선순위가 더 높다
        */


    }
}

//자바는 다중 상속을 지원하지 않는다.
