/*
클래스의 최중요 기능 : 객체를 만드는 기능.
객체와 인스턴스
Animal cat = new Animal()이라고 할 때, cat이라는 객체는 Animal의 인스턴스이다.
인스턴스는 특정 객체(cat)가 어떤 클래스(Animal)의 객체인지를 관계 위주로 설명할때 사용.
cat은 '객체', cat은 Animal의 '인스턴스' 라는 표현이 좋다. 즉 인스턴스는 '관계'를 설명할때 쓰인다.
*/

public class Animal{
    String name;    //객체가 이름을 찍을 수 있도록 변수 추가. 객체 변수라고도 한다.
    
    public void setName(String name){
        this.name = name;       //this는 파이썬에서 self를 쓰는 것과 같다.
    }

    // horse 객체 생성해서 이름 nabi
    // rabbit 객체 생성, 이름 mija

    public static void main(String[] args) {
        Animal cat = new Animal();
        cat.setName("persian");     //this.name = "persian"; 이 된다 -> cat.name = "persian"
        System.out.println(cat.name);

        Animal dog = new Animal();
        dog.setName("happy");       //찍어낸 객체는 따로따로 논다. 즉 dog는 cat과는 다르다. dog와 cat의 각각의 name은 공유되지 않는다.
        System.out.println(dog.name);

        Animal horse = new Animal();
        horse.setName("nabi");
        System.out.println(horse.name);

        Animal rabbit = new Animal();
        rabbit.setName("mija");
        System.out.println(rabbit.name);
    }
}