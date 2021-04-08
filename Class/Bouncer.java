public class Bouncer {
    /*
    public void barkAnimal(Animal animal){
        if(animal instanceof Tiger){            // instanceof : 특정 객체가 특정 클래스의 객체인지를 조사할 때 사용
            System.out.println("어흥");         // animal instanceof Tiger는 animal 객체가 new Tiger로 만들어진 객체인지를 묻는 것
        }else if(animal instanceof Lion){       
            System.out.println("으르렁");
        }
    }
    */

    public void barkAnimal(Barkable animal){
        animal.bark();      //tiger, lion은 각각 Tiger, Lion의 객체이면서 
                            //Animal 클래스의 객체이기도 하고 Barkable, Predator 인터페이스의 객체이기도 하다(=다형성)
    }

    public static void main(String[] args) {
        Tiger tiger = new Tiger();
        Lion lion = new Lion();

        Bouncer bouncer = new Bouncer();
        bouncer.barkAnimal(tiger);
        bouncer.barkAnimal(lion);
    }
}
