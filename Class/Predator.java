/*
public interface Predator {

    public String getFood();    
    //인터페이스의 메소드는 메소드의 이름과 입출력에 대한 정의만 있고, 그 내용은 없다
    //인터페이스는 규칙이기 때문이다.
    //인터페이스에 메소드를 정의해놓으면 이 인터페이스를 받는 클래스들은 메소드들을 '반드시' 작성해야한다
    //인터페이스는 다중 상속을 받을 수 있다

}
*/

public abstract class Predator extends Animal{

    public abstract String getFood();

}
// 추상 클래스 : 인터페이스의 역할도 하면서 뭔가 구현체도 가지고 있는 자바의 돌연변이 같은 클래스.