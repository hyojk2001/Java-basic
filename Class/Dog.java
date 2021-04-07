// 자식클래스 extends 부모클래스
public class Dog extends Animal{
    public Dog(){       //생성시 아무런 기능을 하지 않는 생성자. 이를 디폴트 생성자라고 한다.

    }
    //만약 클래스에 생성자가 하나도 없다면, 컴파일러는 자동으로 위와 같은 디폴트 생성자를 추가한다.
    //하지만 사용자가 만든 생성자가 하나라도 있다면 이런 디폴트 생성자를 만들지 않는다.

    public void sleep(){
        System.out.println(this.name + " zzz");
    }
}
