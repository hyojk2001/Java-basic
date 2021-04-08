public class ZooKeeper {

    public void feed(Predator predator){
        System.out.println("feed " + predator.getFood());
    }

    public static void main(String[] args) {
        ZooKeeper zookeeper = new ZooKeeper();
        Tiger tiger = new Tiger();  //tiger : Tiger 클래스의 객체이자 Predator 인터페이스의 객체
        Lion lion = new Lion();     //lion : Lion 클래스의 객체이자 Predator 인터페이스의 객체
        Crocodile crocodile = new Crocodile();
        Leopard leopard = new Leopard();
        zookeeper.feed(tiger);
        zookeeper.feed(lion);
        zookeeper.feed(crocodile);
        zookeeper.feed(leopard);
    }
}
