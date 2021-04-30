abstract class Animal{
    private String name;
    public Animal(String name){
    this.name = name;
    }
    public abstract void bark();
  
    public String getName() {
      return name;
    }
    public void introduce() {
      System.out.print(toString()+"이다. ");
      bark();
  
    }
    
}
  
  class Dog extends Animal{
    private String type;  //개 종류
    public Dog(String name, String type){ // 생성자
      super(name);this.type = type;
    }
    public void bark() {
      System.out.println("멍멍!");  //짖기
    }
    public String toString() {
      return type + "의 "+getName();
    }
  
}
  
  class Cat extends Animal{
    int age;                          // 고양이의 나이
    public Cat(String name, int age){ // 생성자
      super(name);this.age = age;
    }
      public void bark() {             //짖기
      System.out.println("냐옹!");
    }
      public String toString() {
      return age + "의 "+getName();
    }
}
  
class quiz13_1{
    public static void main(String[] args){
      // Animal x = new Animal(); // 추상 클래스는 인스턴스르 생성할 수 없다. 
    
      Animal[] a = new Animal[2];
      a[0] = new Dog("뭉치","치와와");
      a[1] = new Cat("마이클",7);
    
      for (int i = 0 ; i <a.length ; i++) {
        System.out.println("a["+i+"] =" + a[i]);
      }
      for (int i = 0 ; i <a.length ; i++) {
        System.out.print("a["+i+"] =");
        a[i].introduce();
      }
    }
    }
        