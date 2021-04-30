public class quiz11_9 {
    public static void main(String[] args) {
        Dog dog = new Dog("뭉치", "치와와");
        Cat cat = new Cat("마이클", 6);
        System.out.print(dog.name + " ");
        dog.bark();
        System.out.print(cat.name + " ");
        cat.bark();
    }   
}


abstract class Animal{
    String name;
    public Animal(String name){
        this.name = name;
    }
    public abstract void bark();
    public String getName(){
        return name;
    }
}

class Dog extends Animal{
    String type;    //개 종류
    public Dog(String name, String type){
        super(name);
        this.type = type;
    }
    public void bark(){
        System.out.println("멍멍!");
    }
}

class Cat extends Animal{
    int age;
    public Cat(String name, int age){
        super(name);
        this.age = age;
    }
    public void bark(){
        System.out.println("야옹!");
    }
}